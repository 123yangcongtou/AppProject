package lisc.appproject.shouyefragment.weixinFragment.model;

import lisc.appproject.shouyefragment.weixinFragment.bean.Bean_Weixin;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/5 13:46
 */
public interface OnWeiXinListener {
    void onSuccess(Bean_Weixin beanWeixin);
    void onWXFail();
}
