package sg.edu.rp.c346.id22000765.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer = findViewById(R.id.textViewAct4);
        Intent intentReceived=getIntent();
        double value = intentReceived.getDoubleExtra("value",99.99);
        tvAnswer.setText("Character value received is: " +value);
    }
}