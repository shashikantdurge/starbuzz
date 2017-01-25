package com.projects.creative.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static String EXTRA_DRINKNO="DRINKNO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkno=(Integer) getIntent().getIntExtra(DrinkActivity.EXTRA_DRINKNO,0);
        Drink drink=Drink.drinks[drinkno];

        ImageView photo=(ImageView)findViewById(R.id.photo);
        TextView name=(TextView)findViewById(R.id.name);
        TextView decription=(TextView)findViewById(R.id.description);

        photo.setImageResource(drink.getResourceId());
        name.setText(drink.getName());
        decription.setText(drink.getDescription());

    }
}
