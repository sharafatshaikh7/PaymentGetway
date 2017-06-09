package com.paymentgetway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //usefull sites
    //http://www.androidhive.info/2015/02/android-integrating-paypal-using-php-mysql-part-1/#creating_php_project
    //http://www.androidhive.info/2014/01/how-to-create-rest-api-for-android-app-using-php-slim-and-mysql-day-12-2/
    //https://developer.paypal.com/developer/applications/edit/QVcyclJ1dW5UMDAxeTFUVUFqY05rNEhfWUJ6cVAtOEZfQl90NGtnNXVZWUIzdV9wZmMzbzhXS09tZS1rWEVtN1FGYml5QkFYLWtTc25aNjI=

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId() == R.id.btn_paypal){
                    startActivity(new Intent(MainActivity.this,PayPalActivity.class));
                }else if(v.getId() == R.id.btn_paytm){
                    startActivity(new Intent(MainActivity.this,PaytmActivity.class));
                }
            }
        };
        findViewById(R.id.btn_paypal).setOnClickListener(listener);
        findViewById(R.id.btn_paytm).setOnClickListener(listener);
    }
}
