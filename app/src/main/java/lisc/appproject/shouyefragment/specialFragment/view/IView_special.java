package lisc.appproject.shouyefragment.specialFragment.view;

import lisc.appproject.shouyefragment.specialFragment.bean.Bean_Special;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/4 22:21
 */

public interface IView_special extends IBaseView {
    void onSPSuccess(Bean_Special beanSpecial);
    void onSpFail();
}
