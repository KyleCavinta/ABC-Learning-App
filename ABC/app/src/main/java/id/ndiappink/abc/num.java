package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class num extends AppCompatActivity {

    private ImageButton ob1,ob2,ob3,ob4,ob5,ob6;

    DrawableView drawableView;
    DrawableViewConfig config;

    @Override
    public void onBackPressed() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num);

        ob1 =  findViewById(R.id.ob1);
        ob2 = findViewById(R.id.ob2);
        ob3 = findViewById(R.id.ob3);
        ob4 =  findViewById(R.id.ob4);
        ob5 = findViewById(R.id.ob5);

        ob6 = findViewById(R.id.ob6);

        drawableView = findViewById(R.id.paintView);

        config = new DrawableViewConfig();

        config.setStrokeColor(getResources().getColor(android.R.color.black));

        config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);

        drawableView.setConfig(config);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.zzero);
        ob6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        ob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ba = new Intent(num.this, Dashboard.class);
                startActivity(ba);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        ob3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ne = new Intent(num.this, one.class);
                startActivity(ne);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        ob4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawableView.clear();
            }
        });

    }
}
