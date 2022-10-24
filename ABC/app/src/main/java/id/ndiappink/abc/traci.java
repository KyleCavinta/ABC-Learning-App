package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class traci extends AppCompatActivity {

    private ImageButton i1,i2,i3,i4,i5,i6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traci);

        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);

        i6 = findViewById(R.id.i6);
        final MediaPlayer ii11 = MediaPlayer.create(this,R.raw.igloo);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ii11.start();
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(traci.this, trach.class);
                startActivity(i11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i22 = new Intent(traci.this, tracj.class);
                startActivity(i22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}