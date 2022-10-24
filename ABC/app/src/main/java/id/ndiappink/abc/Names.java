package id.ndiappink.abc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Names extends AppCompatActivity{

    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;
    private String UserId;

    private EditText user, email;
    private Button  bbb, ccc;


    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);


        user = findViewById(R.id.txtName);
        email = findViewById(R.id.txtEmail);
        bbb = findViewById(R.id.bbb);
        ccc = findViewById(R.id.ccc);

        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase= mFirebaseInstance.getReference("DataUsers");
        UserId = mFirebaseDatabase.push().getKey();


        ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neff = new Intent(Names.this, Dashboard.class);
                startActivity(neff);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });


            bbb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent barrw = new Intent(Names.this, MainActivity.class);
                    startActivity(barrw);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                }
            });
    }

    public void addUser(String username,String email)
    {
        User users = new User(username,email);
        mFirebaseDatabase.child("Users").child(UserId).setValue(users);
    }

        public void insertData(View view)
        {
            addUser(user.getText().toString(),email.getText().toString().trim());
        }



}


