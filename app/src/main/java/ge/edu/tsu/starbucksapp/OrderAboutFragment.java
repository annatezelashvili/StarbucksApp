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

public class OrderAboutFragment extends Fragment  {
    private View mView;
    private Button mLogOut;
    private Button mContactUs;
    private Button mOrderCoffee;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_order_about, container, false);
        mLogOut=mView.findViewById(R.id.log_out);
        mContactUs=mView.findViewById(R.id.contact_us);
        mOrderCoffee=mView.findViewById(R.id.order_coffee);
        mLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mView.getContext(),ActivityLogin.class);
                startActivity(intent);
            }
        });
        mContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mView.getContext(),ActivityContactUs.class);
                startActivity(intent);
            }
        });
        mOrderCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mView.getContext(),ActivityOrderCoffee.class);
                startActivity(intent);
            }
        });
        return mView;
    }

    //    @Override
//    public void onClick(View v){
//        switch (v.getId()){
//            case R.id.log_out:
//                Intent intent_logout=new Intent(mView.getContext(),ActivityLogin.class);
//                startActivity(intent_logout);
//                break;
//            case R.id.contact_us:
//                Intent intent_contact=new Intent(mView.getContext(),ActivityContactUs.class);
//                startActivity(intent_contact);
//                break;
//            case R.id.order_coffee:
//                Intent intent_order=new Intent(mView.getContext(),ActivityOrderCoffee.class);
//                startActivity(intent_order);
//                break;
//        }}

}

