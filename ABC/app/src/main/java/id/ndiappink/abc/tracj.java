package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracj extends AppCompatActivity {

    private ImageButton j1,j2,j3,j4,j5,j6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracj);

        j1 = findViewById(R.id.j1);
        j2 = findViewById(R.id.j2);
        j3 = findViewById(R.id.j3);
        j4 = findViewById(R.id.j4);
        j5 = findViewById(R.id.j5);

        j6 = findViewById(R.id.j6);
        final MediaPlayer jj11 = MediaPlayer.create(this,R.raw.jacket);
        j6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jj11.start();
            }
        });

        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j11 = new Intent(tracj.this, traci.class);
                startActivity(j11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j22 = new Intent(tracj.this, track.class);
                startActivity(j22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}

