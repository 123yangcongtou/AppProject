package lisc.appproject.shouyefragment.weixinFragment.view;

import lisc.appproject.shouyefragment.weixinFragment.bean.Bean_Weixin;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/5 13:51
 */

public interface IView_Weixin extends IBaseView {
    void onWXSuccess(Bean_Weixin beanWeixin);
    void onWXFail();
}
