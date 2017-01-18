package lisc.appproject.shouyefragment.newsFragment.model;

import lisc.lilibrary.mvp.ibase.IBaseModel;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 15:58
 */

public interface IModel_news extends IBaseModel {
//    public void loadNews(String url,OnLoadNewsListener listener);
    public void loadNews(OnLoadNewsListener listener);
}
