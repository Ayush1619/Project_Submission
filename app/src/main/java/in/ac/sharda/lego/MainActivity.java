package in.ac.sharda.lego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt,pass;
    private Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(EditText)findViewById(R.id.edittext);
        pass=(EditText)findViewById(R.id.pass);
        button=(Button)findViewById(R.id.btn2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(txt.getText().toString()))
                {
                    txt.setError("Enter Username");
                }
                else if (TextUtils.isEmpty(pass.getText().toString()))
                {
                    pass.setError("Enter password");
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,Menu2.class);
                    startActivity(intent);
                }
            }
        });

    }

}

