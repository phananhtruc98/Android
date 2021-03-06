package pat.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BMIKQActivity extends AppCompatActivity {
    TextView t, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmikq);
        Bundle extras = getIntent().getExtras();
        String h = extras.getString("chieucao");
        String w = extras.getString("cannang");
        bmi obj = new
                bmi(Double.parseDouble(h), Double.parseDouble(w));
        double bmi = obj.getBMI();
        String kq = obj.getChanDoan();
        t = (TextView) findViewById(R.id.txtBMIKQ);
        t2 = (TextView) findViewById(R.id.txtBMIKQ2);
        t.setText(String.valueOf(bmi));
        t2.setText(kq);
    }
}
