package lisc.appproject.tvActivityTitle.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import lisc.appproject.tvActivityTitle.bean.Bean_Title;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 16:25
 */
public class TvFragmentAdapter extends FragmentPagerAdapter{
    private final FragmentManager supportFragmentManager;
    private final Context context;
    private final List<Bean_Title> beanTitles;
    private final List<Fragment> list;


    public TvFragmentAdapter(FragmentManager fm, Context context, List<Bean_Title> beanTitles, ArrayList<Fragment> list) {
        super(fm);
        this.supportFragmentManager = fm;
        this.context = context;
        this.beanTitles = beanTitles;
        this.list=list;
    }

    //此方法用来显示tab上的名字
    @Override
    public CharSequence getPageTitle(int position) {
        return beanTitles.get(position).name;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return beanTitles.size();
    }
}
