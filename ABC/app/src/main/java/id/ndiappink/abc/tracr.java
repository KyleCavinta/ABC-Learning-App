package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracr extends AppCompatActivity {

    private ImageButton r1,r2,r3,r4,r5,r6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracr);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);

        r6 = findViewById(R.id.r6);
        final MediaPlayer rr11 = MediaPlayer.create(this,R.raw.rabbit);
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rr11.start();
            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r11 = new Intent(tracr.this, tracq.class);
                startActivity(r11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r22 = new Intent(tracr.this, tracs.class);
                startActivity(r22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
