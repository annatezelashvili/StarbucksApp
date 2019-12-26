package ge.edu.tsu.starbucksapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.security.auth.callback.Callback;

public class OrderAboutFragment extends Fragment implements View.OnClickListener {
    private View mView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_order_about, container, false);

return mView;
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.log_out:
                Intent intent_logout=new Intent(mView.getContext(),LoginActivity.class);
                startActivity(intent_logout);
                break;
            case R.id.contact_us:
                Intent intent_contact=new Intent(mView.getContext(),ActivityContactUs.class);
                startActivity(intent_contact);
                break;
            case R.id.order_coffee:
                Intent intent_order=new Intent(mView.getContext(),ActivityOrderCoffee.class);
                startActivity(intent_order);
                break;
        }}
}

