package com.example.inspirian;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class courses extends Fragment {



    public courses() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_courses, container, false);
        WebView webView2=v.findViewById(R.id.webView2);

        webView2.getSettings().setJavaScriptEnabled(true);

        webView2.setWebViewClient(new WebViewClient());

        webView2.loadUrl("https://www.inspirian.info/courses");

        return v;
    }
}