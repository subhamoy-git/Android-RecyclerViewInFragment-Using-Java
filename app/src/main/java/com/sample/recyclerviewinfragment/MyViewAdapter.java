package com.sample.recyclerviewinfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewAdapter extends RecyclerView.Adapter<MyViewAdapter.myviewholder> {
    ArrayList<DataModel> dataholder;

    public MyViewAdapter(ArrayList<DataModel> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public MyViewAdapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design, parent, false);
        return new myviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewAdapter.myviewholder holder, int position) {
        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.header.setText(dataholder.get(position).getHeader());
        holder.desc.setText(dataholder.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView header, desc;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_thumb);
            header = itemView.findViewById(R.id.txt_header);
            desc = itemView.findViewById(R.id.txt_desc);
        }
    }
}
