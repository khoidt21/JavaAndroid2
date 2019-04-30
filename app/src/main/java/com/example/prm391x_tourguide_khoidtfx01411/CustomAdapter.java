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

    public CustomAdapter(List<ItemView> items, Context context) {
        this.items = items;
        Log.d("AAA", "CustomAdapter: " +this.items.size());
        Log.d("AAA", "CustomAdapter: "+ this.context.toString());
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_layout,parent,false);
        }
        TextView tvTitle;

        ImageView imageView;
        TextView tvDetail;

        tvTitle = convertView.findViewById(R.id.tvTitleName);
        tvTitle.setText(items.get(position).getName());
        tvDetail = convertView.findViewById(R.id.tvDesc);
        tvDetail.setText(items.get(position).getDetail());
        //anh thi dung picaso nhe, thu 2 cai view truoc
        //Find by view id
        //Dung bitmap hoac picaso de add anh bang url, khong fix cung len view
        //mo fragment tao listview em xem

        return null;
    }
}
