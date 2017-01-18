package lisc.appproject.shouyefragment.newscontentActivity.view;

import lisc.appproject.shouyefragment.newscontentActivity.bean.Bean_News_Content;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 21:23
 */

public interface IView_News_Content extends IBaseView{
    void onSuccess(Bean_News_Content news_content);
    void onFail();
}
