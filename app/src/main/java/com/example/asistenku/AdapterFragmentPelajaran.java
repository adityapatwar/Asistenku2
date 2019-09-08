package com.example.asistenku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterFragmentPelajaran extends ArrayAdapter<MataPelajaran> {

    List<MataPelajaran> heroList;

    Context context;

    int resource;

    private static ArrayList<MataPelajaran> listContact;

    private LayoutInflater mInflater;

    public AdapterFragmentPelajaran(Context context, int resource, List<MataPelajaran> heroList) {
        super (context, resource, heroList);
        this.context = context;
        this.resource = resource;
        this.heroList = heroList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from (context);
        View view = layoutInflater.inflate (resource, null, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.ImageViewCustomMataPelajaran);
        TextView txtname = (TextView) view.findViewById(R.id.tv_CustomPelajaran);

        MataPelajaran mataPelajaran = heroList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(mataPelajaran.getImage()));
        txtname.setText(mataPelajaran.getName_pelajaran ());


        return view;
    }



}
