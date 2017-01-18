package lisc.appproject.shouyefragment.weixinFragment.model;

import android.util.Log;

import lisc.appproject.shouyefragment.weixinFragment.bean.Bean_Weixin;
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
 * 3.创建时间：2017/1/5 13:49
 * http://api.tianapi.com/wxnew?key=09691a96d0c41d30215a888632e1b96e&num=10&page=1
 */

public class Model_Weixin extends BaseModel implements IModel_Weixin {
    private String url="http://api.tianapi.com/";
    private int i=2;
    private int ii=0;
    private int iii=1;

    @Override
    public void loadup(final OnWeiXinListener listener) {
        ii=(i++)-1;
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api=retrofit.create(ServiceApi.class);
        api.weixinBean("09691a96d0c41d30215a888632e1b96e","10",ii)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_Weixin>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onWXFail();
                    }

                    @Override
                    public void onNext(Bean_Weixin beanWeixin) {
                        listener.onSuccess(beanWeixin);
                    }
                });
        Log.e("上=============",ii+"");
    }

    @Override
    public void loaddown(final OnWeiXinListener listener) {
        iii=(ii--)-1;
        Retrofit retrofit = Retrofit2Helper.getInstance().getRetrofit(url);
        ServiceApi api=retrofit.create(ServiceApi.class);
        api.weixinBean("09691a96d0c41d30215a888632e1b96e","10",iii)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean_Weixin>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onWXFail();
                    }

                    @Override
                    public void onNext(Bean_Weixin beanWeixin) {
                        listener.onSuccess(beanWeixin);
                    }
                });
        Log.e("下=============",iii+"");
    }

    @Override
    public void onDestroy() {

    }
}
