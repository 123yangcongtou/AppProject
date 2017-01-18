package lisc.appproject.tvfragment.atNowvideo.model;

import lisc.appproject.ServiceApi;
import lisc.appproject.tvfragment.atNowvideo.bean.Bean_video;
import lisc.lilibrary.net.Retrofit2Helper;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/12 19:33
 * http://www.quanmin.tv/json/rooms/8962848/info1.json?11241653&v=2.2.4&os=1&ver=4
 */

public class Model_video implements IModel_video {
    private String url="http://www.quanmin.tv/json/rooms/";
    @Override
    public void loadVideo(final OnVideoListener listener, String uid) {
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api = retrofit.create(ServiceApi.class);
        api.videoBean(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_video>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onVideoFail();
                    }

                    @Override
                    public void onNext(Bean_video beanVideo) {
                        listener.onVideoSuccess(beanVideo);
                    }
                });
    }

    @Override
    public void onDestroy() {

    }
}
