package lisc.appproject.shouyefragment.weixinFragment.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.weixinFragment.bean.Bean_Weixin;
import lisc.appproject.shouyefragment.weixinFragment.dapter.WeixinFragmentAdapter;
import lisc.appproject.shouyefragment.weixinFragment.presenter.Presenter_Weixin;
import lisc.lilibrary.mvp.MvpFragment;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 2.创建时间：2017/1/3 14:12
 * http://api.tianapi.com/wxnew?key=09691a96d0c41d30215a888632e1b96e&num=10&page=1
 */

public class WeixinFragment extends MvpFragment<Presenter_Weixin> implements IView_Weixin {

    private RecyclerView rv;
    private TwinklingRefreshLayout refreach;
    private WeixinFragmentAdapter adapter;

    @Override
    public void onWXSuccess(final Bean_Weixin beanWeixin) {
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new WeixinFragmentAdapter(getActivity(), beanWeixin);
        rv.setAdapter(adapter);
        refreach.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onRefresh(TwinklingRefreshLayout refreshLayout) {
                super.onRefresh(refreshLayout);
                mPresenter.onup();
                refreach.finishRefreshing();
            }

            @Override
            public void onLoadMore(TwinklingRefreshLayout refreshLayout) {
                super.onLoadMore(refreshLayout);
                mPresenter.ondown();
                refreach.finishLoadmore();
            }
        });
        //条目点击事件
        adapter.setOnItemClickListener(new WeixinFragmentAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Toast.makeText(getActivity(), "你点击了" +beanWeixin.newslist.get(position).title, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getActivity(),WeixinActivity.class);
                intent.putExtra("url",beanWeixin.newslist.get(position).url);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onWXFail() {

    }

    @Override
    protected Presenter_Weixin createPresenter(IBaseView view) {
        return new Presenter_Weixin(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_weixin;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        refreach = (TwinklingRefreshLayout) mRootView.findViewById(R.id.refreshLayout);
        rv = (RecyclerView) mRootView.findViewById(R.id.recycleview_weixin);
        mPresenter.onup();
    }
}
