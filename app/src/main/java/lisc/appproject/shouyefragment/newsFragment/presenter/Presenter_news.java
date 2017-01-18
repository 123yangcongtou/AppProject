package lisc.appproject.shouyefragment.newsFragment.presenter;

import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.appproject.shouyefragment.newsFragment.model.IModel_news;
import lisc.appproject.shouyefragment.newsFragment.model.Modle_news;
import lisc.appproject.shouyefragment.newsFragment.model.OnLoadNewsListener;
import lisc.appproject.shouyefragment.newsFragment.view.IVIew_news;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 16:29
 * http://news-at.zhihu.com/api/4/news/latest
 */

public class Presenter_news extends BasePresenter<IModel_news,IVIew_news> {
    public Presenter_news(IVIew_news ivIew_news) {
        super(ivIew_news);
    }

    @Override
    protected IModel_news createModel() {
        return new Modle_news();
    }

    public void data(){
        mModel.loadNews(new OnLoadNewsListener() {
            @Override
            public void onNewSuccess(Bean_news beanNews) {
                mView.onNewSuccess(beanNews);
            }

            @Override
            public void onNewFail(String err) {
                mView.onNewFail(err);
            }
        });
    }
}
