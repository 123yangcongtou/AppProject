package lisc.appproject.tvfragment.otherFragment.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.pili.pldroid.player.widget.PLVideoView;

import lisc.appproject.R;
import lisc.appproject.tvfragment.atNowvideo.view.VideoActivity;
import lisc.appproject.tvfragment.otherFragment.adapter.OtherAdapter;
import lisc.appproject.tvfragment.otherFragment.bean.Bean_other;
import lisc.appproject.tvfragment.otherFragment.presenter.Presenter_other;
import lisc.lilibrary.mvp.MvpFragment;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 16:22
 */

public class OtherFragment extends MvpFragment<Presenter_other> implements IView_other{


    private RecyclerView rv;
    private OtherAdapter adapter;

    @Override
    public void onOtherSuccess(final Bean_other beanOther) {
        rv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        adapter = new OtherAdapter(getActivity(),beanOther);
        rv.setAdapter(adapter);
        adapter.setOnOtheritemlistener(new OtherAdapter.OnOtheritemListener() {
            @Override
            public void setOtheritemListener(View v, int position, ImageView thumb, PLVideoView video) {
//                Toast.makeText(getActivity(), beanOther.data.get(position).nick, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getActivity(), VideoActivity.class);
                intent.putExtra("uid",beanOther.data.get(position).uid);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onOtherFail() {

    }

    @Override
    protected Presenter_other createPresenter(IBaseView view) {
        return new Presenter_other(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_other;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        String name = getArguments().getString("name");
        rv=  (RecyclerView) mRootView.findViewById(R.id.recyclewiew_other);

        mPresenter.initData(name);
    }
}
