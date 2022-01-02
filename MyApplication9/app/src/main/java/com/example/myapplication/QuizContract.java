package com.example.myapplication;

import android.provider.BaseColumns;

public final class QuizContract {


    public QuizContract() {
    }

    public static class CategoriesTable implements BaseColumns{
        public static final String Table_Name="quiz_categories";
        public static final String Column_Name="name";
    }

    public static class QuestionsTable implements BaseColumns{

        public static final String Table_Name="quiz_quesitons";
        public static final String Column_Quesitons="quesitons";
        public static final String Column_Option1="option1";
        public static final String Column_Option2="option2";
        public static final String Column_Option3="option3";
        public static final String Column_Option4="option4";
        public static final String Column_Option5="option5";
        public static final String Column_Answer="answer_num";
        public static final String ColumnCategori_ID="categoriy_id";
    }
}
