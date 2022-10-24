package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracp extends AppCompatActivity {

    private ImageButton p1,p2,p3,p4,p5,p6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracp);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);

        p6 = findViewById(R.id.p6);
        final MediaPlayer pp11 = MediaPlayer.create(this,R.raw.pig);
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pp11.start();
            }
        });

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p11 = new Intent(tracp.this, traco.class);
                startActivity(p11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p22 = new Intent(tracp.this, tracq.class);
                startActivity(p22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
