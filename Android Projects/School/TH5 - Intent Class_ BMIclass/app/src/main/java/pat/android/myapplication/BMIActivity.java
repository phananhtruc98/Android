package pat.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BMIActivity extends AppCompatActivity {

    EditText hoten, chieucao, cannang, chisobmi, chandoan;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        hoten = (EditText)findViewById(R.id.txtTen);
        chieucao = (EditText)findViewById(R.id.txtChieuCao);
        cannang = (EditText)findViewById(R.id.txtCanNang);
        bt = (Button)findViewById(R.id.btnTinh);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callKetQuaBMI(v);
            }
        });
    }


    public void callKetQuaBMI(View v)
    {
        Intent i = new Intent(getApplicationContext(),
                BMIKQActivity.class);
        i.putExtra("chieucao", chieucao.getText().toString());
        i.putExtra("cannang",cannang.getText().toString());
        startActivity(i);
    }

}
