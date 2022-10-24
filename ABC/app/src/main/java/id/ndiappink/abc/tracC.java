package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class tracC extends AppCompatActivity {

    private ImageButton c1,c2,c3,c4,c5,c6;

    DrawableView drawableView;
    DrawableViewConfig config;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trac_c);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        drawableView = findViewById(R.id.paintView);

        c6 = findViewById(R.id.c6);

        config = new DrawableViewConfig();

        config.setStrokeColor(getResources().getColor(android.R.color.black));

        config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);

        drawableView.setConfig(config);

        final MediaPlayer cc11 = MediaPlayer.create(this,R.raw.cat);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cc11.start();
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c11 = new Intent(tracC.this, tracb.class);
                startActivity(c11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c22 = new Intent(tracC.this, tracD.class);
                startActivity(c22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawableView.clear();
            }
        });
    }
}