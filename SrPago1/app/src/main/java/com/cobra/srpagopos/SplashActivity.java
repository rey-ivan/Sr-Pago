package com.cobra.srpagopos;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class SplashActivity  extends Activity {

    int progress=0;
    int limit = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        parseProgress(2500);
    }

    private void parseProgress(long milisegundos){
        CountDownTimer mCountDownTimer;

        mCountDownTimer=new CountDownTimer(milisegundos, limit) {

            @Override
            public void onTick(long millisUntilFinished) {
                progress+=limit;

            }

            @Override
            public void onFinish() {
                progress+=	limit;

                adress();


            }
        };

        mCountDownTimer.start();

    }
    public void adress(){
        Intent intent=new Intent(SplashActivity.this,LoginActivity.class);
        this.startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
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
