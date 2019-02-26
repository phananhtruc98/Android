package pat.android.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lsv;
    ArrayList<String> arrayName;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsv = (ListView) findViewById(R.id.lsv);
        arrayName = new ArrayList<>();
        AddArrayName();
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayName);
        lsv.setAdapter(adapter);
        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                XacNhanXoa(position);
            }
        });
    }
    private  void XacNhanXoa(final int position){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setTitle("Thông báo!!");
        alertDialog.setMessage("Bạn có muốn xóa cái này không?");
        alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                arrayName.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
        alertDialog.show();
    }
    private void AddArrayName()
    {
        arrayName.add("Prince");
        arrayName.add("Dark Prince");
        arrayName.add("Princess");
        arrayName.add("Golem");
        arrayName.add("Mirror");
        arrayName.add("Ice wizard");
        arrayName.add("Goblin");

    }
}
