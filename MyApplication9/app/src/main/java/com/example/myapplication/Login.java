package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password,sifretekrar;
    private Button login;
    private DbHelper db;
    private Object String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       username = findViewById(R.id.kullanici1);
       password = findViewById(R.id.sifre1);
      login = findViewById(R.id.login);
      sifretekrar=findViewById(R.id.sifretekrarrrr);
      db=new DbHelper(this);




          login.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  String user=username.getText().toString();
                  String pass=password.getText().toString();
                  String repass=sifretekrar.getText().toString();

                  if(user.equals("")|| pass.equals("")|| repass.equals("")){
                      Toast.makeText(getApplicationContext(),"Lütfen tüm alanları doldurun",Toast.LENGTH_SHORT).show();
                  }else{
                      if(pass.equals(repass)){
                          Boolean checkuser=db.chechusername(user);
                          if(checkuser==false){
                              Boolean insert=db.insertdata(user,pass);
                              if(insert==true){
                                  Toast.makeText(getApplicationContext(),"Uyelik Başarılı",Toast.LENGTH_SHORT).show();
                                  Intent intent=new Intent(Login.this,Question.class);
                                  startActivity(intent);
                              }else{
                                  Toast.makeText(getApplicationContext(),"Uyelik Başarısız",Toast.LENGTH_SHORT).show();
                              }
                          }
                      }else{
                          Toast.makeText(getApplicationContext(),"Bu kullanıcı zaten var",Toast.LENGTH_SHORT).show();
                      }
                  }
              }
          });









}
    }