package pat.android.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class AutoComplete extends Activity implements TextWatcher {
    TextView txtMessage;
    AutoCompleteTextView txtAutoComplete;
    String[] itemsAutoComplete = {"words", "starting","with","set","Setback",
    "Setline","Setoffs","Setouts","Setters","Setting",
    "Settled","Settler","Wordless","Wordiness","Adios"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        txtMessage = (TextView) findViewById(R.id.txtMessage);
        txtAutoComplete = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        txtAutoComplete.addTextChangedListener(this);
        txtAutoComplete.setAdapter(new ArrayAdapter<String>(
                                    AutoComplete.this,
                                    android.R.layout.simple_list_item_single_choice,
                itemsAutoComplete));
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        txtMessage.setText(txtAutoComplete.getText());
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
