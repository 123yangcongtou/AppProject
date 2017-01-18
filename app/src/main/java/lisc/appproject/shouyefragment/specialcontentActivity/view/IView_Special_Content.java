package lisc.appproject.shouyefragment.specialcontentActivity.view;

import lisc.appproject.shouyefragment.specialcontentActivity.bean.Bean_Special_Content;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 19:50
 */

public interface IView_Special_Content extends IBaseView{
    void onContentSuccess(Bean_Special_Content specialContent);
    void onContentFail();
}
