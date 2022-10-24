package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracw extends AppCompatActivity {

    private ImageButton w1,w2,w3,w4,w5,w6;

    @Override
    public void onBackPressed() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracw);
        w1 = findViewById(R.id.w1);
        w2 = findViewById(R.id.w2);
        w3 = findViewById(R.id.w3);
        w4 = findViewById(R.id.w4);
        w5 = findViewById(R.id.w5);

        w6 = findViewById(R.id.w6);
        final MediaPlayer ww11 = MediaPlayer.create(this,R.raw.wagon);
        w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ww11.start();
            }
        });

        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w11 = new Intent(tracw.this, tracv.class);
                startActivity(w11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w22 = new Intent(tracw.this, tracx.class);
                startActivity(w22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
