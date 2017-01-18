package lisc.appproject.tvfragment.yanzhikongFragment.model;

import lisc.appproject.ServiceApi;
import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;
import lisc.lilibrary.net.Retrofit2Helper;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:25
 * http://www.quanmin.tv/json/app/index/recommend/list-android.json?11241742&v=2.2.4&os=1&ver=4
 */

public class Model_Yanzhikong implements IModel_Yanzhikong {
    private static  final String url="http://www.quanmin.tv/json/app/index/recommend/";
    @Override
    public void loadYanzhikong(final OnYanzhikongListener listener) {
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api=retrofit.create(ServiceApi.class);
        api.yanzhikongBean()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_Yanzhikong>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onYzkFail(e.toString());
                    }

                    @Override
                    public void onNext(Bean_Yanzhikong bean_yanzhikong) {
                        listener.onYzkSuccess(bean_yanzhikong);
                    }
                });

    }

    @Override
    public void onDestroy() {

    }
}
