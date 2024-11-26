package me.nejan.pulseroom;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    WebView Firebase;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase = findViewById(R.id.Firebase);
        Firebase.getSettings().setJavaScriptEnabled(true);
        Firebase.setWebViewClient(new WebViewClient());
        Firebase.loadUrl("https://pulseroom-nejan-me.firebaseapp.com");
    }
}