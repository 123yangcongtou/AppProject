package lisc.appproject.shouyefragment.specialcontentActivity.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.specialcontentActivity.bean.Bean_Special_Content;
import lisc.appproject.shouyefragment.specialcontentActivity.presenter.Presenter_Special_Content;
import lisc.lilibrary.mvp.MvpActivity;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
*1.类描述：
*2.创建人：lisc
*3.创建时间：2017/1/9 19:40
 * http://news-at.zhihu.com/api/4/news/9130653
 */

public class ContentActivity extends MvpActivity<Presenter_Special_Content> implements IView_Special_Content {

    private WebView wb;

    @Override
    public void onContentSuccess(Bean_Special_Content specialContent) {
        wb.loadUrl(specialContent.share_url);
    }

    @Override
    public void onContentFail() {

    }

    @Override
    protected Presenter_Special_Content createPresenter(IBaseView view) {
        return new Presenter_Special_Content(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_content;
    }

    @Override
    public void initVariables() {

    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        mPresenter.initData(id);
        wb = (WebView) findViewById(R.id.webview_special_content);
    }
}
