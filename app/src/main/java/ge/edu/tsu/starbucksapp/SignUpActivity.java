package ge.edu.tsu.starbucksapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    private Button mCreateAccount;
    private EditText mFullName;
    private EditText mEmailOrPhone;
    private EditText mPass;
    public  String newUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mCreateAccount=findViewById(R.id.signup);
        mFullName=findViewById(R.id.fullName);
        mEmailOrPhone=findViewById(R.id.emailOrPhonenumber);
        mPass=findViewById(R.id.newPassword);
        mCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(mFullName.getText().toString().equals("")
                        || mEmailOrPhone.getText().toString().equals("")
                        || mPass.getText().toString().equals("")
                ){

                    Toast.makeText(SignUpActivity.this, "All fields are required. /n Please fill them! ", Toast.LENGTH_SHORT).show();
                }
                else if (mPass.getText().toString().length()<8 || mPass.getText().toString().length()>12 ){
                    Toast.makeText(SignUpActivity.this, " Password must be from 8 to 12 symbols", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(SignUpActivity.this,ActivitySuccess.class);
                    intent.putExtra("newUserName",mFullName.getText().toString());
                   startActivity(intent);

                }

            }
        });
    }
}
