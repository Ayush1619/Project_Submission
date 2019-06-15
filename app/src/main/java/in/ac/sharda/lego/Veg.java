package in.ac.sharda.lego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Veg extends AppCompatActivity {
    Spinner list;

    private Button addtocart;

    String[] vegArray = {"Veg Bugger", "Veg Pizza", "Veg Roll" ,"Salad", "Veg Sandwich "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        list = (Spinner) findViewById(R.id.veg_list);


        addtocart = (Button) findViewById(R.id.btnAddToCart);
        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceYourOrder();
            }
        });


        ArrayAdapter adapter = new ArrayAdapter(Veg.this, android.R.layout.simple_list_item_1, vegArray);
        list.setAdapter(adapter);


        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //TextView txt=(TextView)view;

                // Toast.makeText(MainActivity.this,txt.getText().toString(),Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        Toast.makeText(Veg.this, "First", Toast.LENGTH_SHORT).show();

                        break;

                    case 1:
                        Toast.makeText(Veg.this, "Second", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(Veg.this, "Third", Toast.LENGTH_SHORT).show();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void openPlaceYourOrder () {
        Intent intent = new Intent(this, cart.class);
        startActivity(intent);
    }
}

