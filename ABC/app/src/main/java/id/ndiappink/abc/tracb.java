package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class tracb extends AppCompatActivity {

    private ImageButton wer1,wer2,wer3,wer4,wer5,wer6;

    DrawableView drawableView;
    DrawableViewConfig config;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracb);

        wer1 =  findViewById(R.id.wer1);
        wer2 = findViewById(R.id.wer2);
        wer3 = findViewById(R.id.wer3);
        wer4 =  findViewById(R.id.wer4);
        wer5 = findViewById(R.id.wer5);
        drawableView = findViewById(R.id.paintView);

        wer6 = findViewById(R.id.wer6);

        config = new DrawableViewConfig();

        config.setStrokeColor(getResources().getColor(android.R.color.black));

        config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);

        drawableView.setConfig(config);

        final MediaPlayer b11 = MediaPlayer.create(this,R.raw.bear);
        wer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b11.start();
            }
        });

        wer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wrr = new Intent(tracb.this, traca.class);
                startActivity(wrr);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
        wer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tears = new Intent(tracb.this, tracC.class);
                startActivity(tears);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

            }
        });

        wer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawableView.clear();
            }
        });
    }
}

