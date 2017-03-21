package edu.sdccd.laitinena3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String extraKey = "websiteName";
    private final String mesaURL = "http://www.sdmesa.edu";
    private final String yahooURL = "http://www.google.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // display logo in action bar
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        // add button listeners
        Button buttonMesa = (Button) findViewById(R.id.buttonGoMesa);
        buttonMesa.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowWebView.class);
                intent.putExtra(extraKey, mesaURL);
                startActivity(intent);
            }
        });

        // add button listeners
        Button buttonYahoo = (Button) findViewById(R.id.buttonGoYahoo);
        buttonYahoo.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowWebView.class);
                intent.putExtra(extraKey, yahooURL);
                startActivity(intent);
            }
        });
    }
}
