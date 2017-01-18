package lisc.appproject.tvfragment.otherFragment.view;

import lisc.appproject.tvfragment.otherFragment.bean.Bean_other;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/11 16:44
 */

public interface IView_other extends IBaseView{
    void onOtherSuccess(Bean_other beanOther);
    void onOtherFail();
}
