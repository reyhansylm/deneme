package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;


public class Question extends AppCompatActivity {

    private TextView sorutotal,dogru,sure,yanlis,soru,score;
    private RadioButton a,b,c,d,e;
    private RadioGroup radioGroup;
    private Button buton,kaydeett;
    private ArrayList<Questions> questionsList;
    private ColorStateList colorStateList;
    private int questioncounter;
    private int questionscountertotal;
    private Questions currentquestions;
    private int scored;
    private boolean answered;
    public static final String Extra_Score="extraScore";
    private long backpressedtime;
    private int dogrucvp=0,yanliscvp=0;
    private static final long CountDown_In_Mills=30000;
    private ColorStateList colorStateListdefaoult;
    private CountDownTimer countDownTimer;
    private long lefttimeinmills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        start();

        colorStateList=a.getTextColors();

        colorStateListdefaoult=sure.getTextColors();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){

                    case R.id.radioa:
                        a.setTextColor(Color.DKGRAY);
                        b.setTextColor(Color.GRAY);
                        c.setTextColor(Color.GRAY);
                        d.setTextColor(Color.GRAY);
                        e.setTextColor(Color.GRAY);
                        break;
                    case R.id.radiob:
                        b.setTextColor(Color.DKGRAY);
                        a.setTextColor(Color.GRAY);
                        c.setTextColor(Color.GRAY);
                        d.setTextColor(Color.GRAY);
                        e.setTextColor(Color.GRAY);
                        break;
                    case R.id.radioc:
                        c.setTextColor(Color.DKGRAY);
                        b.setTextColor(Color.GRAY);
                        a.setTextColor(Color.GRAY);
                        d.setTextColor(Color.GRAY);
                        e.setTextColor(Color.GRAY);
                        break;
                    case R.id.radiod:
                        d.setTextColor(Color.DKGRAY);
                        b.setTextColor(Color.GRAY);
                        c.setTextColor(Color.GRAY);
                        a.setTextColor(Color.GRAY);
                        e.setTextColor(Color.GRAY);
                        break;
                    case R.id.radioe:
                        e.setTextColor(Color.DKGRAY);
                        b.setTextColor(Color.GRAY);
                        c.setTextColor(Color.GRAY);
                        d.setTextColor(Color.GRAY);
                        a.setTextColor(Color.GRAY);
                        break;

                }
            }
        });

        QuizHelper dbhelper=new QuizHelper(this);
        questionsList=dbhelper.getAllQuestion();

        questionscountertotal=questionsList.size();
        Collections.shuffle(questionsList);
        showNextQuestions();

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!answered){
                    if(a.isChecked() || b.isChecked() || c.isChecked() || d.isChecked() || e.isChecked()){
                        checkAnswer();
                    }else{
                        Toast.makeText(Question.this,"Lütfen Bir Cevap Seçin",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    showNextQuestions();
                }

            }


        });
    }

    private void start(){

        sorutotal=findViewById(R.id.totalsoru);
        sure=findViewById(R.id.txtime);
        dogru=findViewById(R.id.txtcorrect);
        yanlis=findViewById(R.id.txtwrong);
        score=findViewById(R.id.txtscore);
        soru=findViewById(R.id.textsoru);
        radioGroup=findViewById(R.id.radiogroup);
        a=findViewById(R.id.radioa);
        b=findViewById(R.id.radiob);
        c=findViewById(R.id.radioc);
        d=findViewById(R.id.radiod);
        e=findViewById(R.id.radioe);
        buton=findViewById(R.id.kaydet);

    }

    private void checkAnswer(){

        answered=true;
        countDownTimer.cancel();

        RadioButton rbselected=findViewById(radioGroup.getCheckedRadioButtonId());
        int answernr=radioGroup.indexOfChild(rbselected)+1;

        if(answernr==currentquestions.getNumber()){
            scored++;
            score.setText("Score: " +scored);
            dogrucvp++;
            dogru.setText("Doğru: "+String.valueOf(dogrucvp));
        }else{
            yanliscvp++;
            yanlis.setText("Yanlış: "+String.valueOf(yanliscvp));
        }
        showsolition();
    }


    private void showsolition(){
        a.setTextColor(Color.RED);
        b.setTextColor(Color.RED);
        c.setTextColor(Color.RED);
        d.setTextColor(Color.RED);
        e.setTextColor(Color.RED);

        switch (currentquestions.getNumber()){

            case 1:
                a.setTextColor(Color.GREEN);
                sorutotal.setText("CEVAP A ");
                break;
            case 2:
                b.setTextColor(Color.GREEN);
                sorutotal.setText("CEVAP B ");
                break;
            case 3:
                c.setTextColor(Color.GREEN);
                sorutotal.setText("CEVAP C ");
                break;
            case 4:
                d.setTextColor(Color.GREEN);
                sorutotal.setText("CEVAP D ");
                break;
            case 5:
                e.setTextColor(Color.GREEN);
                sorutotal.setText("CEVAP E ");
                break;
        }

        if(questioncounter<questionscountertotal){
            buton.setText("NEXT");
        }else{
            buton.setText("FINISH");
            Intent intent =new Intent(Question.this,Bitis.class);
            intent.putExtra("key",scored);
            startActivity(intent);

        }
    }

    private void  showNextQuestions(){
        a.setTextColor(colorStateList);
        b.setTextColor(colorStateList);
        c.setTextColor(colorStateList);
        d.setTextColor(colorStateList);
        e.setTextColor(colorStateList);
        radioGroup.clearCheck();

        if(questioncounter<questionscountertotal){
            currentquestions=questionsList.get(questioncounter);
            soru.setText(currentquestions.getQuestion());
            a.setText(currentquestions.getOption1());
            b.setText(currentquestions.getOption2());
            c.setText(currentquestions.getOption3());
            d.setText(currentquestions.getOption4());
            e.setText(currentquestions.getOption5());

            questioncounter++;
            answered=false;
            buton.setText("NEXT");
            sorutotal.setText("Questions " +questioncounter+ "/" +questionscountertotal);

            lefttimeinmills=CountDown_In_Mills;
            startCountDown();

        }else{
            finish();

        }

    }

    private void startCountDown() {

        countDownTimer=new CountDownTimer(lefttimeinmills,1000) {
            @Override
            public void onTick(long l) {

                lefttimeinmills=l;
                updateCountText();

            }

            @Override
            public void onFinish() {

                lefttimeinmills=0;
                updateCountText();
                checkAnswer();
            }
        }.start();
    }

    private void updateCountText(){
        int minutes=(int)(lefttimeinmills/1000) / 60;
        int seconds=(int)(lefttimeinmills/1000) % 60;

        String timeformatted=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        sure.setText(timeformatted);

        if(lefttimeinmills<10000){
            sure.setTextColor(Color.RED);
        }else{
            sure.setTextColor(colorStateListdefaoult);
        }
    }

    public void finish(){
        Intent resultintent=new Intent();
        resultintent.putExtra(Extra_Score,scored);
        setResult(RESULT_OK,resultintent);
        finish();


    }

    public void onBackPressed(){

        if(backpressedtime+2000>System.currentTimeMillis()){
          finish();
        }else{
            Toast.makeText(this,"Bitirmek İçin Tekrar Geri Basın",Toast.LENGTH_SHORT).show();
        }
        backpressedtime=System.currentTimeMillis();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(countDownTimer!=null){
            countDownTimer.cancel();
        }
    }


}