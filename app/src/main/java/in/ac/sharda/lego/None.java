package in.ac.sharda.lego;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class None extends AppCompatActivity {
    Button order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_none);
        order=(Button)findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(None.this, "Order Success", Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {



                    @Override

                    public void run() {

                        Intent intent = new Intent(None.this, Menu2.class);
                        startActivity(intent);
                    }

                }, 1*1000);



            }
        });
    }

}

