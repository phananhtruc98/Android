package pat.android.life_cycle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class test extends AppCompatActivity {
    Button btnExit;
    TextView txtMes;
    LinearLayout myScreen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_cycle);
        Toast.makeText(this, "on create", Toast.LENGTH_SHORT).show();
        myScreen1 = (LinearLayout) findViewById(R.id.layout);
        btnExit = (Button) findViewById(R.id.button);
        txtMes = (TextView) findViewById(R.id.textView);
    }
}

