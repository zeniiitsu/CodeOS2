package com.example.codeos2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.myviewholder> {

    ArrayList<datamodel> dataholder;
    private Context context;

    public QuizAdapter(Context context, ArrayList<datamodel> dataholder) {
        this.context = context;
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design, parent, false);

        return new myviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.header.setText(dataholder.get(position).getHeader());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView img;
        TextView header;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img1);
            header = itemView.findViewById(R.id.t1);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            String s = Integer.toString(position);
            //String s2 = (String) SubName.getText();  //to get the subject name from that position
            if (position != RecyclerView.NO_POSITION) {

                Intent a = new Intent(context, QuestionsActivity.class);
                a.putExtra("pos", position);  //sub position
                context.startActivity(a);

                Toast.makeText(itemView.getContext(), s, Toast.LENGTH_SHORT).show();

            }
        }
    }
}
