package lisc.appproject.shouyefragment.specialcontentActivity.model;

import lisc.appproject.ServiceApi;
import lisc.appproject.shouyefragment.newsFragment.model.OnLoadNewsListener;
import lisc.appproject.shouyefragment.specialcontentActivity.bean.Bean_Special_Content;
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
 * 3.创建时间：2017/1/9 19:59
 */

public class Model_Special_Content extends BaseModel implements IModel_Special_Content {
    private String url="http://news-at.zhihu.com/api/4/news/";
    @Override
    public void loadContent(final OnContentListener listener, String id) {
            Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
            ServiceApi api=retrofit.create(ServiceApi.class);
            api.contentSpecialBean(id)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<Bean_Special_Content>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            listener.onContentFail();
                        }

                        @Override
                        public void onNext(Bean_Special_Content bean_special_content) {
                            listener.onContentSuccess(bean_special_content);
                        }
                    });
    }
}
