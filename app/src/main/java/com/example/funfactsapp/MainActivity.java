package com.example.funfactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Declaring our View variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the views form the layout file to the corresponding variable
        factTextView = findViewById(R.id.fact_tv);
        showFactButton = findViewById(R.id.next_button);

        View.OnClickListener listener = v -> {
            //getting a string from a extracted method
            String fact = getFacts();

            //Update the screen with  our new fact
            factTextView.setText(fact);
        };
        showFactButton.setOnClickListener(listener);
    }

    public String getFacts() {
        String[] facts = {
                "The world’s oldest wooden wheel has been around for more than 5,000 years",
                "Dead skin cells are a main ingredient in household dust",
                "Sudan has more pyramids than any country in the world",
                "The bumblebee bat is the world’s smallest mammal",
                "The circulatory system is more than 60,000 miles long",
                "There are parts of Africa in all four hemispheres",
                "The cornea is one of only two parts of the human body without blood vessels",
                "The world’s first animated feature film was made in Argentina"
        };
        Random random = new Random();
        int randomNo = random.nextInt(facts.length);
        return facts[randomNo];

    }
}