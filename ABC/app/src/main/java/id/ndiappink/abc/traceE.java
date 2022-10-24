package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class traceE extends AppCompatActivity {

    private ImageButton e1,e2,e3,e4,e5,e6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trace_e);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);

        e6 = findViewById(R.id.e6);
        final MediaPlayer ee11 = MediaPlayer.create(this,R.raw.egg);
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ee11.start();
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ae = new Intent(traceE.this, tracD.class);
                startActivity(ae);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aee = new Intent(traceE.this, tracf.class);
                startActivity(aee);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
