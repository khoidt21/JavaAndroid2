package com.example.prm391x_tourguide_khoidtfx01411;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    List<ItemView> items;
    Context context;
    private int[] image;
    private String[] name;
    private String[] desc;

    public CustomAdapter(int[] IMAGE,String[] NAME,String[] DESC,Context context ) {
        this.image = IMAGE;
        this.name = NAME;
        this.desc = DESC;
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_layout,parent,false);
        }
        TextView tvTitle;

        //ImageView imageView;
        TextView tvDetail;

        tvTitle = convertView.findViewById(R.id.tvTitleName);
        tvTitle.setText(name[i]);
        tvDetail = convertView.findViewById(R.id.tvDesc);
        tvDetail.setText(desc[i]);

        ImageView imageView1 = convertView.findViewById(R.id.imageView);
        imageView1.setImageResource(image[i]);

        //anh thi dung picaso nhe, thu 2 cai view truoc
        //Find by view id
        //Dung bitmap hoac picaso de add anh bang url, khong fix cung len view
        //mo fragment tao listview em xem

        return convertView;
    }
}
