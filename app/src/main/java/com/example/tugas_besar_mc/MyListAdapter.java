package com.example.tugas_besar_mc;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private DataList[] dataList;

    public MyListAdapter(DataList[] dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.itemlist, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {
        final DataList data =dataList[position];
        final  int image = data.getImageid();
        final String title = data.getTitle();
        final String price = data.getPrice();
        final String des =data.getDeskripsi();
        final int imageview1=data.getPhoto1();
        final int imageview2=data.getPhoto2();
        final int imageview3=data.getPhoto3();
        final String des2=data.getDeskripsi2();
        final String des3=data.getDeskripsi3();
        final String button=data.getLink();
        holder.imageView.setImageResource(image);
        holder.textTitle.setText(title);
//        holder.textPrice.setText(price);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext();

                Intent intent = new Intent(view.getContext(),activity_detail_perpustakaan.class);
                intent.putExtra("image", image);
                intent.putExtra("title", title);
//                intent.putExtra("price", price);
                intent.putExtra("deskripsi",des);
                intent.putExtra("image1",imageview1);
                intent.putExtra("image2",imageview2);
                intent.putExtra("image3",imageview3);
                intent.putExtra("des2",des2);
                intent.putExtra("des3",des3);
                intent.putExtra("link1",button);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView,imagevie1,imagevie2,imagevie3;
        public TextView textTitle, textPrice,textDeskripsi,des2,des3;
        public CardView cardView;
        public ImageView icon1;
        public ImageView icon2,icon3;
        public NestedScrollView nestedScrollView;
        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.des2=itemView.findViewById(R.id.deskripsi4);
            this.des3=itemView.findViewById(R.id.deskripsi5);
            this.imagevie1=itemView.findViewById(R.id.iamgeview1);
            this.imagevie2=itemView.findViewById(R.id.iamgeview2);
            this.imagevie3=itemView.findViewById(R.id.iamgeview3);
            this.nestedScrollView=itemView.findViewById(R.id.nesteddeskripsi);
            this.textDeskripsi=(TextView) itemView.findViewById(R.id.deskripsi3);

            this.icon2=itemView.findViewById(R.id.favorit);
            this.button=itemView.findViewById(R.id.imagemap);

            this.icon1=itemView.findViewById(R.id.imageshare);
            this.cardView = itemView.findViewById(R.id.cardView);
            this.imageView = itemView.findViewById(R.id.list_img);
//            this.textPrice = itemView.findViewById(R.id.lsit_price);
            this.textTitle = itemView.findViewById(R.id.list_tittle);
        }
    }
}
