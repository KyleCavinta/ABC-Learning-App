package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class one extends AppCompatActivity {

    private ImageButton oo1,oo2,oo3,oo4,oo5,oo6;

    DrawableView drawableView;
    DrawableViewConfig config;

    @Override
    public void onBackPressed() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        oo1 =  findViewById(R.id.oo1);
        oo2 = findViewById(R.id.oo2);
        oo3 = findViewById(R.id.oo3);
        oo4 =  findViewById(R.id.oo4);
        oo5 = findViewById(R.id.oo5);

        oo6 = findViewById(R.id.oo6);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.oone);
        oo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        oo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ba = new Intent(one.this, num.class);
                startActivity(ba);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        oo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ne = new Intent(one.this, two.class);
                startActivity(ne);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

    }
}
