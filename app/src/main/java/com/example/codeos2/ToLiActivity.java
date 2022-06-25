package com.example.codeos2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ToLiActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<TopicList> javaTL, pythonTL, cTL, htmlTL, cssTL, jsTL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_li);


        //important to set layoutManager for recycler view
        recyclerView = findViewById(R.id.recviewtopics);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        //ArrayList for java topics
        javaTL = new ArrayList<>();
        TopicList jt1 = new TopicList(1,"Introduction to java");
        TopicList jt2 = new TopicList(2,"Structure of Java class");
        TopicList jt3 = new TopicList(3,"Variables and datatype");
        TopicList jt4 = new TopicList(4,"String literals");
        TopicList jt5 = new TopicList(5,"Getting user input");
        TopicList jt6 = new TopicList(6,"Operators and Expressions in java");
        TopicList jt7 = new TopicList(7,"Introduction to Strings");
        TopicList jt8 = new TopicList(8,"Conditional statements in java");

        javaTL.add(jt1);
        javaTL.add(jt2);
        javaTL.add(jt3);
        javaTL.add(jt4);
        javaTL.add(jt5);
        javaTL.add(jt6);
        javaTL.add(jt7);
        javaTL.add(jt8);





        //ArrayList for python topics
        pythonTL = new ArrayList<>();

        TopicList pt1 = new TopicList(1, "Introduction to python");
        TopicList pt2 = new TopicList(2, "First python program");
        TopicList pt3 = new TopicList(3, "DataTypes and typecasting");
        TopicList pt4 = new TopicList(4, "Dictionary and its functions");
        TopicList pt5 = new TopicList(5, "Sets in python");
        TopicList pt6 = new TopicList(6, "if else and elif conditionals");
        TopicList pt7 = new TopicList(7, "For loops in python");
        TopicList pt8 = new TopicList(8, "While loops in python");

        pythonTL.add(pt1);
        pythonTL.add(pt2);
        pythonTL.add(pt3);
        pythonTL.add(pt4);
        pythonTL.add(pt5);
        pythonTL.add(pt6);
        pythonTL.add(pt7);
        pythonTL.add(pt8);

        //c++ playlist
        cTL = new ArrayList<>();
        TopicList ct1 = new TopicList(1, "Introduction to C++");
        TopicList ct2 = new TopicList(2, "DataTypes & Type Modifiers in C++");
        TopicList ct3 = new TopicList(3, "Input/Output in C++");
        TopicList ct4 = new TopicList(4, "If/else statement in C++ programming");
        TopicList ct5 = new TopicList(5, "Break and Continue statement statement in C++ programming");
        TopicList ct6 = new TopicList(6, "Switch-Case statement statement in C++ programming");
        TopicList ct7 = new TopicList(7, "Operators statement statement");
        TopicList ct8 = new TopicList(8, "Function in C++ programming");

        cTL.add(ct1);
        cTL.add(ct2);
        cTL.add(ct3);
        cTL.add(ct4);
        cTL.add(ct5);
        cTL.add(ct6);
        cTL.add(ct7);
        cTL.add(ct8);

//        1. Introduction
//        2. Create Run HTML
//        3. Basic Structure of HTML
//        4. What is Doc Type Decelaration
//        5. What is Tag, Elements, and Attributes
//        6. HTML Indentation
//        7. HTML Comments
//        8. HTML Headings
//        9. HTML paragraph

        htmlTL = new ArrayList<>();
        TopicList h1 = new TopicList(1,"Introduction");
        TopicList h2 = new TopicList(2,"Create Run HTML");
        TopicList h3 = new TopicList(3,"Basic Structure of HTML");
        TopicList h4 = new TopicList(4,"What is Doc Type Decelaration");
        TopicList h5 = new TopicList(5,"What is Tag, Elements, and Attributes");
        TopicList h6 = new TopicList(6,"HTML Indentation");
        TopicList h7 = new TopicList(7,"HTML Comments");
        TopicList h8 = new TopicList(8,"HTML paragraph");

        htmlTL.add(h1);
        htmlTL.add(h2);
        htmlTL.add(h3);
        htmlTL.add(h4);
        htmlTL.add(h5);
        htmlTL.add(h6);
        htmlTL.add(h7);
        htmlTL.add(h8);

