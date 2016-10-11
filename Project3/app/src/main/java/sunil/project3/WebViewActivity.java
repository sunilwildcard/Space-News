package sunil.project3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = new WebView(this);
        setContentView(webView);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        webView.loadUrl(url);




    }
}
