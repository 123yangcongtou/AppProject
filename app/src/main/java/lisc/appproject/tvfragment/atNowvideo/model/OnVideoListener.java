package lisc.appproject.tvfragment.atNowvideo.model;

import lisc.appproject.tvfragment.atNowvideo.bean.Bean_video;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/12 19:33
 */
public interface OnVideoListener {
    void onVideoSuccess(Bean_video beanVideo);
    void onVideoFail();
}
