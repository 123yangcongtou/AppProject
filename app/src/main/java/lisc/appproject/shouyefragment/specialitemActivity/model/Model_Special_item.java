package lisc.appproject.shouyefragment.specialitemActivity.model;

import lisc.appproject.ServiceApi;
import lisc.appproject.shouyefragment.specialitemActivity.bean.Bean_Special_item;
import lisc.lilibrary.net.Retrofit2Helper;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 15:13
 * http://news-at.zhihu.com/api/4/section/1
 */

public class Model_Special_item implements IModel_Special_item {
    private String url="http://news-at.zhihu.com/api/4/section/";
    @Override
    public void loadItem(final SpecialItemClick listener,String id) {
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api=retrofit.create(ServiceApi.class);
        api.itemSpecialBean(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_Special_item>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onSpecialItemFail();
                    }

                    @Override
                    public void onNext(Bean_Special_item bean_special_item) {
                        listener.onSpecialItemSuccess(bean_special_item);
                    }
                });

    }

    @Override
    public void onDestroy() {

    }
}
