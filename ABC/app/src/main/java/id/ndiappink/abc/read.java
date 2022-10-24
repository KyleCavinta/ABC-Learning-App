package id.ndiappink.abc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class read extends AppCompatActivity {

     Button video1;
     ImageButton vd1,vd3;
     VideoView videoView;
     MediaController mediaC;

    @Override
    public void onBackPressed() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        video1 = findViewById(R.id.video1);
        vd1 = findViewById(R.id.vd1);
        vd3 = findViewById(R.id.vd3);
        videoView = findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        vd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y11 = new Intent(read.this, Dashboard.class);
                startActivity(y11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
        vd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y22 = new Intent(read.this, read2.class);
                startActivity(y22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

            }
        });



    }
    public void videoplay(View view){

        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.onetwothree;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();


    }





}
