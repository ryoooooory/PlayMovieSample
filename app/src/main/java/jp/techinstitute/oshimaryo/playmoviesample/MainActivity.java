package jp.techinstitute.oshimaryo.playmoviesample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playBtn = (Button)findViewById(R.id.playBtn);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView videoView = (VideoView)findViewById(R.id.videoView);
                String movieUri = "android.resource://" + getPackageName() + "/" +
                        R.raw.a;
                videoView.setVideoURI(Uri.parse(movieUri));
                videoView.start();
            }
        });
    }
}
