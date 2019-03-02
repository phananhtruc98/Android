package pat.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Thongtin_Activity extends AppCompatActivity {
    TextView txtClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin);
        txtClick = (TextView) findViewById(R.id.txt);
        txtClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendObject();
            }
        });
    }

    public void sendObject(){
        Intent i = new Intent(this, testSendObject.class);
        thongtinclass tt = new thongtinclass("Trúc","0123456789","Chơi game","Đại học");
        i.putExtra("obj",tt);
        startActivity(i);
    }
}
