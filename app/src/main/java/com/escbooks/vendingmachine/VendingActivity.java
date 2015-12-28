package com.escbooks.vendingmachine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VendingActivity extends AppCompatActivity {

    int stockCount = 5;
    float wallet = 10f;
    float snickerPrice = 1.65f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vending);

        Button restockButton = (Button) findViewById(R.id.restock_button);
        Button purchaseButton = (Button) findViewById(R.id.purchase_button);

        final TextView walletAmountView = (TextView) findViewById(R.id.wallet_amount);
        final TextView stockAmountView = (TextView) findViewById(R.id.stock_amount);

        restockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stockCount < 99) {
                    stockCount++;

                    stockAmountView.setText(String.valueOf(stockCount));
                }
            }
        });

        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (wallet > snickerPrice && stockCount > 0) {
                    wallet -= snickerPrice;
                    walletAmountView.setText(String.valueOf(wallet));

                    stockCount--;
                    stockAmountView.setText(String.valueOf(stockCount));
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vending, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
