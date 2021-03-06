package ge.edu.tsu.starbucksapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {
    private Button mLogIn;
    private Button mSignUp;
    private EditText mUserName;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLogIn=findViewById(R.id.login);
        mSignUp=findViewById(R.id.register);
        mUserName=findViewById(R.id.username);
        mPassword=findViewById(R.id.password);

      mLogIn.setOnClickListener(new View.OnClickListener() {
        @Override

        public void onClick(View v) {
            if (mUserName.getText().toString().equals("starbucks_user") && mPassword.getText().toString().equals("starbucks123")) {
                Intent intent = new Intent(ActivityLogin.this, ActivityAbout.class);
                startActivity(intent);
            } else if (mUserName.getText().toString().equals("") || mPassword.getText().toString().equals("")) {
                Toast.makeText(ActivityLogin.this, "Please, fill required fields! ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ActivityLogin.this, "Incorrect Username or Password! ", Toast.LENGTH_SHORT).show();
            }
        }
        });
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent intent=new Intent(ActivityLogin.this, ActivitySignUp.class);
                startActivity(intent);
            }
        });
    }
}