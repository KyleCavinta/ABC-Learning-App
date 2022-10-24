package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracu extends AppCompatActivity {
    private ImageButton u1,u2,u3,u4,u5,u6;

    @Override
    public void onBackPressed() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracu);

        u1 = findViewById(R.id.u1);
        u2 = findViewById(R.id.u2);
        u3 = findViewById(R.id.u3);
        u4 = findViewById(R.id.u4);
        u5 = findViewById(R.id.u5);

        u6 = findViewById(R.id.u6);
        final MediaPlayer uu11 = MediaPlayer.create(this,R.raw.umbrella);
        u6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uu11.start();
            }
        });

        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u11 = new Intent(tracu.this, tract.class);
                startActivity(u11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        u3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u22 = new Intent(tracu.this, tracv.class);
                startActivity(u22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
