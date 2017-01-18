package lisc.appproject.tvfragment.yanzhikongFragment.presenter;

import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;
import lisc.appproject.tvfragment.yanzhikongFragment.model.IModel_Yanzhikong;
import lisc.appproject.tvfragment.yanzhikongFragment.model.Model_Yanzhikong;
import lisc.appproject.tvfragment.yanzhikongFragment.model.OnYanzhikongListener;
import lisc.appproject.tvfragment.yanzhikongFragment.view.IView_Yanzhikong;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:29
 */

public class Presenter_Yanzhikong extends BasePresenter<IModel_Yanzhikong,IView_Yanzhikong>{
    public Presenter_Yanzhikong(IView_Yanzhikong iView_yanzhikong) {
        super(iView_yanzhikong);
    }

    @Override
    protected IModel_Yanzhikong createModel() {
        return new Model_Yanzhikong();
    }

    public void ondata(){
        mModel.loadYanzhikong(new OnYanzhikongListener() {
            @Override
            public void onYzkSuccess(Bean_Yanzhikong beanYanzhikong) {
                mView.onYzkSuccess(beanYanzhikong);
            }

            @Override
            public void onYzkFail(String err) {
                mView.onYzkFail(err.toString());
            }
        });
    }
}
