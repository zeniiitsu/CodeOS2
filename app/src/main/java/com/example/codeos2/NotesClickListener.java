package com.example.codeos2;

import androidx.cardview.widget.CardView;

import com.example.codeos2.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
