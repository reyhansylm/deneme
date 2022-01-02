package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import com.example.myapplication.QuizContract.*;

import java.util.ArrayList;
import java.util.List;

public class QuizHelper extends SQLiteOpenHelper {

    private static final String DataBase_Name="Myquiz.db";
    private static final int Database_Version=1;

    private SQLiteDatabase db;

    public QuizHelper(@Nullable Context context) {
        super(context, DataBase_Name, null, Database_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         this.db=db;




       final String SQL_CREATE_QUESTION_TABLE= " CREATE TABLE quiz_quesitons(" +
                 QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                 QuestionsTable.Column_Quesitons + " TEXT, " +
                 QuestionsTable.Column_Option1 + " TEXT, " +
                 QuestionsTable.Column_Option2 + " TEXT, " +
                 QuestionsTable.Column_Option3 + " TEXT, " +
                 QuestionsTable.Column_Option4 + " TEXT, " +
                 QuestionsTable.Column_Option5 + " TEXT, " +
               QuestionsTable.ColumnCategori_ID + "INTEGER," +
               QuestionsTable.Column_Answer + " INTEGER, " +
                 QuestionsTable.Column_Answer + " INTEGER " +
                 ")";


         db.execSQL(SQL_CREATE_QUESTION_TABLE);

        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL(" DROP TABLE IF EXISTS " + QuestionsTable.Table_Name);
        onCreate(db);

    }




    private void fillQuestionsTable(){

        Questions q1=new Questions("Ankara ne zaman başkent olmuştur?","1923","1919","1928","1908","1930",1);
        addQuestion(q1);

        Questions q2=new Questions("Hangi ülkenin nüfusu İstanbul'un nüfusundan daha fazladır?","Belçika","Yunanistan","Hollanda","İsveç","İzlanda",3);
        addQuestion(q2);


        Questions q3=new Questions(" Hangisi sürüngenler sınıfından bir hayvandır?","Kurbağa","Kertenkele","Salyangoz","Yarasa","Penguen",2);
        addQuestion(q3);


        Questions q4=new Questions("Hangi şehir İskandinavya'da değildir?","Göteborg","Kopenhag","Stokholm","Oslo","Reykjavik",5);
        addQuestion(q4);


        Questions q5=new Questions("Hangi gezegen Güneş'e daha uzak mesafededir?","Mars","Merkür","Dünya","Jüpiter","Satürn",4);
        addQuestion(q5);


        Questions q6=new Questions("Divan edebiyatında padişahları ve devletin ileri gelenleri övmek için yazılan methiye türündeki şiirlere ne ad verilir?","Kaside","Gazel","Mesnevi","Tuyuğ","Rubai",1);
        addQuestion(q6);


        Questions q7=new Questions("Yunan mitolojisinde bilgelik ve sanat tanrısının adı nedir?","Poseidon","Artemis","Hermes","Zeus","Athena",5);
        addQuestion(q7);
    }

    private void addQuestion(Questions questions){
        ContentValues contentValues=new ContentValues();
        contentValues.put(QuestionsTable.Column_Quesitons,questions.getQuestion());
        contentValues.put(QuestionsTable.Column_Option1,questions.getOption1());
        contentValues.put(QuestionsTable.Column_Option2,questions.getOption2());
        contentValues.put(QuestionsTable.Column_Option3,questions.getOption3());
        contentValues.put(QuestionsTable.Column_Option4,questions.getOption4());
        contentValues.put(QuestionsTable.Column_Option5,questions.getOption5());
        contentValues.put(QuestionsTable.Column_Answer,questions.getNumber());

    }


    @SuppressLint("Range")
    public ArrayList<Questions> getAllQuestion(){
        ArrayList<Questions> questionsList= new ArrayList<>();
        db=getReadableDatabase();
        Cursor c=db.rawQuery(" SELECT * FROM " + QuestionsTable.Table_Name,null);
        if (c.moveToFirst()){
             do {
                 Questions questions=new Questions();
                 questions.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.Column_Quesitons)));
                 questions.setOption1(c.getString(c.getColumnIndex(QuestionsTable.Column_Option1)));
                 questions.setOption2(c.getString(c.getColumnIndex(QuestionsTable.Column_Option2)));
                 questions.setOption3(c.getString(c.getColumnIndex(QuestionsTable.Column_Option3)));
                 questions.setOption4(c.getString(c.getColumnIndex(QuestionsTable.Column_Option4)));
                 questions.setOption5(c.getString(c.getColumnIndex(QuestionsTable.Column_Option5)));
                 questions.setNumber(c.getInt(c.getColumnIndex(QuestionsTable.Column_Answer)));
                 questionsList.add(questions);
             }while (c.moveToNext());
        }
        c.close();
        return questionsList;
    }
}
