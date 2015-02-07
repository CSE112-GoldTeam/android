package cse112goldteam.robobetty;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FormAdapter extends ArrayAdapter<Pair<String, Boolean>> {

    //Depending which data is set determines what will be viewed.
    private List <Pair<String, Boolean>> data;

    //Inflated in the constructor but used in another method.
    private LayoutInflater inflater;

    public FormAdapter(Activity activity, List<Pair<String, Boolean>> data){
        super(activity, R.layout.form_item, data);
        this.data = data;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Pair<String, Boolean> getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private static class Holder{
        TextView infoTextView;
        TextView statusTextView;
        ImageView image;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {

        Holder holder;

        if(convertView == null){
            //Inflate the view
            convertView = inflater.inflate(R.layout.form_item, parent, false);
            holder = new Holder();

            //Get instances of the the UI components of the view and place them in the holder.
            holder.infoTextView = (TextView) convertView.findViewById(R.id.textViewFormName);
            holder.statusTextView = (TextView) convertView.findViewById(R.id.textViewFormStatus);
            holder.image = (ImageView) convertView.findViewById(R.id.imageViewStatus);

            //Set the holder to the currectView.
            convertView.setTag(holder);
        }
        else{
            holder = (Holder) convertView.getTag();
        }

        holder.infoTextView.setText(getItem(pos).first);
        holder.statusTextView.setText("Never completed");

        if(getItem(pos).second){
            holder.image.setImageResource(R.drawable.done);
        }
        else{
            holder.image.setImageResource(R.drawable.not_done);
        }
        return convertView;
    }

}
