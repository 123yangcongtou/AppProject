package lisc.appproject.shouyefragment.specialcontentActivity.model;

import lisc.appproject.shouyefragment.specialcontentActivity.bean.Bean_Special_Content;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 19:49
 */
public interface OnContentListener {
    void onContentSuccess(Bean_Special_Content specialContent);
    void onContentFail();
}
