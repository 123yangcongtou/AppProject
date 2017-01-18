package lisc.appproject.shouyefragment.newscontentActivity.view;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.newscontentActivity.bean.Bean_News_Content;
import lisc.appproject.shouyefragment.newscontentActivity.presenter.Presenter_News_Content;
import lisc.lilibrary.mvp.MvpActivity;
import lisc.lilibrary.mvp.ibase.IBaseView;

public class NewsContentActivity extends MvpActivity<Presenter_News_Content> implements IView_News_Content {
    private WebView wb;
    private Toolbar toolbar;
    private ImageView iv;
    private FloatingActionButton floating;
    private CollapsingToolbarLayout collapsing;

    @Override
    public void onSuccess(Bean_News_Content news_content) {
        Glide.with(this)
                .load(news_content.image)
                .into(iv);
        collapsing.setTitle(news_content.title);
        collapsing.setExpandedTitleColor(Color.WHITE);
        collapsing.setCollapsedTitleTextColor(Color.BLACK);
        wb.loadUrl(news_content.share_url);
        Log.e("------",news_content.share_url);
    }

    @Override
    public void onFail() {

    }

    @Override
    protected Presenter_News_Content createPresenter(IBaseView view) {
        return new Presenter_News_Content(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_news_content;
    }

    @Override
    public void initVariables() {

    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        iv = (ImageView) findViewById(R.id.pic_news_content);
        toolbar = (Toolbar) findViewById(R.id.toolbar_news_content);
        floating = (FloatingActionButton) findViewById(R.id.floating_news_content);
        collapsing = (CollapsingToolbarLayout) findViewById(R.id.collapsing_news_content);
        wb=  (WebView) findViewById(R.id.webview_news_content);
        mPresenter.onData(id);
    }

}
