package com.cse.university.itmraipur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;



public class MainActivity extends AppCompatActivity {

    private WebView mwebView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mwebView =(WebView) findViewById(R.id.wvBrowser);
        mwebView.getSettings().setJavaScriptEnabled(true);
        mwebView.getSettings().setLoadWithOverviewMode(true);
        mwebView.getSettings().setUseWideViewPort(true);
        mwebView.setWebViewClient(new ourViewClient());
        mwebView.loadUrl("https://www.itmuniversity.org");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction()==KeyEvent.ACTION_DOWN){
            switch (keyCode){
                case KeyEvent.KEYCODE_BACK:
                    if (mwebView.canGoBack()) {
                        mwebView.goBack();
                    }
                    else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
