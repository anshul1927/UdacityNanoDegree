package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numberOffCoffee = 0;


    public void increse(View view) {
        numberOffCoffee++;
        display(numberOffCoffee);
    }

    public void dec(View view) {
        if (numberOffCoffee > 0)
            numberOffCoffee--;
        display(numberOffCoffee);
    }

    public void sumbitOrder(View view) {
        String priceMessage = "Total amount is: "+ (numberOffCoffee*5) + "\nThank You!";
        displayPrice(priceMessage);
    }

    //@SuppressLint("SetTextI18n")
    private void display(int i) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + i);
    }


    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(String number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(number);
        }

}