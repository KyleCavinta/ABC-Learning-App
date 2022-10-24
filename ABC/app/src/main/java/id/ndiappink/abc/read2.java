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

public class read2 extends AppCompatActivity {

    Button video11;
    ImageButton vdd1,vdd3;
    VideoView videoVieww;
    MediaController mediaCc;

    @Override
    public void onBackPressed() {}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read2);
        video11 = findViewById(R.id.video11);
        vdd1 = findViewById(R.id.vdd1);
        vdd3 = findViewById(R.id.vdd3);
        videoVieww = findViewById(R.id.videoVieww);
        mediaCc = new MediaController(this);

        vdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y111 = new Intent(read2.this, read.class);
                startActivity(y111);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
        vdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y222 = new Intent(read2.this, Dashboard.class);
                startActivity(y222);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

            }
        });



    }
    public void videoplay11(View view){

        String videopaths = "android.resource://" + getPackageName() + "/" + R.raw.abc;
        Uri uri = Uri.parse(videopaths);
        videoVieww.setVideoURI(uri);
        videoVieww.setMediaController(mediaCc);
        mediaCc.setAnchorView(videoVieww);
        videoVieww.start();


    }





}