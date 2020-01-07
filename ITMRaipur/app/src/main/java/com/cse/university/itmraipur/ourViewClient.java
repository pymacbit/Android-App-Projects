package com.cse.university.itmraipur;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by y3 on 5/31/2017.
 */

class ourViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView v, String url)
    {
        v.loadUrl(url);
        return true;
    }
}
