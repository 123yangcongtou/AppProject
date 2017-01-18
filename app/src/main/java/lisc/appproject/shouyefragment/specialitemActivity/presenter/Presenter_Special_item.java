package lisc.appproject.shouyefragment.specialitemActivity.presenter;

import lisc.appproject.shouyefragment.specialitemActivity.bean.Bean_Special_item;
import lisc.appproject.shouyefragment.specialitemActivity.model.IModel_Special_item;
import lisc.appproject.shouyefragment.specialitemActivity.model.Model_Special_item;
import lisc.appproject.shouyefragment.specialitemActivity.model.SpecialItemClick;
import lisc.appproject.shouyefragment.specialitemActivity.view.IView_Special_item;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 15:15
 */

public class Presenter_Special_item extends BasePresenter<IModel_Special_item,IView_Special_item> {
    public Presenter_Special_item(IView_Special_item iView_special_item) {
        super(iView_special_item);
    }

    @Override
    protected IModel_Special_item createModel() {
        return new Model_Special_item();
    }

    public void ondata(String id){
        mModel.loadItem(new SpecialItemClick() {
            @Override
            public void onSpecialItemSuccess(Bean_Special_item specialItem) {
                mView.onSpecialItemSuccess(specialItem);
            }

            @Override
            public void onSpecialItemFail() {
                mView.onSpecialItemFail();
            }
        },id);
    }
}
