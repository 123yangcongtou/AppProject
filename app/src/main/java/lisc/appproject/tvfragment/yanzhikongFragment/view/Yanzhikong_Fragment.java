package lisc.appproject.tvfragment.yanzhikongFragment.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lisc.appproject.R;
import lisc.appproject.tvfragment.yanzhikongFragment.adapter.YzkFragmentAdapter;
import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;
import lisc.appproject.tvfragment.yanzhikongFragment.presenter.Presenter_Yanzhikong;
import lisc.lilibrary.mvp.BaseFragment;
import lisc.lilibrary.mvp.MvpFragment;
import lisc.lilibrary.mvp.ibase.IBaseView;


/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:19
 */

public class Yanzhikong_Fragment extends MvpFragment<Presenter_Yanzhikong> implements IView_Yanzhikong{

    private RecyclerView rv;
    private YzkFragmentAdapter adapter;

    @Override
    public void onYzkSuccess(Bean_Yanzhikong beanYanzhikong) {
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new YzkFragmentAdapter(getActivity(),beanYanzhikong);
        rv.setAdapter(adapter);
    }

    @Override
    public void onYzkFail(String err) {

    }

    @Override
    protected Presenter_Yanzhikong createPresenter(IBaseView view) {
        return new Presenter_Yanzhikong(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_yanzhikong;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        rv = (RecyclerView) mRootView.findViewById(R.id.recycleview_yzk);
        mPresenter.ondata();
    }

}