//        Introduction to CSS
//        Inline, Internal & External CSS
//        Selectors in CSS
//        Fonts in CSS
//        Colors in CSS
//        Borders and Background in CSS
//        CSS Box Model, Marginand Padding
//        Float and Clear Explained

        cssTL = new ArrayList<>();
        TopicList cs1 = new TopicList(1,"Introduction to CSS");
        TopicList cs2 = new TopicList(2,"Inline, Internal & External CSS");
        TopicList cs3 = new TopicList(3,"Selectors in CSS");
        TopicList cs4 = new TopicList(4,"Fonts in CSS");
        TopicList cs5 = new TopicList(5,"Colors in CSS");
        TopicList cs6 = new TopicList(6,"Borders and Background in CSS");
        TopicList cs7 = new TopicList(7,"CSS Box Model, Marginand Padding");
        TopicList cs8 = new TopicList(8,"Float and Clear Explained");

        cssTL.add(cs1);
        cssTL.add(cs2);
        cssTL.add(cs3);
        cssTL.add(cs4);
        cssTL.add(cs5);
        cssTL.add(cs6);
        cssTL.add(cs7);
        cssTL.add(cs8);

//        How JavaScript Works & Execution Context
//        How JavaScript Code is executed? & Call Stack
//        Hoisting in JavaScript (variables & functions)
//        How functions work in JS & Variable Environment
//        SHORTEST JS Program..window & this keyword
//        undefined vs not defined in JS
//        The Scope Chain, Scope & Lexical Environment
//        let & const in JS Temporal Dead Zone

        jsTL = new ArrayList<>();
        TopicList j1 = new TopicList(1,"How JavaScript Works & Execution Context");
        TopicList j2 = new TopicList(2,"How JavaScript Code is executed? & Call Stack");
        TopicList j3 = new TopicList(3,"Hoisting in JavaScript (variables & functions)");
        TopicList j4 = new TopicList(4,"How functions work in JS & Variable Environment");
        TopicList j5 = new TopicList(5,"SHORTEST JS Program..window & this keyword");
        TopicList j6 = new TopicList(6,"undefined vs not defined in JS");
        TopicList j7 = new TopicList(7,"The Scope Chain, Scope & Lexical Environment");
        TopicList j8 = new TopicList(8,"let & const in JS Temporal Dead Zone");

        jsTL.add(j1);
        jsTL.add(j2);
        jsTL.add(j3);
        jsTL.add(j4);
        jsTL.add(j5);
        jsTL.add(j6);
        jsTL.add(j7);
        jsTL.add(j8);

        //getting sub name
        Intent a = getIntent();
        int posSub = a.getIntExtra("pos", 0); // Subject chi position

        switch (posSub){
            case 0 : recyclerView.setAdapter(new myadapter2(ToLiActivity.this, javaTL, posSub));
                break;
            case 1 : recyclerView.setAdapter(new myadapter2(ToLiActivity.this,  pythonTL, posSub));
                break;
            case 2 : recyclerView.setAdapter(new myadapter2(ToLiActivity.this,  cTL, posSub));
                break;
            case 3 : recyclerView.setAdapter(new myadapter2(ToLiActivity.this,  htmlTL, posSub));
                break;
            case 4 : recyclerView.setAdapter(new myadapter2(ToLiActivity.this,  cssTL, posSub));
                break;
            case 5 : recyclerView.setAdapter(new myadapter2(ToLiActivity.this,  jsTL, posSub));
                break;
        }







    }
}