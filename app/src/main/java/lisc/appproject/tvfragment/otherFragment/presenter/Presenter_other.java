package lisc.appproject.tvfragment.otherFragment.presenter;

import lisc.appproject.tvfragment.otherFragment.bean.Bean_other;
import lisc.appproject.tvfragment.otherFragment.model.IModel_other;
import lisc.appproject.tvfragment.otherFragment.model.Model_other;
import lisc.appproject.tvfragment.otherFragment.model.SetOtherClick;
import lisc.appproject.tvfragment.otherFragment.view.IView_other;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/11 16:45
 */

public class Presenter_other extends BasePresenter<IModel_other,IView_other>{

    public Presenter_other(IView_other iView_other) {
        super(iView_other);
    }

    @Override
    protected IModel_other createModel() {
        return new Model_other();
    }

    public void initData(String name){
        mModel.loadOther(new SetOtherClick() {
            @Override
            public void onOtherSuccess(Bean_other beanOther) {
                mView.onOtherSuccess(beanOther);
            }

            @Override
            public void onOtherFail() {
                mView.onOtherFail();
            }
        },name);
    }
}
