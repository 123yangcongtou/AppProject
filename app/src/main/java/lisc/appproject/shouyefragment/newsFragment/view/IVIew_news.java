package lisc.appproject.shouyefragment.newsFragment.view;

import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 16:25
 */

public interface IVIew_news extends IBaseView{
    void onNewSuccess(Bean_news beanNews);
    void onNewFail(String err);
}
