package lisc.appproject.tvfragment.otherFragment.model;

import lisc.appproject.ServiceApi;
import lisc.appproject.tvfragment.otherFragment.bean.Bean_other;
import lisc.lilibrary.net.Retrofit2Helper;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/11 16:44
 * http://www.quanmin.tv/json%2Fcategories%2Flol%2Flist.json?11211639&os=1&v=2.2.4&os=1&ver=4
 */

public class Model_other implements IModel_other {
    private String url="http://www.quanmin.tv/";
    @Override
    public void loadOther(final SetOtherClick click, String name) {
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api = retrofit.create(ServiceApi.class);
        api.otherBean(name)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_other>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        click.onOtherFail();
                    }

                    @Override
                    public void onNext(Bean_other beanOther) {
                        click.onOtherSuccess(beanOther);
                    }
                });

    }

    @Override
    public void onDestroy() {

    }
}
