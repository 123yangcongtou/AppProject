package lisc.appproject.shouyeActivity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;



/**
 * 1.类描述
 * 2.创建人：lisc
 * 2.创建时间：2017/1/3 9:41
 */
public class FragmentPagerAdapters extends FragmentPagerAdapter {


    private final FragmentManager fm;
    private final Context context;
    private final ArrayList<Fragment> list;
    private final String[] content;

    public FragmentPagerAdapters(FragmentManager fm, Context context, ArrayList<Fragment> list, String[] content) {
        super(fm);
        this.fm = fm;
        this.context = context;
        this.list = list;
        this.content = content;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return content.length;
    }

    //此方法用来显示tab上的名字
    @Override
    public CharSequence getPageTitle(int position) {
        return content[position%content.length];
    }

}
