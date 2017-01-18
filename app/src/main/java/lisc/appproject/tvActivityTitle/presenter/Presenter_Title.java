package lisc.appproject.tvActivityTitle.presenter;

import java.util.List;

import lisc.appproject.tvActivityTitle.bean.Bean_Title;
import lisc.appproject.tvActivityTitle.model.IModel_Title;
import lisc.appproject.tvActivityTitle.model.Model_Title;
import lisc.appproject.tvActivityTitle.model.OnTitleListener;
import lisc.appproject.tvActivityTitle.view.IView_Title;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:29
 */

public class Presenter_Title extends BasePresenter<IModel_Title,IView_Title>{


    public Presenter_Title(IView_Title iView_title) {
        super(iView_title);
    }

    @Override
    protected IModel_Title createModel() {
        return new Model_Title();
    }

    public void ondata(){
        mModel.loadTitle(new OnTitleListener() {
            @Override
            public void onTitleSuccess(List<Bean_Title> beanTitles) {
                mView.onTitleSuccess(beanTitles);
            }

            @Override
            public void onTitleFail(String err) {
                mView.onTitleFail(err.toString());
            }
        });
    }
}
