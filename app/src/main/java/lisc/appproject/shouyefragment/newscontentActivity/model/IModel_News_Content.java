package lisc.appproject.shouyefragment.newscontentActivity.model;

import lisc.lilibrary.mvp.ibase.IBaseModel;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 21:19
 */

public interface IModel_News_Content extends IBaseModel {
    void loadNewsContent(OnNewsContentListener listener,String id);
}
