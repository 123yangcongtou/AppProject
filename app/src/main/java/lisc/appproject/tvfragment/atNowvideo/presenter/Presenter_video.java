package lisc.appproject.tvfragment.atNowvideo.presenter;

import lisc.appproject.tvfragment.atNowvideo.bean.Bean_video;
import lisc.appproject.tvfragment.atNowvideo.model.IModel_video;
import lisc.appproject.tvfragment.atNowvideo.model.Model_video;
import lisc.appproject.tvfragment.atNowvideo.model.OnVideoListener;
import lisc.appproject.tvfragment.atNowvideo.view.IView_video;
import lisc.lilibrary.mvp.BasePresenter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/12 19:38
 */

public class Presenter_video extends BasePresenter<IModel_video,IView_video> {
    public Presenter_video(IView_video iView_video) {
        super(iView_video);
    }

    @Override
    protected IModel_video createModel() {
        return new Model_video();
    }

    public void loadData(String uid){
        mModel.loadVideo(new OnVideoListener() {
            @Override
            public void onVideoSuccess(Bean_video beanVideo) {
                mView.onVideoSuccess(beanVideo);
            }

            @Override
            public void onVideoFail() {
                mView.onVideoFail();
            }
        },uid);
    }
}
