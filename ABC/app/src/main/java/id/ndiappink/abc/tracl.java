package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracl extends AppCompatActivity {

    private ImageButton l1,l2,l3,l4,l5,l6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracl);

        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        l4 = findViewById(R.id.l4);
        l5 = findViewById(R.id.l5);

        l6 = findViewById(R.id.l6);
        final MediaPlayer ll11 = MediaPlayer.create(this,R.raw.lion);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll11.start();
            }
        });

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l11 = new Intent(tracl.this, track.class);
                startActivity(l11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l22 = new Intent(tracl.this, tracm.class);
                startActivity(l22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}