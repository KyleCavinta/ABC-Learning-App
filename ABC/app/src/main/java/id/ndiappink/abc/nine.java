package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class nine extends AppCompatActivity {

    private ImageButton ni1,ni2,ni3,ni4,ni5,ni6;

    DrawableView drawableView;
    DrawableViewConfig config;

    @Override
    public void onBackPressed() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);

        ni1 =  findViewById(R.id.ni1);
        ni2 = findViewById(R.id.ni2);
        ni3 = findViewById(R.id.ni3);
        ni4 =  findViewById(R.id.ni4);
        ni5 = findViewById(R.id.ni5);

        ni6 = findViewById(R.id.ni6);
        drawableView = findViewById(R.id.paintView);

        config = new DrawableViewConfig();

        config.setStrokeColor(getResources().getColor(android.R.color.black));

        config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);

        drawableView.setConfig(config);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.nnine);
        ni6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        ni1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ba = new Intent(nine.this, eight.class);
                startActivity(ba);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        ni3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baba = new Intent(nine.this, Dashboard.class);
                startActivity(baba);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        ni4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawableView.clear();
            }
        });
    }
}