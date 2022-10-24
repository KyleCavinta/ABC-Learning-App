package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class three extends AppCompatActivity {

    private ImageButton th1,th2,th3,th4,th5,th6;

    DrawableView drawableView;
    DrawableViewConfig config;
    @Override
    public void onBackPressed() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        th1 =  findViewById(R.id.th1);
        th2 = findViewById(R.id.th2);
        th3 = findViewById(R.id.th3);
        th4 =  findViewById(R.id.th4);
        th5 = findViewById(R.id.th5);

        th6 = findViewById(R.id.th6);

        drawableView = findViewById(R.id.paintView);

        config = new DrawableViewConfig();

        config.setStrokeColor(getResources().getColor(android.R.color.black));

        config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);

        drawableView.setConfig(config);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.tthree);
        th6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        th1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ba = new Intent(three.this, two.class);
                startActivity(ba);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        th3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ne = new Intent(three.this, four.class);
                startActivity(ne);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        th4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawableView.clear();
            }
        });

    }
}
