package lisc.appproject.tvActivityTitle.model;

import java.util.ArrayList;
import java.util.List;

import lisc.appproject.tvActivityTitle.bean.Bean_Title;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 14:24
 */
public interface OnTitleListener {
    void onTitleSuccess(List<Bean_Title> beanTitles);
    void onTitleFail(String err);
}
