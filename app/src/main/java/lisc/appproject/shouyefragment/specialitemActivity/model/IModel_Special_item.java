package lisc.appproject.shouyefragment.specialitemActivity.model;

import lisc.lilibrary.mvp.ibase.IBaseModel;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 15:11
 */

public interface IModel_Special_item extends IBaseModel{
    void loadItem(SpecialItemClick listener,String id);
}
