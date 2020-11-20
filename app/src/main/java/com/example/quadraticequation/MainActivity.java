 package com.example.quadraticequation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

 public class MainActivity extends AppCompatActivity {
     private TextView x1,x2;
     private EditText a,b,c;
     private double a1,b1,c1;



     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       a=findViewById(R.id.editTextA);
       b=findViewById(R.id.editTextB);
       c=findViewById(R.id.editTextC);
       a.addTextChangedListener(aEditText);
       b.addTextChangedListener(bEditText);
       c.addTextChangedListener(cEditText);
       x1=findViewById(R.id.textView);
       x2=findViewById(R.id.textView2);
    }
     public void Calc(View view) {

         x1.setText("x1="+(-1*b1+Math.sqrt(b1*b1-4*a1*c1))/(2*a1));
         x2.setText("x2="+(-1*b1-Math.sqrt(b1*b1-4*a1*c1))/(2*a1));
     }

     private TextWatcher aEditText= new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {
             try {
                 a1=Double.parseDouble(a.getText().toString());
             }
             catch (NumberFormatException e){
                 a1=0.0;
             }
         }

         @Override
         public void afterTextChanged(Editable s) {

         }
     };


     private TextWatcher bEditText= new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {
             try {
                 b1=Double.parseDouble(b.getText().toString());
             }
             catch (NumberFormatException e){
                 b1=0.0;
             }
         }

         @Override
         public void afterTextChanged(Editable s) {

         }
     };
     private TextWatcher cEditText = new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {
             try {
                 c1=Double.parseDouble(c.getText().toString());
             }
             catch (NumberFormatException e){
                 c1=0.0;
             }
         }

         @Override
         public void afterTextChanged(Editable s) {

         }
     };
 }