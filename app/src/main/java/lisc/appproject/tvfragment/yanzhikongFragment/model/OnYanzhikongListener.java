package lisc.appproject.tvfragment.yanzhikongFragment.model;

import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:24
 */
public interface OnYanzhikongListener {
    void onYzkSuccess(Bean_Yanzhikong beanYanzhikong);
    void onYzkFail(String err);
}
