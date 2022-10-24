package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracf extends AppCompatActivity {

    private ImageButton f1,f2,f3,f4,f5,f6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracf);

        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);

        f6 = findViewById(R.id.f6);
        final MediaPlayer ff11 = MediaPlayer.create(this,R.raw.fish);
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ff11.start();
            }
        });

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent af = new Intent(tracf.this, traceE.class);
                startActivity(af);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aff = new Intent(tracf.this, tracg.class);
                startActivity(aff);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
