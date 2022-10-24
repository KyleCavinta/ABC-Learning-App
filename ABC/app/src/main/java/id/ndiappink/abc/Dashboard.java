package id.ndiappink.abc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    private ImageButton ib1,ib2,ib3,ib4;
    private Button ib5;

    @Override
    public void onBackPressed() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ib1 =  findViewById(R.id.ib1);
        ib2 = findViewById(R.id.ib2);
        ib3 = findViewById(R.id.ib3);
        ib4 = findViewById(R.id.ib4);
        ib5 = findViewById(R.id.ib5);


        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trace = new Intent (Dashboard.this, traca.class);
                startActivity(trace);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent no = new Intent(Dashboard.this, num.class);
                startActivity(no);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wo = new Intent(Dashboard.this, read.class);
                startActivity(wo);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dr = new Intent(Dashboard.this, draw.class);
                startActivity(dr);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bcs = new Intent(Dashboard.this, MainActivity.class);
                startActivity(bcs);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}