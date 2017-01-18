package lisc.appproject.tvfragment.atNowvideo.view;

import lisc.appproject.tvfragment.atNowvideo.bean.Bean_video;
import lisc.lilibrary.mvp.ibase.IBaseView;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/12 19:35
 */

public interface IView_video extends IBaseView{
    void onVideoSuccess(Bean_video beanVideo);
    void onVideoFail();
}
