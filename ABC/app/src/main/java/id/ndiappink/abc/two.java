package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class two extends AppCompatActivity {

    private ImageButton tw1,tw2,tw3,tw4,tw5,tw6;

    DrawableView drawableView;
    DrawableViewConfig config;

    @Override
    public void onBackPressed() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tw1 =  findViewById(R.id.tw1);
        tw2 = findViewById(R.id.tw2);
        tw3 = findViewById(R.id.tw3);
        tw4 =  findViewById(R.id.tw4);
        tw5 = findViewById(R.id.tw5);

        tw6 = findViewById(R.id.tw6);

        drawableView = findViewById(R.id.paintView);

        config = new DrawableViewConfig();

        config.setStrokeColor(getResources().getColor(android.R.color.black));

        config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);

        drawableView.setConfig(config);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.ttwo);
        tw6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        tw1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ba = new Intent(two.this, one.class);
            startActivity(ba);
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        }
    });

        tw3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ne = new Intent(two.this, three.class);
            startActivity(ne);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        }
    });
        tw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawableView.clear();
            }
        });
}
}
