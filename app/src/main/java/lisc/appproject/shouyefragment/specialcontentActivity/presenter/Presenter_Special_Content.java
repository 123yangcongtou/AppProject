package lisc.appproject.shouyefragment.specialcontentActivity.presenter;

import lisc.appproject.shouyefragment.specialcontentActivity.bean.Bean_Special_Content;
import lisc.appproject.shouyefragment.specialcontentActivity.model.IModel_Special_Content;
import lisc.appproject.shouyefragment.specialcontentActivity.model.Model_Special_Content;
import lisc.appproject.shouyefragment.specialcontentActivity.model.OnContentListener;
import lisc.appproject.shouyefragment.specialcontentActivity.view.IView_Special_Content;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 19:51
 */

public class Presenter_Special_Content extends BasePresenter<IModel_Special_Content,IView_Special_Content> {
    public Presenter_Special_Content(IView_Special_Content iView_special_content) {
        super(iView_special_content);
    }

    @Override
    protected IModel_Special_Content createModel() {
        return new Model_Special_Content();
    }

    public void initData(String id){
        mModel.loadContent(new OnContentListener() {
            @Override
            public void onContentSuccess(Bean_Special_Content specialContent) {
                mView.onContentSuccess(specialContent);
            }

            @Override
            public void onContentFail() {
                mView.onContentFail();
            }
        },id);
    }
}
