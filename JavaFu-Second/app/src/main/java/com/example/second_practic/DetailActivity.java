package com.example.second_practic;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);


        State state = (State) getIntent().getSerializableExtra("state");

        if (state != null) {
            ImageView flagImage = findViewById(R.id.flag);
            TextView nameText = findViewById(R.id.name);
            TextView capitalText = findViewById(R.id.capital);


            flagImage.setImageResource(state.getFlagResource());
            nameText.setText(state.getName());
            capitalText.setText(state.getCapital());
        } else {

            Toast.makeText(this, "Error: State data is missing", Toast.LENGTH_SHORT).show();
        }
    }
}