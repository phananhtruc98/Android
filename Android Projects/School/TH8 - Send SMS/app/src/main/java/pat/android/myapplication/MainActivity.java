package pat.android.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtNumRev;
    private EditText edtContent;
    private Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumRev = (EditText)findViewById(R.id.edtPhoneNumber);
        edtContent = (EditText)findViewById(R.id.edtContent);
        btnSend = (Button)findViewById(R.id.button);
        btnSend.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                composeSmsMessage(edtNumRev.getText().toString(),
                        edtContent.getText().toString());
                }
        });
    }
    public void composeSmsMessage(String to, String message)
    {
        if(!TextUtils.isEmpty(to) && !TextUtils.isEmpty(message)){
            if(checkPermission(Manifest.permission.SEND_SMS)){
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(to.toString(),null,message.toString(),null,null);
            }
            else
            {
                Toast.makeText(this,"Nhập số điện thoại và nội dung",Toast.LENGTH_SHORT).show();
            }
        }
    }
    private boolean checkPermission(String permission){
        int check = ContextCompat.checkSelfPermission(this,permission);
        return  check == PackageManager.PERMISSION_GRANTED;
    }
}
