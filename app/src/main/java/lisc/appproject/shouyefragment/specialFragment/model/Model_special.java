package lisc.appproject.shouyefragment.specialFragment.model;

import android.util.Log;

import lisc.appproject.shouyefragment.specialFragment.bean.Bean_Special;
import lisc.appproject.ServiceApi;
import lisc.lilibrary.mvp.BaseModel;
import lisc.lilibrary.net.Retrofit2Helper;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/4 21:36
 * http://news-at.zhihu.com/api/4/sections
 */

public class Model_special extends BaseModel implements IModel_special {
    private static  final String url="http://news-at.zhihu.com/api/4/";
    @Override
    public void loadSpecial(final OnSpecialListener listener) {
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api=retrofit.create(ServiceApi.class);
        api.specialBean()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_Special>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onFail(e.toString());
                    }

                    @Override
                    public void onNext(Bean_Special beanSpecial) {
                        listener.onSuccess(beanSpecial);
                        Log.e("name==========",beanSpecial.data.get(5).name);
                    }
                });

    }

    @Override
    public void onDestroy() {

    }
}
