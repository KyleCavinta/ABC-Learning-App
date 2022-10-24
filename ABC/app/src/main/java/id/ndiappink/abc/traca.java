package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class traca extends AppCompatActivity {

    DrawableView drawableView;
    DrawableViewConfig config;


    private ImageButton ter1,ter2,ter3,ter4,ter5,ter6;


    @Override
    public void onBackPressed() {}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traca);
        ter1 =  findViewById(R.id.ter1);
        ter2 = findViewById(R.id.ter2);
        ter3 = findViewById(R.id.ter3);
        ter4 =  findViewById(R.id.ter4);
        ter5 = findViewById(R.id.ter5);


        ter6 = findViewById(R.id.ter6);
        drawableView = findViewById(R.id.paintView);

        config = new DrawableViewConfig();

        config.setStrokeColor(getResources().getColor(android.R.color.black));

        config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);

        drawableView.setConfig(config);

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.apple);
        ter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });



        ter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y11 = new Intent(traca.this, Dashboard.class);
                startActivity(y11);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
        ter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y22 = new Intent(traca.this, tracb.class);
                startActivity(y22);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

            }
        });

        ter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawableView.clear();
            }
        });


        }

    }

