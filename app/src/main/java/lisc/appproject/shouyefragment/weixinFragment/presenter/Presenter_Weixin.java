package lisc.appproject.shouyefragment.weixinFragment.presenter;

import lisc.appproject.shouyefragment.weixinFragment.bean.Bean_Weixin;
import lisc.appproject.shouyefragment.weixinFragment.model.IModel_Weixin;
import lisc.appproject.shouyefragment.weixinFragment.model.Model_Weixin;
import lisc.appproject.shouyefragment.weixinFragment.model.OnWeiXinListener;
import lisc.appproject.shouyefragment.weixinFragment.view.IView_Weixin;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/5 14:32
 */

public class Presenter_Weixin extends BasePresenter<IModel_Weixin,IView_Weixin> {
    public Presenter_Weixin(IView_Weixin iView_weixin) {
        super(iView_weixin);
    }

    @Override
    protected IModel_Weixin createModel() {
        return new Model_Weixin( );
    }

    public void onup(){
        mModel.loadup(new OnWeiXinListener() {
            @Override
            public void onSuccess(Bean_Weixin beanWeixin) {
                mView.onWXSuccess(beanWeixin);
            }

            @Override
            public void onWXFail() {
                mView.onWXFail();
            }
        });
    }
    public void ondown(){
        mModel.loaddown(new OnWeiXinListener() {
            @Override
            public void onSuccess(Bean_Weixin beanWeixin) {
                mView.onWXSuccess(beanWeixin);
            }

            @Override
            public void onWXFail() {
                mView.onWXFail();
            }
        });
    }
}
