package lisc.appproject.tvActivityTitle.view;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import lisc.appproject.R;
import lisc.appproject.tvActivityTitle.adapter.TvFragmentAdapter;
import lisc.appproject.tvActivityTitle.bean.Bean_Title;
import lisc.appproject.tvActivityTitle.presenter.Presenter_Title;
import lisc.appproject.tvfragment.otherFragment.view.OtherFragment;
import lisc.appproject.tvfragment.yanzhikongFragment.view.Yanzhikong_Fragment;
import lisc.lilibrary.mvp.MvpActivity;
import lisc.lilibrary.mvp.ibase.IBaseView;

public class TVTitleActivity extends MvpActivity<Presenter_Title> implements IView_Title{


    private Toolbar toolbar;
    private TabLayout tablayout;
    private ViewPager viewpager;
    private TvFragmentAdapter adapter;
    private ArrayList<Fragment> list;

    @Override
    public void onTitleSuccess(List<Bean_Title> beanTitles) {
        list = new ArrayList<>();
        for( int i = 0 ; i < beanTitles.size() ; i++ ){
            tablayout.addTab(tablayout.newTab().setText(beanTitles.get(i).name));
            switch (i){
                case 0:
                    list.add(new Yanzhikong_Fragment());
                    break;
                default:
                    String s = "2F" + beanTitles.get(i - 1).slug;
                    Log.e("name-------"+(i-1),s);
                    OtherFragment otherFragment=new OtherFragment();
                    Bundle bundle=new Bundle();
                    bundle.putString("name",s);
                    otherFragment.setArguments(bundle);
                    list.add(otherFragment);
                    break;
            }
        }
        adapter = new TvFragmentAdapter(getSupportFragmentManager(), this, beanTitles,list);
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);
        tablayout.setTabsFromPagerAdapter(adapter);
        Toast.makeText(this, "成功。。。。", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTitleFail(String err) {
        Toast.makeText(this, "Fail"+err.toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected Presenter_Title createPresenter(IBaseView view) {
        return new Presenter_Title(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.allperson_activity;
    }

    @Override
    public void initVariables() {

    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        toolbar = (Toolbar) findViewById(R.id.toolbar_tv_main);
        tablayout = (TabLayout) findViewById(R.id.tablayout_tv_main);
        viewpager = (ViewPager) findViewById(R.id.viewpager_tv_main);
        toolbar.setTitle("全民TV");
        toolbar.setTitleTextColor(Color.WHITE);
        mPresenter.ondata();
        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

}
