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

public class LifeCycleActivity extends AppCompatActivity {
    Button btnExit;
    TextView txtMes;
    LinearLayout myScreen1;
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_cycle);
        Toast.makeText(this,"on create",Toast.LENGTH_SHORT).show();
        myScreen1 = (LinearLayout) findViewById(R.id.layout);
        btnExit = (Button) findViewById(R.id.button);
        txtMes = (TextView) findViewById(R.id.textView);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitApp();
            }
        });
        txtMes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String color = s.toString().toLowerCase(Locale.US);
                changeBackground(color,myScreen1);
            }
        });
    }

    public void exitApp() {
        finish();
    }




    public void changeBackground(String color, LinearLayout myScreen1)
    {
        if(color.contains("red"))
            myScreen1.setBackgroundColor(Color.RED);
        if(color.contains("green"))
            myScreen1.setBackgroundColor(Color.GREEN);
        if(color.contains("blue"))
            myScreen1.setBackgroundColor(Color.BLUE);
        if(color.contains("white"))
            myScreen1.setBackgroundColor(Color.WHITE);

    }
}
