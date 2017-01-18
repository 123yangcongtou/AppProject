package lisc.appproject.shouyefragment.specialcontentActivity.model;

import lisc.lilibrary.mvp.ibase.IBaseModel;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 19:48
 */

public interface IModel_Special_Content extends IBaseModel{
    public void loadContent(OnContentListener listener,String id);
}
