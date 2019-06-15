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

public class nonVeg extends AppCompatActivity {
    private Button addtocart;

    Spinner list;
    String[] nonvegArray = {"Chicken Burger", "Buttterfly Chicken Pizza","Chicken Roll" ,"Periperi Pizza",
            "Chicken  Sandwich "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_veg);
        list=(Spinner) findViewById(R.id.nonveg_list);



        addtocart = (Button) findViewById(R.id.btnAddToCart);
        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceYourOrder();
            }
        });
        ArrayAdapter adapter=new ArrayAdapter(nonVeg.this,android.R.layout.simple_list_item_1,nonvegArray);
        list.setAdapter(adapter);


        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //TextView txt=(TextView)view;

                // Toast.makeText(MainActivity.this,txt.getText().toString(),Toast.LENGTH_SHORT).show();

                switch (position)
                {
                    case 0:
                        Toast.makeText(nonVeg.this,"First",Toast.LENGTH_SHORT).show();

                        break;

                    case 1:
                        Toast.makeText(nonVeg.this,"Second",Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(nonVeg.this,"Third",Toast.LENGTH_SHORT).show();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }



    public void openPlaceYourOrder() {
        Intent intent = new Intent(this, cart.class);
        startActivity(intent);
    }

}

