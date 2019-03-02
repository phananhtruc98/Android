package pat.android.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CustomListItemAdapter extends ArrayAdapter<ItemList> {
    Context context;
    ItemList[] items;
    public  CustomListItemAdapter(Context context, int layoutTobeInflated, ItemList[] items)
    {
        super(context,R.layout.list_item_link_img,items);
        this.context = context;
        this.items = items;
    }
    private View.OnClickListener itemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.foodName:
                    String f1 = (String) v.getTag();
                    Toast.makeText(context,f1.toString(),Toast.LENGTH_SHORT).show();
                    showView(f1.toString());
                    return;
                case R.id.foodImage:
                    ImageView fi = (ImageView)v;
                    String floc = (String) fi.getTag();
                    Toast.makeText(context,floc.toString(),Toast.LENGTH_SHORT).show();
                    showView(floc.toString());
                    return;
            }
        }
    };
    private void showView(String v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v));
        if(intent.resolveActivity(context.getPackageManager())!= null);
        context.startActivity(intent);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.list_item_link_img,null);
        TextView foodName = (TextView) row.findViewById(R.id.foodName);
        ImageView foodImage = (ImageView) row.findViewById(R.id.foodImage);
        TextView foodLink = (TextView) row.findViewById(R.id.foodLink);
        TextView foodLocation = (TextView) row.findViewById(R.id.foodLocation);

        foodName.setText(items[position].getFoodName().toString());
        foodLink.setText(items[position].getFoodLink().toString());
        foodName.setTag(foodLink.getText().toString());
        foodImage.setImageResource(items[position].getFoodImage());
        foodLocation.setText(items[position].getFoodLocation().toString());
        foodImage.setTag(foodLocation.getText().toString());
        foodName.setOnClickListener(itemClickListener);
        foodImage.setOnClickListener(itemClickListener);
        return row;
    }

}
