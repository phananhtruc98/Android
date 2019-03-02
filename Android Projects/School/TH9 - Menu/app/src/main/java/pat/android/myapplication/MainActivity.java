package pat.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.custom_menu, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuLanguage:
                Intent i1 = new Intent(getApplicationContext(),
                        thongtin_multilanguage.class);
                startActivity(i1);
                break;
            case R.id.menuSendsms:
                Intent i2 = new Intent(getApplicationContext(), testSendSMS.class);
                startActivity(i2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
