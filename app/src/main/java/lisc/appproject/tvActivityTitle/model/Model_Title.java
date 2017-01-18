package lisc.appproject.tvActivityTitle.model;

import java.util.List;

import lisc.appproject.tvActivityTitle.bean.Bean_Title;
import lisc.appproject.ServiceApi;
import lisc.lilibrary.net.Retrofit2Helper;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static android.R.id.list;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:25
 * http://www.quanmin.tv/json/app/index/category/info-android.json?v=2.2.4&os=1&ver=4
 */

public class Model_Title implements IModel_Title {
    private static  final String url="http://www.quanmin.tv/json/app/index/category/";
    @Override
    public void loadTitle(final OnTitleListener listener) {
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api = retrofit.create(ServiceApi.class);
        api.titleBean(/*"2.2.4", "1", "4"*/)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Bean_Title>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onTitleFail(e.toString());
                    }

                    @Override
                    public void onNext(List<Bean_Title> bean_titles) {
                        listener.onTitleSuccess(bean_titles);
                    }

                });
    }

    @Override
    public void onDestroy() {

    }
}
