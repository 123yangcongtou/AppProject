package lisc.appproject.shouyefragment.newsFragment.model;

import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.appproject.ServiceApi;
import lisc.lilibrary.mvp.BaseModel;
import lisc.lilibrary.net.Retrofit2Helper;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
//import retrofit2.Retrofit;
//import rx.Observer;
//import rx.android.schedulers.AndroidSchedulers;
//import rx.schedulers.Schedulers;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 16:00
 */

public class Modle_news extends BaseModel implements IModel_news {
    private static  final String url="http://news-at.zhihu.com/api/4/news/";
    @Override
    public void loadNews(final OnLoadNewsListener listener) {
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api=retrofit.create(ServiceApi.class);
        api.newsBean()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_news>() {
                               @Override
                               public void onCompleted() {

                               }

                               @Override
                               public void onError(Throwable e) {
                                   listener.onNewFail(e.toString());
                               }

                               @Override
                               public void onNext(Bean_news bean_news) {
                                   listener.onNewSuccess(bean_news);
                               }
                           }
                );
    }


}
