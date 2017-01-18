package lisc.appproject.tvfragment.yanzhikongFragment.view;

import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:27
 */

public interface IView_Yanzhikong extends IBaseView {
    void onYzkSuccess(Bean_Yanzhikong beanYanzhikong);
    void onYzkFail(String err);
}
