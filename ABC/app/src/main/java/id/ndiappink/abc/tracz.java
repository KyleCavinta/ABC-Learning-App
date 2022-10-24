package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracz extends AppCompatActivity {

    private ImageButton z1,z2,z3,z4,z5,z6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracz);

        z1 = findViewById(R.id.z1);
        z2 = findViewById(R.id.z2);
        z3 = findViewById(R.id.z3);
        z4 = findViewById(R.id.z4);
        z5 = findViewById(R.id.z5);

        z6 = findViewById(R.id.z6);
        final MediaPlayer zz11 = MediaPlayer.create(this,R.raw.zebra);
        z6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zz11.start();
            }
        });

        z1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z11 = new Intent(tracz.this, tracy.class);
                startActivity(z11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        z3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z22 = new Intent(tracz.this, Dashboard.class);
                startActivity(z22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}