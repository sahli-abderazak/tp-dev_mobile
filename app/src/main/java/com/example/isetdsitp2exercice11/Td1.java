package com.example.isetdsitp2exercice11;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class Td1 extends AppCompatActivity {
    public EditText ed1;
    public EditText ed2;
    public CheckBox box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_td1);
        ed1=findViewById(R.id.editTextText3);
        ed2=findViewById(R.id.editTextText);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void concat(View view) {
        String mot1=ed1.getText().toString();
        String mot2=ed2.getText().toString();
        box=findViewById(R.id.checkBox);
        if(mot1.isEmpty() ||mot2.isEmpty())
        {
            Toast.makeText(this, "champs vide", Toast.LENGTH_SHORT).show();
        }else{
            if(box.isChecked())
            {
                Toast.makeText(this,mot1+" "+mot2, Toast.LENGTH_SHORT).show();
            }else {
                String res = mot1 + mot2;
                Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
            }
        }

    }

}