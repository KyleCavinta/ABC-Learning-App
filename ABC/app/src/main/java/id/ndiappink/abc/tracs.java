package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracs extends AppCompatActivity {

    private ImageButton s1,s2,s3,s4,s5,s6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracs);

        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);
        s5 = findViewById(R.id.s5);

        s6 = findViewById(R.id.s6);
        final MediaPlayer ss11 = MediaPlayer.create(this,R.raw.sun);
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss11.start();
            }
        });

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s11 = new Intent(tracs.this, tracr.class);
                startActivity(s11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s22 = new Intent(tracs.this, tract.class);
                startActivity(s22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
