package com.example.codeos2;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter2 extends RecyclerView.Adapter<myadapter2.myviewholder2> {

    ArrayList<TopicList> dataholder2;
    private Context context;
    int posSub;

    public myadapter2(Context context, ArrayList<TopicList> dataholder2, int posSub) {
        this.posSub = posSub;
        this.context = context;
        this.dataholder2 = dataholder2;
    }

    @NonNull
    @Override
    public myadapter2.myviewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design, parent, false);


        return new myviewholder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myadapter2.myviewholder2 holder, int position) {

        holder.Tname.setText(dataholder2.get(position).getTname());

    }

    @Override
    public int getItemCount() {
        return dataholder2.size();
    }

    public class myviewholder2 extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tname;

        public myviewholder2(@NonNull View itemView) {
            super(itemView);
            Tname = itemView.findViewById(R.id.t1);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            int topicPosition = getAdapterPosition();
            Intent b = new Intent(context, VideoPlayActivity.class);
            b.putExtra("posSub", posSub );
            b.putExtra("topicPosition", topicPosition);
            context.startActivity(b);
        }
    }
}
