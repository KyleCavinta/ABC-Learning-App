package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracy extends AppCompatActivity {

    private ImageButton y1,y2,y3,y4,y5,y6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracy);

        y1 = findViewById(R.id.y1);
        y2 = findViewById(R.id.y2);
        y3 = findViewById(R.id.y3);
        y4 = findViewById(R.id.y4);
        y5 = findViewById(R.id.y5);

        y6 = findViewById(R.id.y6);
        final MediaPlayer yy11 = MediaPlayer.create(this,R.raw.yoyo);
        y6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yy11.start();
            }
        });

        y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y11 = new Intent(tracy.this, tracx.class);
                startActivity(y11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y22 = new Intent(tracy.this, tracz.class);
                startActivity(y22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
