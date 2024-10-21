package com.example.isetdsitp2exercice11;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Cycle de Vie", "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Voulez vous continuer")
                .setTitle("BienVenue")
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton("OUI", null)
                .setNegativeButton("NON", null);
        AlertDialog alert = builder.create();
        alert.show();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Cycle de Vie", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Cycle de Vie", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Cycle de Vie", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Cycle de Vie", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Cycle de Vie", "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Cycle de Vie", "onRestart");

    }
}
