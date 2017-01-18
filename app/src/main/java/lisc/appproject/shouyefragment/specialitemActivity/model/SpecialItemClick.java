package lisc.appproject.shouyefragment.specialitemActivity.model;

import lisc.appproject.shouyefragment.specialitemActivity.bean.Bean_Special_item;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 15:12
 */
public interface SpecialItemClick {
    void onSpecialItemSuccess(Bean_Special_item specialItem);
    void onSpecialItemFail();
}
