package in.ac.sharda.lego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class facilities extends AppCompatActivity {
    ListView list;
    String data[] = {"Various dishes", "Wi-Fi", "AC", "Paytm,Google pay","T.V"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);
        list = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(facilities.this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // TextView txt=(TextView)view;
                //Toast.makeText( context:MainActivity.this, txt.getText().toString()),
                //Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        Toast.makeText(facilities.this, "First", Toast.LENGTH_SHORT).show();
                    case 1:
                        Toast.makeText(facilities.this, "Second", Toast.LENGTH_SHORT).show();
                    case 2:
                        Toast.makeText(facilities.this, "Third", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
