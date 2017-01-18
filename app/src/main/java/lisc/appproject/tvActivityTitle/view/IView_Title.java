package lisc.appproject.tvActivityTitle.view;

import java.util.List;

import lisc.appproject.tvActivityTitle.bean.Bean_Title;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:27
 */

public interface IView_Title extends IBaseView {
    void onTitleSuccess(List<Bean_Title> beanTitles);
    void onTitleFail(String err);
}
