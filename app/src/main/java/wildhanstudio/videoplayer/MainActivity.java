package wildhanstudio.videoplayer;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView v = (VideoView) findViewById(R.id.videoView);

        v.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videobro));

        v.setMediaController(new MediaController(this));

        v.requestFocus();
        v.setKeepScreenOn(true);

        v.start();

    }
}
