package ma.projet.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private TextView msg,msg2;
private Button reply;
private EditText rep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        msg=findViewById(R.id.text_message);
        reply=findViewById(R.id.button_reply);
        rep=findViewById(R.id.editText_reply);
        msg2=findViewById(R.id.msg2);

        reply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent1=new Intent(SecondActivity.this,MainActivity.class);
               intent1.putExtra("reply",rep.getText().toString());
                intent1.putExtra("msg1","Reply received");
               startActivity(intent1);

            }
        });
        Intent intent=getIntent();
        String message = intent.getStringExtra("message");

        msg.setText(message);//afficher le msg
        msg2.setText("Message received");





    }
}