package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracg extends AppCompatActivity {

    private ImageButton g1,g2,g3,g4,g5,g6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracg);

        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);

        g6 = findViewById(R.id.g6);
        final MediaPlayer gg11 = MediaPlayer.create(this,R.raw.goat);
        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg11.start();
            }
        });

        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g11 = new Intent(tracg.this, tracf.class);
                startActivity(g11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g22 = new Intent(tracg.this, trach.class);
                startActivity(g22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
