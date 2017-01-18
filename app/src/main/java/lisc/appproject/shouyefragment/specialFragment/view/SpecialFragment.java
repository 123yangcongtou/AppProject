package lisc.appproject.shouyefragment.specialFragment.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.specialFragment.adapter.SpecialFragmentAdapters;
import lisc.appproject.shouyefragment.specialFragment.bean.Bean_Special;
import lisc.appproject.shouyefragment.specialFragment.presenter.Presenter_special;
import lisc.appproject.shouyefragment.specialitemActivity.view.SpecialActivity;
import lisc.lilibrary.mvp.MvpFragment;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 2.创建时间：2017/1/3 14:13
 */

public class SpecialFragment extends MvpFragment<Presenter_special> implements IView_special {

    private RecyclerView rv;
    private SpecialFragmentAdapters adapter;

    @Override
    public void onSPSuccess(final Bean_Special beanSpecial) {
        rv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        adapter = new SpecialFragmentAdapters(getActivity(), beanSpecial);
        rv.setAdapter(adapter);
        adapter.SetOnItemClick(new SpecialFragmentAdapters.OnItemClickListener() {
            @Override
            public void ItemClickListener(View v, int position) {
                Intent intent=new Intent(getActivity(), SpecialActivity.class);
                intent.putExtra("id",beanSpecial.data.get(position).id+"");
                Log.e("id========",beanSpecial.data.get(position).id+"");
                startActivity(intent);
            }
        });

    }

    @Override
    public void onSpFail() {

    }

    @Override
    protected Presenter_special createPresenter(IBaseView view) {
        return new Presenter_special(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_special;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        rv = (RecyclerView) mRootView.findViewById(R.id.recycleview_special);
        mPresenter.data();

    }
}
