package com.example.asistenku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.UserViewHolder> {
    Context context;
    OnUserClickListener listener;

    List<Siswa> listSiswa;
    public SiswaAdapter(Context context, List<Siswa>listsiswa) {
        this.context=context;
        this.listSiswa=listsiswa;
//        this.listener=listener;
    }
    public interface OnUserClickListener{
        void onUserClick(Siswa currentMahasiwa);

    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_absen_siswa,parent,false);
        UserViewHolder userViewHolder=new UserViewHolder(view);

        return userViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, final int position) {
        final Siswa currentOrang = listSiswa.get (position);
        holder.nama.setText (currentOrang.getNama ());
        holder.status.setText (currentOrang.getStatus ());


//        holder.crdv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listener.onUserClick(currentOrang);
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return listSiswa.size();

    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView nama,status;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById (R.id.tv_namasiswa);
            status = itemView.findViewById (R.id.tx_status);
        }
    }
}


