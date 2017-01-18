package lisc.appproject.shouyefragment.specialFragment.presenter;

import lisc.appproject.shouyefragment.specialFragment.bean.Bean_Special;
import lisc.appproject.shouyefragment.specialFragment.model.IModel_special;
import lisc.appproject.shouyefragment.specialFragment.model.Model_special;
import lisc.appproject.shouyefragment.specialFragment.model.OnSpecialListener;
import lisc.appproject.shouyefragment.specialFragment.view.IView_special;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/4 22:22
 */

public class Presenter_special extends BasePresenter<IModel_special,IView_special> {
    public Presenter_special(IView_special iView_special) {
        super(iView_special);
    }

    @Override
    protected IModel_special createModel() {
        return new Model_special();
    }

    public void data(){
        mModel.loadSpecial(new OnSpecialListener() {
            @Override
            public void onSuccess(Bean_Special beanSpecial) {
                mView.onSPSuccess(beanSpecial);
            }

            @Override
            public void onFail(String err) {
                mView.onSpFail();
            }
        });
    }
}
