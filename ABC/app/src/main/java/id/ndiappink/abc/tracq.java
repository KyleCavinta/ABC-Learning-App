package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracq extends AppCompatActivity {

    private ImageButton q1,q2,q3,q4,q5,q6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracq);

        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        q5 = findViewById(R.id.q5);

        q6 = findViewById(R.id.q6);
        final MediaPlayer qq11 = MediaPlayer.create(this,R.raw.queen);
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qq11.start();
            }
        });

        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q11 = new Intent(tracq.this, tracp.class);
                startActivity(q11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q22 = new Intent(tracq.this, tracr.class);
                startActivity(q22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
