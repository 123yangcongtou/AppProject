package lisc.appproject.shouyefragment.specialFragment.model;

import lisc.appproject.shouyefragment.specialFragment.bean.Bean_Special;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/4 21:35
 */
public interface OnSpecialListener {
    void onSuccess(Bean_Special beanSpecial);
    void onFail(String err);
}
