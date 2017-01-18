package lisc.appproject.shouyefragment.weixinFragment.model;

import lisc.lilibrary.mvp.ibase.IBaseModel;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/5 13:45
 */

public interface IModel_Weixin extends IBaseModel {
    public void loadup(OnWeiXinListener listener);
    public void loaddown(OnWeiXinListener listener);

}
