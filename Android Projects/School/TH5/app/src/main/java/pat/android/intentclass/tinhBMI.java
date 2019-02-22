package pat.android.intentclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class tinhBMI extends AppCompatActivity {
    EditText edtChieuCao, edtCanNang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinh_bmi);
        edtChieuCao = (EditText) findViewById(R.id.edtChieuCao);
        edtCanNang = (EditText) findViewById(R.id.edtCanNang);
    }

    public void callKetQuaBMI(View view)
    {
        Intent i = new Intent(getApplicationContext(),tinhBMIKQ.class);
        i.putExtra("chieucao", edtChieuCao.getText().toString());
        i.putExtra("cannang", edtCanNang.getText().toString());
        startActivity(i);
    }
}
