package pat.android.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSEND;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSEND = (Button) findViewById(R.id.button);

    }

    @Override
    public void onBackPressed() {
        XacNhanExit();
    }

    public void XacNhanExit(){
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setTitle("Xác nhận");
        info.setMessage("Bạn có chắc muốn thoát?");
        info.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        info.setNegativeButton("Hủy bỏ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = info.create();
        dialog.show();
    }
}
