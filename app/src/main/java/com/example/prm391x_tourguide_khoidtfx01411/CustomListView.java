package com.example.prm391x_tourguide_khoidtfx01411;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<String> {

    private String[] titleName;
    private String[] desc;
    private Integer[] imgid;
    private Activity context;

    public CustomListView(Activity context,String[] titleName,String[] desc,Integer[] imgid) {
        super(context, R.layout.listview_layout);
        this.context = context;
        this.titleName = titleName;
        this.desc = desc;
        this.imgid = imgid;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View r = convertView;
        ViewHolder viewHolder = null;
        if(r==null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(titleName[position]);
        viewHolder.tvw2.setText(desc[position]);

        return super.getView(position,convertView,parent);

    }
}
class ViewHolder{
    TextView tvw1;
    TextView tvw2;
    ImageView ivw;

    ViewHolder(View v){
        tvw1 = (TextView) v.findViewById(R.id.tvTitleName);
        tvw2 = (TextView) v.findViewById(R.id.tvDesc);
        ivw = (ImageView) v.findViewById(R.id.imageView);

    }
}
