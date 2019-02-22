package pat.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtThongTin;
    Button btnXacnhan;
    EditText edtTen, edtEmail, edtSdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtTen.getText().toString();
                String email = edtEmail.getText().toString();
                String sdt = edtSdt.getText().toString();
                String txtChaoBan = getResources().getString(R.string.text_Chaoban);
                String txtemail = getResources().getString(R.string.text_Email);
                String txtSdt = getResources().getString(R.string.text_Sodienthoai);
                txtThongTin.setText(txtChaoBan+": " + ten + "\n" + txtemail + ": " + email + "\n"+ txtSdt+": " + sdt);
            }
        });
    }

    private void AnhXa() {
        txtThongTin = (TextView) findViewById(R.id.txtThongTin);
        btnXacnhan = (Button) findViewById(R.id.btnXacnhan);
        edtTen = (EditText) findViewById(R.id.edtTen);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtSdt = (EditText) findViewById(R.id.edtSdt);
    }
}
