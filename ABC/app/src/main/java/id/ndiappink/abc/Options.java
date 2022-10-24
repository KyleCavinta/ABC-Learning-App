package id.ndiappink.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Options extends AppCompatActivity {

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        getSupportActionBar().setTitle(" ");

    }
}
