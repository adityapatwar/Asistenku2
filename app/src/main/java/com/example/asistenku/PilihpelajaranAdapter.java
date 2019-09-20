package com.example.asistenku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PilihpelajaranAdapter  extends RecyclerView.Adapter<PilihpelajaranAdapter.UserViewHolder> {

    Context context;
    OnUserClickListener listener;

    List<MataPelajaran> listpelajaran;
    public PilihpelajaranAdapter(Context context, List<MataPelajaran>listpelajaran) {
        this.context=context;
        this.listpelajaran=listpelajaran;
//        this.listener=listener;
    }

    public interface OnUserClickListener{
        void onUserClick(MataPelajaran currentPelajaran);

    }

    @NonNull
    @Override
    public PilihpelajaranAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_custom_listview_matapelajaran,parent,false);
        PilihpelajaranAdapter.UserViewHolder userViewHolder=new PilihpelajaranAdapter.UserViewHolder (view);

        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, final int position) {
        final MataPelajaran currentPelajaran = listpelajaran.get (position);
        holder.nama.setText (currentPelajaran.getName_pelajaran ());
        holder.status.setImageDrawable(context.getResources().getDrawable(currentPelajaran.getImage()));


//        holder.crdv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listener.onUserClick(currentOrang);
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return listpelajaran.size();

    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView nama;
        ImageView status;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById (R.id.tv_CustomPelajaran);
            status = itemView.findViewById (R.id.ImageViewCustomMataPelajaran);
        }
    }

}
