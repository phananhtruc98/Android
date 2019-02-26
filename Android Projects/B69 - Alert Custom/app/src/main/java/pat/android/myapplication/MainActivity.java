package pat.android.myapplication;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtDangNhap;
   // EditText edtTk, edtPw;
    // Button btnDangNhap,btnHuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDangNhap = (TextView) findViewById(R.id.txtShowDialog);
        txtDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogLogin();
            }
        });
    }

    private void DialogLogin(){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(R.layout.custom_login_alert);
        final EditText edtTk = (EditText) dialog.findViewById(R.id.txtTaiKhoan);
        final EditText edtPw = (EditText) dialog.findViewById(R.id.txtMatkhau);
        final Button btnDangNhap = (Button) dialog.findViewById(R.id.btnDangNhap);
        final Button btnHuy = (Button) dialog.findViewById(R.id.btnHuy);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = edtTk.getText().toString().trim();
                String b = edtPw.getText().toString().trim();
                if(a.equals("trucphan") && b.equals("123")) {
                    Toast.makeText(MainActivity.this, "Thành công", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivity.this, "Thất bại", Toast.LENGTH_SHORT).show();
            }
        });
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
