package com.example.isetdsitp2exercice11;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    // Déclaration de la zone de couleur (TextView)
    TextView zoneColore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); // Relier à votre layout couleur

        // Initialisation de la zone centrale colorée
        zoneColore = findViewById(R.id.zoneColore);
    }

    // Méthode appelée lors du clic sur le bouton Rouge
    public void rouge(View v) {
        // Changer la couleur de fond de la zone en rouge
        zoneColore.setBackgroundColor(Color.RED);
        // Afficher un message avec la couleur choisie
    }

    // Méthode appelée lors du clic sur le bouton Jaune
    public void jaune(View v) {
        // Changer la couleur de fond de la zone en jaune
        zoneColore.setBackgroundColor(Color.YELLOW);
        // Afficher un message avec la couleur choisie
    }

    // Méthode appelée lors du clic sur le bouton Vert
    public void vert(View v) {
        // Changer la couleur de fond de la zone en vert
        zoneColore.setBackgroundColor(Color.GREEN);
        // Afficher un message avec la couleur choisie
    }

    // Méthode appelée lors du clic sur le bouton Bleu
    public void bleu(View v) {
        // Changer la couleur de fond de la zone en bleu
        zoneColore.setBackgroundColor(Color.BLUE);
        // Afficher un message avec la couleur choisie
    }
}
