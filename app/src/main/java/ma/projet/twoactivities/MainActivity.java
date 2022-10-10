package ma.projet.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Button send;
    private EditText txt;
    private TextView text,msg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = findViewById(R.id.button_main);
        txt=findViewById(R.id.editText_main);
        text=findViewById(R.id.text);
        msg1=findViewById(R.id.msg1);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LOG_TAG, "Button Clicked !");
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
intent.putExtra("message",txt.getText().toString());
                startActivity(intent);
            }

        });

        Intent intent=getIntent();
        String message = intent.getStringExtra("reply");
        String message1 = intent.getStringExtra("msg1");

       text.setText(message);//afficher le msg
msg1.setText(message1);



    }



}