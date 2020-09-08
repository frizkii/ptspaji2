package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.Holder> {


    List<String> nama;
    List<String> email;
    List<String> nohp;
    List<String> alamat;
    List<String> ktp;
    LayoutInflater inflater;

    public Adapter2(
            Context ctx,
            List<String> nama,
            List<String> email,
            List<String> nohp,
            List<String> alamat,
            List<String> ktp ){

        this.nama = nama;
        this.email = email;
        this.nohp = nohp;
        this.alamat = alamat;
        this.ktp = ktp;
        this.inflater = LayoutInflater.from(ctx);
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_grid_customer,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.Holder holder, int position) {
           holder.nama.setText(nama.get(position));
           holder.email.setText(email.get(position));
           holder.nohp.setText(nohp.get(position));
           holder.alamat.setText(alamat.get(position));
           holder.ktp.setText(ktp.get(position));
//        holder.gridicon.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return nama.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView nama,email,nohp,alamat,ktp;
        Button  edit,delete;

        public Holder(@NonNull View itemView) {
            super(itemView);
            edit = itemView.findViewById(R.id.edititem);
            delete = itemView.findViewById(R.id.deleteitem);
            nama = itemView.findViewById(R.id.V_NAMA);
            email = itemView.findViewById(R.id.V_EMAIL);
            nohp = itemView.findViewById(R.id.V_NOHP);
            alamat = itemView.findViewById(R.id.V_ALAMAT);
            ktp = itemView.findViewById(R.id.V_KTP);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view){
//                    Toast.makeText(view.getContext(),"mengeklik" + getAdapterPosition(),Toast.LENGTH_SHORT).show();
//                }
//            });

            edit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),"edit" + getAdapterPosition(),Toast.LENGTH_SHORT).show();
                }
            });
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),"delete" + getAdapterPosition(),Toast.LENGTH_SHORT).show();
                }
            });


        }
    }
}
