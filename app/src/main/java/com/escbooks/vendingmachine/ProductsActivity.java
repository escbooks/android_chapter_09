package com.escbooks.vendingmachine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        findViewById(R.id.water_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("PRODUCT_NAME", getString(R.string.water));
                intent.putExtra("PRICE", Float.parseFloat(getString(R.string.water_price)));
                intent.putExtra("STOCK", 5);

                setResult(RESULT_OK, intent);

                finish();
            }
        });

        findViewById(R.id.coke_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("PRODUCT_NAME", getString(R.string.coke));
                intent.putExtra("PRICE", Float.parseFloat(getString(R.string.coke_price)));
                intent.putExtra("STOCK", 10);

                setResult(RESULT_OK, intent);

                finish();
            }
        });

        findViewById(R.id.crisps_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("PRODUCT_NAME", getString(R.string.crisps));
                intent.putExtra("PRICE", Float.parseFloat(getString(R.string.crisps_price)));
                intent.putExtra("STOCK", 20);

                setResult(RESULT_OK, intent);

                finish();
            }
        });

        findViewById(R.id.snickers_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("PRODUCT_NAME", getString(R.string.snickers));
                intent.putExtra("PRICE", Float.parseFloat(getString(R.string.snickers_price)));
                intent.putExtra("STOCK", 15);

                setResult(RESULT_OK, intent);

                finish();
            }
        });

    }
}
