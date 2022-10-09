package ma.projet.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        msg=findViewById(R.id.text_message);
        Intent intent=getIntent();
        String message = intent.getStringExtra("message");

        msg.setText(message);

    }
}