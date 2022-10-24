package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class traco extends AppCompatActivity {

    private ImageButton o1,o2,o3,o4,o5,o6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traco);

        o1 = findViewById(R.id.o1);
        o2 = findViewById(R.id.o2);
        o3 = findViewById(R.id.o3);
        o4 = findViewById(R.id.o4);
        o5 = findViewById(R.id.o5);

        o6 = findViewById(R.id.o6);
        final MediaPlayer oo11 = MediaPlayer.create(this,R.raw.ostrich);
        o6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oo11.start();
            }
        });

        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o11 = new Intent(traco.this, tracn.class);
                startActivity(o11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o22 = new Intent(traco.this, tracp.class);
                startActivity(o22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
