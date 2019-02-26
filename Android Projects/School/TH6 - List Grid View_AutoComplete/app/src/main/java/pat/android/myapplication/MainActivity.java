package pat.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView _myList;
    TextView _mytxtCity;
    //ArrayAdapter<String> adapter;
    Integer[] thumb ={R.drawable.aboutusicon,R.drawable.librarian,R.drawable.acc,R.drawable.librarian,R.drawable.aboutusicon};
    String[] items ={"Hà Nội", "TP. Hồ Chí Minh","Đà Nẵng", "Hải Phòng", "Cần Thơ"};
    CustomIconLabelAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        _myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = items[position];
                thongbao(item);
            }
        });
    }
    public void thongbao(String t)
    {
        Toast.makeText(this, t.toString(), Toast.LENGTH_SHORT).show();
        _mytxtCity.setText("Đang chọn: " + t);
    }
    private void AnhXa() {
        _myList = (ListView) findViewById(R.id.myList);
        _mytxtCity = (TextView) findViewById(R.id.txtCity);
        adapter = new CustomIconLabelAdapter(this,R.layout.my_custom_layout_list1,items,thumb);
        _myList.setAdapter(adapter);
    }

}
