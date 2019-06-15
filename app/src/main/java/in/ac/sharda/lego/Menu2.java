package in.ac.sharda.lego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu2 extends AppCompatActivity {
    Button button1, button2, button3, button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5=(Button)findViewById(R.id.btn5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }

    public void openActivity() {
        Intent intent = new Intent(Menu2.this, facilities.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(Menu2.this, list.class);
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent = new Intent(Menu2.this, special.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(Menu2.this, contact.class);
        startActivity(intent);
    }
    public void openActivity4() {
        Intent intent = new Intent(Menu2.this, MainActivity.class);
        startActivity(intent);
    }
}


