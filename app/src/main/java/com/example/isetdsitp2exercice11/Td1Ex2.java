package com.example.isetdsitp2exercice11;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Td1Ex2 extends AppCompatActivity {
    public EditText ed1;
    public EditText ed2;
    public RadioButton x1;
    public RadioButton x2;
    public RadioButton x3;
    public RadioButton x4;

    public TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_td1_ex2);
        ed1=findViewById(R.id.editTextText6);
        ed2=findViewById(R.id.editTextText7);
        x1=findViewById(R.id.radioButton7);
        x2=findViewById(R.id.radioButton8);
        x3=findViewById(R.id.radioButton9);
        x4=findViewById(R.id.radioButton10);
        res=findViewById(R.id.textView8);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void resultat(View view) {
        String a=ed1.getText().toString();
        String b=ed2.getText().toString();
        int x=Integer.parseInt(a);
        int y=Integer.parseInt(b);
int ress=0;
        if(a.isEmpty() ||b.isEmpty())
        {
            Toast.makeText(this, "champs vide", Toast.LENGTH_SHORT).show();
        }else
        {
            if (x1.isChecked())
            {
               ress=x+y;
            } else if (x2.isChecked()) {
                ress=x-y;
            } else if (x3.isChecked()) {
                ress=x*y;
            }else if(x4.isChecked())
            {
                ress=x/y;

            }
            res.setText(Integer.toString(ress));
        }


    }
}