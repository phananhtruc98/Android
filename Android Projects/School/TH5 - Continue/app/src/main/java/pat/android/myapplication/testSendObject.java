package pat.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class testSendObject extends AppCompatActivity {
    EditText mInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_send_object);
        mInfo = (EditText) findViewById(R.id.editText);
        Intent i = getIntent();
        thongtinclass tt = (thongtinclass)i.getSerializableExtra("obj");
        mInfo.setText(tt.toString());
    }
}
