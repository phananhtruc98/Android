package pat.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {
    GridView grid;
    TextView txtMsg;
    String[] items = {"Data-0","Data-1","Data-2","Data-3","Data-4","Data-5","Data-6","Data-7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        txtMsg = (TextView) findViewById(R.id.txtMsg);
         grid = (GridView) findViewById(R.id.grid);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                GridViewActivity.this,
                android.R.layout.simple_list_item_1,
                items);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,items[position],Toast.LENGTH_SHORT).show();
                txtMsg.setText(items[position]);
            }
        });
    }
}
