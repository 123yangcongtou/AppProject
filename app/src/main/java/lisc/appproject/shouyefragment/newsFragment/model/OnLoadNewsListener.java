package lisc.appproject.shouyefragment.newsFragment.model;

import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 16:46
 */
public interface OnLoadNewsListener {
    void onNewSuccess(Bean_news beanNews);
    void onNewFail(String err);
}
