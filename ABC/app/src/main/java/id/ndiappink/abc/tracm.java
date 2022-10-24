package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracm extends AppCompatActivity {

    private ImageButton m1,m2,m3,m4,m5,m6;

    @Override
    public void onBackPressed() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracm);

        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);
        m3 = findViewById(R.id.m3);
        m4 = findViewById(R.id.m4);
        m5 = findViewById(R.id.m5);

        m6 = findViewById(R.id.m6);
        final MediaPlayer mm11 = MediaPlayer.create(this,R.raw.monkey);
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mm11.start();
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m11 = new Intent(tracm.this, tracl.class);
                startActivity(m11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m22 = new Intent(tracm.this, tracn.class);
                startActivity(m22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
