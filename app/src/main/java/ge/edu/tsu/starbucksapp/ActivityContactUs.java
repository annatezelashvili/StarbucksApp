package ge.edu.tsu.starbucksapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityContactUs extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }

    public void openBrowser(View view) {
        String url = (String) view.getTag();
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
//
//    public void phoneCall(View view){
//        TextView phoneNumber=(findViewById(R.id.phone_number);
//        String mPhoneNumber=phoneNumber.toString();
//        Uri number = Uri.parse(StringBuilder("tel:%s",mPhoneNumber));
//        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
//    }
}
