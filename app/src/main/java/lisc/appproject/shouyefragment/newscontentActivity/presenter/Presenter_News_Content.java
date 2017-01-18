package lisc.appproject.shouyefragment.newscontentActivity.presenter;

import lisc.appproject.shouyefragment.newscontentActivity.bean.Bean_News_Content;
import lisc.appproject.shouyefragment.newscontentActivity.model.IModel_News_Content;
import lisc.appproject.shouyefragment.newscontentActivity.model.Model_News_Content;
import lisc.appproject.shouyefragment.newscontentActivity.model.OnNewsContentListener;
import lisc.appproject.shouyefragment.newscontentActivity.view.IView_News_Content;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 21:33
 */

public class Presenter_News_Content extends BasePresenter<IModel_News_Content,IView_News_Content> {
    public Presenter_News_Content(IView_News_Content iView_news_content) {
        super(iView_news_content);
    }

    @Override
    protected IModel_News_Content createModel() {
        return new Model_News_Content();
    }

    public void onData(String id){
        mModel.loadNewsContent(new OnNewsContentListener() {
            @Override
            public void onSuccess(Bean_News_Content news_content) {
                mView.onSuccess(news_content);
            }

            @Override
            public void onFail() {
                mView.onFail();
            }
        },id);
    }

}
