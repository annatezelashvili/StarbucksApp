package ge.edu.tsu.starbucksapp;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityOrderCoffee extends AppCompatActivity {

    private ListView mMenuListView;
    private MenuItemAdapter menuItemAdapter;
    //private Button mOrderCoffee;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mMenuListView = findViewById(R.id.menu_list);
        menuItemAdapter = new MenuItemAdapter(this, 0, MenuItem.values());
        mMenuListView.setAdapter(menuItemAdapter);
    }
        public void orderCoffee(View view) {
//            CheckBox checkBox = (CheckBox) view;
//            if (checkBox.isChecked()) {
                Intent intent = new Intent(ActivityOrderCoffee.this, ActivityOrderedCoffee.class);
                startActivity(intent);
//            }
        }


    class MenuItemAdapter extends ArrayAdapter<MenuItem> {

        private Context mContext;

        public MenuItemAdapter(@NonNull Context context, int resource, @NonNull MenuItem[] objects) {
            super(context, resource, objects);
            this.mContext = context;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.view_menu_item, parent, false);
            MenuItem menuItem = getItem(position);
            ((TextView) view.findViewById(R.id.text)).setText(menuItem.getName());
            ((TextView) view.findViewById(R.id.price)).setText(menuItem.getPrice());
            view.findViewById(R.id.icon).setBackgroundResource(menuItem.getIcon());
            return view;
        }
    }

    enum MenuItem {
        AMERICANO(R.drawable.americano, "americano","3.50"),
        ICED_COFFEE(R.drawable.ice_creamed, "iced coffee","4.50"),
        IRISH_COLD(R.drawable.irish_cold, "irish cold","5.20"),
        YUMMY(R.drawable.yummy, "marshmallowed","2.45"),
        AMERICANO2(R.drawable.americano, "americano","3.45"),
        ICED_COFFEE2(R.drawable.ice_creamed, "iced coffee","3.50"),
        IRISH_COLD2(R.drawable.irish_cold, "irish cold","3.95"),
        YUMMY2(R.drawable.yummy, "marshmallowed","3.55"),
        IRISH_COLD3(R.drawable.irish_cold, "irish cold","3.00"),
        YUMMY3(R.drawable.yummy, "marshmallowed","4.50");

        private int icon;
        private String name;
        private String price;

        MenuItem(int icon, String name,String price) {
            this.icon = icon;
            this.name = name;
            this.price= price;
        }

        public int getIcon() {
            return icon;
        }

        public String getName() {
            return name;
        }

        public String getPrice() {
            return price;
        }

    }

}
