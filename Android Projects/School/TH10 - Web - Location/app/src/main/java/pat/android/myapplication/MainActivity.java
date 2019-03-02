package pat.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    ItemList[] items;
    CustomListItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareData();
        adapter = new CustomListItemAdapter(this,R.layout.list_item_link_img,items);
        lst = (ListView) findViewById(R.id.lsttour);
        lst.setAdapter(adapter);
    }
    private void prepareData(){
        items = new ItemList[2];
        items[0] = new ItemList("Quán ăn ngon Sài Gòn",
                "http://www.google.com",
                "geo:0,0?q=14+Đồng+Đen+phường+14+Hồ+Chí+Minh+Bến+Nghé",
                 R.drawable.chibiredking);
        items[1] = new ItemList("Ngon Restaurant",
                "http://www.google.com",
                "geo:0,0?q=160+Pasteur+Bến+Nghé+Quận+1+Hồ+Chí+Minh",
                R.drawable.prince);
    }
}
