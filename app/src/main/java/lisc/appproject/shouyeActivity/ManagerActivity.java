package lisc.appproject.shouyeActivity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import lisc.appproject.MoshiActivity;
import lisc.appproject.tvActivityTitle.view.TVTitleActivity;
import lisc.appproject.R;
import lisc.appproject.shouyefragment.hotFragment.HotFragment;
import lisc.appproject.shouyefragment.newsFragment.view.NewsFragment;
import lisc.appproject.shouyefragment.specialFragment.view.SpecialFragment;
import lisc.appproject.shouyefragment.weixinFragment.view.WeixinFragment;

import static lisc.appproject.R.id.viewpager;

public class ManagerActivity extends AppCompatActivity {


    private static final String[] CONTENT = new String[] { "日报", "专栏", "微信", "热门"};
    /*创建一个Drawerlayout和Toolbar联动的开关*/
    private ActionBarDrawerToggle toggle;
    private DrawerLayout drawerlayout;
    private NavigationView navigation;
    private Toolbar toolbar;
    private TabLayout tablout;
    private FragmentPagerAdapters adapters;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        initViews();

    }

    private void initViews() {
        drawerlayout = (DrawerLayout) findViewById(R.id.main_drawer);
        navigation = (NavigationView) findViewById(R.id.main_navigation);
        toolbar =   (Toolbar) findViewById(R.id.main_toolbar);
        tabLayout();
        toggle = new ActionBarDrawerToggle(this, drawerlayout, toolbar, 0, 0);
        toggle.syncState();
        drawerlayout.addDrawerListener(toggle);
        toolbar.setTitle("首页");
        //菜单点击事件
        navigation.setNavigationItemSelectedListener(new NavigationListener());
    }

    private void tabLayout() {
        tablout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(viewpager);
        for( int i = 0 ; i < CONTENT.length ; i++ ){
            tablout.addTab(tablout.newTab().setText(CONTENT[i]));
        }
        FragmentList();
        adapters = new FragmentPagerAdapters(getSupportFragmentManager(), this, fragments,CONTENT);
        viewPager.setAdapter(adapters);
        tablout.setupWithViewPager(viewPager);
        tablout.setTabsFromPagerAdapter(adapters);
    }


    private void FragmentList() {
        fragments = new ArrayList<>();
        fragments.add(new NewsFragment());
        fragments.add(new SpecialFragment());
        fragments.add(new WeixinFragment());
        fragments.add(new HotFragment());
    }

    class NavigationListener implements NavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.fabu:
                    //关闭抽屉
                    drawerlayout.closeDrawers();
                    break;
                case R.id.quanmin:
                    startActivity(new Intent(ManagerActivity.this,TVTitleActivity.class));
                    break;
                case R.id.shezhi:
                    startActivity(new Intent(ManagerActivity.this,MoshiActivity.class));
                    break;
                case R.id.guanyu:
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        drawerlayout.closeDrawers();
        return super.onKeyDown(keyCode, event);
    }
}
