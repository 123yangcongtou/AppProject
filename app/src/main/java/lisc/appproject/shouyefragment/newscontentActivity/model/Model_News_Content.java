package lisc.appproject.shouyefragment.newscontentActivity.model;

import lisc.appproject.ServiceApi;
import lisc.appproject.shouyefragment.newscontentActivity.bean.Bean_News_Content;
import lisc.appproject.shouyefragment.specialitemActivity.bean.Bean_Special_item;
import lisc.lilibrary.mvp.BaseModel;
import lisc.lilibrary.net.Retrofit2Helper;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 21:21
 * http://news-at.zhihu.com/api/4/news/9136167
 */

public class Model_News_Content extends BaseModel implements IModel_News_Content {
    private String url="http://news-at.zhihu.com/api/4/news/";

    @Override
    public void loadNewsContent(final OnNewsContentListener listener, String id) {
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api = retrofit.create(ServiceApi.class);
        api.contentNewsBean(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_News_Content>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onFail();
                    }

                    @Override
                    public void onNext(Bean_News_Content bean_special_content) {
                        listener.onSuccess(bean_special_content);
                    }
                });

    }
}
