package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class track extends AppCompatActivity {

    private ImageButton k1,k2,k3,k4,k5,k6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        k1 = findViewById(R.id.k1);
        k2 = findViewById(R.id.k2);
        k3 = findViewById(R.id.k3);
        k4 = findViewById(R.id.k4);
        k5 = findViewById(R.id.k5);

        k6 = findViewById(R.id.k6);
        final MediaPlayer kk11 = MediaPlayer.create(this,R.raw.kite);
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kk11.start();
            }
        });

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k11 = new Intent(track.this, tracj.class);
                startActivity(k11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k22 = new Intent(track.this, tracl.class);
                startActivity(k22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
