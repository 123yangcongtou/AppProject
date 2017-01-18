package lisc.appproject.shouyefragment.specialitemActivity.view;

import lisc.appproject.shouyefragment.specialitemActivity.bean.Bean_Special_item;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 15:14
 */

public interface IView_Special_item extends IBaseView{
    void onSpecialItemSuccess(Bean_Special_item specialItem);
    void onSpecialItemFail();
}
