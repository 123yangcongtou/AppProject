package lisc.appproject.shouyefragment.newscontentActivity.model;

import lisc.appproject.shouyefragment.newscontentActivity.bean.Bean_News_Content;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 21:20
 */
public interface OnNewsContentListener {
    void onSuccess(Bean_News_Content news_content);
    void onFail();
}
