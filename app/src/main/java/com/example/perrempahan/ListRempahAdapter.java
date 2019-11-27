package com.example.perrempahan;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListRempahAdapter extends RecyclerView.Adapter<ListRempahAdapter.CardViewHolder> {
    private Context context;
    private ArrayList<Rempah> listRempah;

    public ListRempahAdapter(Context context){
        this.context = context;
    }

    public ArrayList<Rempah> getListRempah(){
        return  listRempah;
    }

    public void setListRempah(ArrayList<Rempah> listRempah){
        this.listRempah = listRempah;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rempah_cardview, viewGroup,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int position) {
        Rempah rempah = listRempah.get(position);

        Glide.with(context)
                .load(rempah.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(cardViewHolder.imgPhoto);

        cardViewHolder.tvNama.setText(rempah.getNama_rempah());
        cardViewHolder.tvKet.setText(rempah.getKeterangan());
        cardViewHolder.rempah = rempah;
    }

    @Override
    public int getItemCount() {
        return listRempah.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvNama, tvKet;
        Button btnDetail;
        Rempah rempah;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_item_nama);
            tvKet = itemView.findViewById(R.id.tv_item_keterangan);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
            btnDetail.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DetailRempahActivity.class);
            intent.putExtra("key", rempah);
            context.startActivity(intent);

        }
    }
}
