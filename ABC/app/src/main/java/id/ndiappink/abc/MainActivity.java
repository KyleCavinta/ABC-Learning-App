package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_ply, btn_opt, btn_hlp;

    boolean twice;
    final String TAG = this.getClass().getName();

    @Override
    public void onBackPressed() {
        Log.d(TAG, "click");

        if (twice == true) {
            Intent in11 = new Intent(Intent.ACTION_MAIN);
            in11.addCategory(Intent.CATEGORY_HOME);
            in11.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            System.exit(0);
        }
        Log.d(TAG, "twice: " + twice);
        twice = true;

        Toast.makeText(MainActivity.this, "Please press Back again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                twice = false;
                Log.d(TAG, "twice: " + false);

            }
        }, 3000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ply = findViewById(R.id.btn_ply);
        btn_opt = findViewById(R.id.btn_opt);
        btn_hlp = findViewById(R.id.btn_hlp);

        btn_ply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNames();
            }
        });

        btn_opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOptions();
            }
        });

        btn_hlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhelp();
            }
        });
    }


    public void openNames() {
        Intent dash = new Intent(this, Names.class);
        startActivity(dash);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }
    public void openOptions(){
        Intent opt = new Intent(this, Options.class);
        startActivity(opt);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


}
    public void openhelp(){
        Intent help = new Intent(this, help.class);
        startActivity(help);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}