package ge.edu.tsu.starbucksapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySuccess extends AppCompatActivity {
    private TextView userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        userName=findViewById(R.id.welcome);
        Intent newIntent=getIntent();
        Bundle bundle = newIntent.getExtras();
        if(bundle!= null)
        {
          userName.setText(String.format("Welcome,%s!", bundle.get("newUserName")));
        }
    }

}
