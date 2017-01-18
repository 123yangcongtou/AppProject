package lisc.appproject.tvfragment.atNowvideo.view;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.pili.pldroid.player.widget.PLVideoView;

import lisc.appproject.R;
import lisc.appproject.tvfragment.atNowvideo.bean.MediaController;

public class FullActivity extends AppCompatActivity {

    private PLVideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);

        video = (PLVideoView) findViewById(R.id.full_VideoView);
        //
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        video.setVideoPath(url);
//        video.setDisplayAspectRatio(PLVideoView.ASPECT_RATIO_ORIGIN);
        video.setDisplayAspectRatio(PLVideoView.ASPECT_RATIO_FIT_PARENT);
//        video.setDisplayAspectRatio(PLVideoView.ASPECT_RATIO_PAVED_PARENT);
//        video.setDisplayAspectRatio(PLVideoView.ASPECT_RATIO_16_9);
//        video.setDisplayAspectRatio(PLVideoView.ASPECT_RATIO_4_3);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        video.start();
    }

    @Override
    protected void onPause() {
        video.pause();
        super.onPause();
    }
}
