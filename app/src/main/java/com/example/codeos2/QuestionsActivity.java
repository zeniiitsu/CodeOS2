package com.example.codeos2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class QuestionsActivity extends AppCompatActivity {

    TextView card_question,card_optionA,card_optionB,card_optionC,card_optionD;
    CardView a_card, b_card, c_card, d_card;
    LinearLayout nextBtn;
    ImageView ic_back;
    TextView ic_exit;
    QuestionsList selectedSubQL;
    int correctCount = 0;
    int wrongCount = 0;
    String s;


    int index=0;

    ArrayList<QuestionsList> CurrentQuestionsList, JavaQuestions, PythonQuestions, CplusQuestions, HtmlQuestions, CssQuestions, JavaScriptQuestions;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        card_question = findViewById(R.id.card_question);
        card_optionA = findViewById(R.id.card_optionA);
        card_optionB = findViewById(R.id.card_optionB);
        card_optionC = findViewById(R.id.card_optionC);
        card_optionD = findViewById(R.id.card_optionD);

        a_card = findViewById(R.id.a_card);
        b_card = findViewById(R.id.b_card);
        c_card = findViewById(R.id.c_card);
        d_card = findViewById(R.id.d_card);

        nextBtn = findViewById(R.id.nextBtn);
        ic_back = findViewById(R.id.ic_back);


        JavaQuestions = new ArrayList<>();
        JavaQuestions.add(new QuestionsList("Which of the following option leads to the portability and security of Java?", "Bytecode is executed by JVM", "The applet makes the Java code secure and portable", "Use of exception handling", "Dynamic binding between objects", "Bytecode is executed by the JVM."));
        JavaQuestions.add(new QuestionsList("Which of the following is not a Java features?", "Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented", "Use of pointers"));
        JavaQuestions.add(new QuestionsList("___ is used to find and fix bugs in the Java programs.", "JVM", "JRE", "JDK", "JDB", "JDB"));
        JavaQuestions.add(new QuestionsList("What is the return type of the hashCode() method in the Object class?", "Object", "int", "long", "void", "int"));
        JavaQuestions.add(new QuestionsList("What does the expression float a = 35 / 0 return?", "0", "Not a Number", "Infinity", "Run time exception", "Infinity"));
        JavaQuestions.add(new QuestionsList("Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?", "javap tool", "javaw command", "Javadoc tool", "javah command", "Javadoc tool"));
        JavaQuestions.add(new QuestionsList("In which process, a local variable has the same name as one of the instance variables?", "Serialization", "Variable Shadowing", "Abstraction", "Multi-threading", "Variable Shadowing"));
        JavaQuestions.add(new QuestionsList("Which of the following is true about the anonymous inner class?", "It has only methods", "Objects can't be created", "It has a fixed class name", "It has no class name", "It has no class name"));
        JavaQuestions.add(new QuestionsList("An interface with no fields or methods is known as a __.", "Runnable Interface", "Marker Interface", "Abstract Interface", "CharSequence Interface", "Marker Interface"));

        PythonQuestions = new ArrayList<>();
        PythonQuestions.add(new QuestionsList("What is the maximum possible length of an identifier?","31 characters","63 characters"," 79 characters","Identifiers can be of any length","Identifiers can be of any length."));
        PythonQuestions.add(new QuestionsList("Given a function that does not return any value, What value is thrown by default when executed in shell.","Int","bool","void","none","none"));
        PythonQuestions.add(new QuestionsList("In python we do not specify types, it is directly interpreted by the compiler, so consider the following operation to be performed. ","x = 13 // 2"," x = int(13 / 2)"," x = 13 % 2","All of the mentioned","All of the mentioned"));
        PythonQuestions.add(new QuestionsList("What is the value of the following expression?","(1.0, 4.0)"," (1.0, 1.0)","(4.0. 1.0)","(4.0, 4.0)","(1.0, 4.0)"));
        PythonQuestions.add(new QuestionsList("What will be the output of the following Python code? max(what are you) ","error","u","t","y","y"));
        PythonQuestions.add(new QuestionsList("Given a string example=”hello” what is the output of example.count(‘l’)?","2","1","none","0","2"));
        PythonQuestions.add(new QuestionsList("Program code making use of a given module is called a ______ of the module.","Client","Docstring","Interface","Modularity","Client"));
        PythonQuestions.add(new QuestionsList("Which of the following is not a keyword in Python","assert","eval","nonlocal","pass","eval"));
        PythonQuestions.add(new QuestionsList("What will be the output of the following Python code?  t[5]","IndexError","NameError","TypeError","syntaticalError","NameError"));

        Intent a = getIntent();
        int posSub = a.getIntExtra("pos", 0); // Subject chi position

        switch (posSub){
            case 0 : StartQuiz(JavaQuestions);
             s = "Java";
            break;
            case 1 : StartQuiz(PythonQuestions);
            s = "Python";

            break;
        }

        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                finish();

            }
        });
    }


    //quiz chalu karyla current selected subject chya questions chi list input ghenar
    public void StartQuiz(ArrayList<QuestionsList> CurrentQuiz){

        nextBtn.setClickable(false);
        CurrentQuestionsList = CurrentQuiz;
        Collections.shuffle(CurrentQuestionsList);
        selectedSubQL = CurrentQuestionsList.get(index);

        setAllData();


    }

    private void setAllData() {

        card_question.setText(selectedSubQL.getQuestion());
        card_optionA.setText(selectedSubQL.getoA());
        card_optionB.setText(selectedSubQL.getoB());
        card_optionC.setText(selectedSubQL.getoC());
        card_optionD.setText(selectedSubQL.getoD());


    }

    public void Correct(CardView cardView){
        cardView.setCardBackgroundColor(getResources().getColor(R.color.green));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correctCount++;
                index++;
                selectedSubQL=CurrentQuestionsList.get(index);
                resetColor();
                setAllData();
                enableButton();
                nextBtn.setClickable(false);
            }
        });
    }

    public void Wrong(CardView cardView){
        cardView.setCardBackgroundColor(getResources().getColor(R.color.red));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongCount++;
                if(index<CurrentQuestionsList.size()-1)
                {
                    index++;
                    selectedSubQL = CurrentQuestionsList.get(index);
                    resetColor();
                    setAllData();
                    enableButton();
                    nextBtn.setClickable(false);

                }
                else{
                   quizWon();
                }
            }
        });
    }

    public void resetColor() {
        a_card.setCardBackgroundColor(getResources().getColor(R.color.white));
        b_card.setCardBackgroundColor(getResources().getColor(R.color.white));
        c_card.setCardBackgroundColor(getResources().getColor(R.color.white));
        d_card.setCardBackgroundColor(getResources().getColor(R.color.white));

    }

    public void enableButton() {
        a_card.setClickable(true);
        b_card.setClickable(true);
        c_card.setClickable(true);
        d_card.setClickable(true);
    }

    public void disableButton() {
        a_card.setClickable(false);
        b_card.setClickable(false);
        c_card.setClickable(false);
        d_card.setClickable(false);
    }

    public void OptionAClick(View view) {

        disableButton();
        nextBtn.setClickable(true);

        if(selectedSubQL.getoA().equals(selectedSubQL.getAns()))
        {
            a_card.setCardBackgroundColor(getResources().getColor(R.color.green));

            if(index < CurrentQuestionsList.size() - 1) {
                Correct(a_card);
                //resetColor();
            }
            else {
                quizWon();
            }

        } else {
            Wrong(a_card);
        }
    }

    public void OptionBClick(View view) {

        disableButton();
        nextBtn.setClickable(true);

        if(selectedSubQL.getoB().equals(selectedSubQL.getAns()))
        {
            b_card.setCardBackgroundColor(getResources().getColor(R.color.green));

            if(index < CurrentQuestionsList.size() - 1) {
                Correct(b_card);
                //resetColor();
            }
            else {
                quizWon();
            }

        } else {
            Wrong(b_card);
        }
    }

    public void OptionCClick(View view) {

        disableButton();
        nextBtn.setClickable(true);

        if(selectedSubQL.getoC().equals(selectedSubQL.getAns()))
        {
            c_card.setCardBackgroundColor(getResources().getColor(R.color.green));

            if(index < CurrentQuestionsList.size() - 1) {
                Correct(c_card);

                //resetColor();
            }
            else {
                quizWon();
            }

        } else {
            Wrong(c_card);
        }
    }

    public void OptionDClick(View view) {

        disableButton();
        nextBtn.setClickable(true);

        if(selectedSubQL.getoD().equals(selectedSubQL.getAns()))
        {
            d_card.setCardBackgroundColor(getResources().getColor(R.color.green));

            if(index < CurrentQuestionsList.size() - 1) {
                Correct(d_card);
                //resetColor();
            }
            else {
                quizWon();
            }

        } else {
            Wrong(d_card);
        }
    }

    public void quizWon(){

        Intent intent = new Intent(QuestionsActivity.this, QuizScoreActivity.class);
        intent.putExtra("correct", correctCount);
        startActivity(intent);
        finish();

    }
}