package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class trach extends AppCompatActivity {

    private ImageButton h1,h2,h3,h4,h5,h6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trach);

        h1 = findViewById(R.id.h1);
        h2 = findViewById(R.id.h2);
        h3 = findViewById(R.id.h3);
        h4 = findViewById(R.id.h4);
        h5 = findViewById(R.id.h5);

        h6 = findViewById(R.id.h6);
        final MediaPlayer hh11 = MediaPlayer.create(this,R.raw.hat);
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hh11.start();
            }
        });

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h11 = new Intent(trach.this, tracg.class);
                startActivity(h11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h22 = new Intent(trach.this, traci.class);
                startActivity(h22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}