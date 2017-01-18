package lisc.appproject.tvActivityTitle.model;

import lisc.lilibrary.mvp.ibase.IBaseModel;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:23
 */

public interface IModel_Title extends IBaseModel{
    public void loadTitle(OnTitleListener listener);
}
