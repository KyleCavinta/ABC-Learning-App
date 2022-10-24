package id.ndiappink.abc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class five extends AppCompatActivity {

    private ImageButton fi1,fi2,fi3,fi4,fi5,fi6;

    DrawableView drawableView;
    DrawableViewConfig config;

    @Override
    public void onBackPressed() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        fi1 =  findViewById(R.id.fi1);
        fi2 = findViewById(R.id.fi2);
        fi3 = findViewById(R.id.fi3);
        fi4 =  findViewById(R.id.fi4);
        fi5 = findViewById(R.id.fi5);

        fi6 = findViewById(R.id.fi6);

        drawableView = findViewById(R.id.paintView);

        config = new DrawableViewConfig();

        config.setStrokeColor(getResources().getColor(android.R.color.black));

        config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);

        drawableView.setConfig(config);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.ffive);
        fi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        fi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ba = new Intent(five.this, four.class);
                startActivity(ba);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        fi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ne = new Intent(five.this, six.class);
                startActivity(ne);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        fi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawableView.clear();
            }
        });

    }
}
