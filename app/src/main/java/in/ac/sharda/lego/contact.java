package in.ac.sharda.lego;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class contact extends AppCompatActivity {
    EditText txt;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        txt=(EditText)findViewById(R.id.no);
        Submit=(Button)findViewById(R.id.btn);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = txt.getText().toString();
                if (TextUtils.isEmpty(txt1)) {
                    txt.setError("enter no");

                } else {
                    Intent i = new Intent(Intent.ACTION_DIAL,
                            Uri.parse("tel:" + txt1));
                    startActivity(i);
                }

            }
        });
    }
}
