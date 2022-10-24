package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracD extends AppCompatActivity {

    private ImageButton d1,d2,d3,d4,d5,d6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trac_d);

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);

        d6 = findViewById(R.id.d6);
        final MediaPlayer dd11 = MediaPlayer.create(this,R.raw.dog);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dd11.start();
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d11 = new Intent(tracD.this, tracC.class);
                startActivity(d11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d22 = new Intent(tracD.this, traceE.class);
                startActivity(d22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
