package pat.android.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomIconLabelAdapter extends ArrayAdapter<String> {
    Context context;
    Integer[] thumbnail;
    String[] items;
    public CustomIconLabelAdapter(Context context, int layoutTobeInflated, String[] items, Integer[] thumbnail)
    {
        super(context, R.layout.my_custom_layout_list1, items);
        this.context = context;
        this.thumbnail = thumbnail;
        this.items = items;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.my_custom_layout_list1, null);
        TextView label = (TextView) row.findViewById(R.id.label);
        ImageView icon = (ImageView) row.findViewById(R.id.icon);
        label.setText(items[position]);
        icon.setImageResource(thumbnail[position]);
        return row;
    }
}
