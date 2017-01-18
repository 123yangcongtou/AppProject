package lisc.appproject.tvfragment.atNowvideo.model;

import lisc.lilibrary.mvp.ibase.IBaseModel;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/12 19:25
 */

public interface IModel_video extends IBaseModel {
    void loadVideo(OnVideoListener listener,String uid);
}
