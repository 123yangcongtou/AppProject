package lisc.appproject.tvfragment.atNowvideo.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.pili.pldroid.player.widget.PLVideoView;

import lisc.appproject.R;
import lisc.appproject.tvfragment.atNowvideo.bean.Bean_video;
import lisc.appproject.tvfragment.atNowvideo.presenter.Presenter_video;
import lisc.appproject.tvfragment.atNowvideo.bean.MediaController;
import lisc.lilibrary.mvp.MvpActivity;
import lisc.lilibrary.mvp.ibase.IBaseView;

public class VideoActivity extends MvpActivity<Presenter_video> implements IView_video {

    private PLVideoView video;

    @Override
    protected Presenter_video createPresenter(IBaseView view) {
        return new Presenter_video(this);
    }

    @Override
    public void onVideoSuccess(Bean_video beanVideo) {
        final String url=beanVideo.live.ws.flv.five.src;
        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        video.setVideoPath(url);
        video.setDisplayAspectRatio(PLVideoView.ASPECT_RATIO_FIT_PARENT);
        video.start();
        Toast.makeText(this, "链接中。。。前稍后！", Toast.LENGTH_SHORT).show();
        video.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(VideoActivity.this, FullActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
                return false;
            }
        });
    }

    @Override
    public void onVideoFail() {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_video;
    }

    @Override
    public void initVariables() {

    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        video = (PLVideoView) findViewById(R.id.atnow_VideoView);
        Intent intent = getIntent();
        String uid = intent.getStringExtra("uid");
        mPresenter.loadData(uid);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        video.start();
    }

    @Override
    protected void onPause() {
        video.pause();
        super.onPause();
    }
}
