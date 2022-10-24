package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tracn extends AppCompatActivity {


    private ImageButton n1,n2,n3,n4,n5,n6;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracn);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);

        n6 = findViewById(R.id.n6);
        final MediaPlayer nn11 = MediaPlayer.create(this,R.raw.nose);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nn11.start();
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n11 = new Intent(tracn.this, tracm.class);
                startActivity(n11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n22 = new Intent(tracn.this, traco.class);
                startActivity(n22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
