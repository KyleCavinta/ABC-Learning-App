package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracx extends AppCompatActivity {
    private ImageButton x1,x2,x3,x4,x5,x6;

    @Override
    public void onBackPressed() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracx);
        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);
        x3 = findViewById(R.id.x3);
        x4 = findViewById(R.id.x4);
        x5 = findViewById(R.id.x5);

        x6 = findViewById(R.id.x6);
        final MediaPlayer xx11 = MediaPlayer.create(this,R.raw.xray);
        x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xx11.start();
            }
        });

        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x11 = new Intent(tracx.this, tracw.class);
                startActivity(x11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x22 = new Intent(tracx.this, tracy.class);
                startActivity(x22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}