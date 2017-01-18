package lisc.appproject.shouyefragment.newsFragment.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.newsFragment.dapter.NewsFragmentAdapter;
import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.appproject.shouyefragment.newsFragment.presenter.Presenter_news;
import lisc.lilibrary.mvp.MvpFragment;
import lisc.lilibrary.mvp.ibase.IBaseView;


/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 14:12
 */

public class NewsFragment extends MvpFragment<Presenter_news> implements IVIew_news {

    private RecyclerView recyclerView;
    private NewsFragmentAdapter adapter;

    @Override
    public void onNewSuccess(Bean_news beanNews) {
        adapter = new NewsFragmentAdapter(getActivity(),beanNews);
        recyclerView = (RecyclerView) mRootView.findViewById(R.id.recycleview_news);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
//        adapter.
        Toast.makeText(getActivity(), "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNewFail(String err) {
        Toast.makeText(getActivity(), "Fail", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected Presenter_news createPresenter(IBaseView view) {
        return new Presenter_news(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_news;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter.data();
    }
}
