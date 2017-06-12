package com.projects.cristianzapata.vaneapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public class tabFabula extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fabula, container, false);

        // Se obtienen las webView para los textos
        final WebView wvFabIntro = (WebView) rootView.findViewById(R.id.introduccion);
        final WebView wvPart1 = (WebView) rootView.findViewById(R.id.parte1);
        final WebView wvPart2 = (WebView) rootView.findViewById(R.id.parte2);
        final WebView wvPart3 = (WebView) rootView.findViewById(R.id.parte3);
        final WebView wvPart4 = (WebView) rootView.findViewById(R.id.parte4);
        final WebView wvPart5 = (WebView) rootView.findViewById(R.id.parte5);
        final WebView wvPart6 = (WebView) rootView.findViewById(R.id.parte6);
        final WebView wvPart7 = (WebView) rootView.findViewById(R.id.parte7);
        final WebView wvPart8 = (WebView) rootView.findViewById(R.id.parte8);
        final WebView wvPart9 = (WebView) rootView.findViewById(R.id.parte9);
        final WebView wvPart10 = (WebView) rootView.findViewById(R.id.parte10);
        final WebView wvPart11 = (WebView) rootView.findViewById(R.id.parte11);

        // Se adiciona el string con los estilos
        wvFabIntro.loadData(getString(R.string.intro), "text/html; charset=utf-8", "utf-8");
        wvPart1.loadData(getString(R.string.parte1), "text/html; charset=utf-8", "utf-8");
        wvPart2.loadData(getString(R.string.parte2), "text/html; charset=utf-8", "utf-8");
        wvPart3.loadData(getString(R.string.parte3), "text/html; charset=utf-8", "utf-8");
        wvPart4.loadData(getString(R.string.parte4), "text/html; charset=utf-8", "utf-8");
        wvPart5.loadData(getString(R.string.parte5), "text/html; charset=utf-8", "utf-8");
        wvPart6.loadData(getString(R.string.parte6), "text/html; charset=utf-8", "utf-8");
        wvPart7.loadData(getString(R.string.parte7), "text/html; charset=utf-8", "utf-8");
        wvPart8.loadData(getString(R.string.parte8), "text/html; charset=utf-8", "utf-8");
        wvPart9.loadData(getString(R.string.parte9), "text/html; charset=utf-8", "utf-8");
        wvPart10.loadData(getString(R.string.parte10), "text/html; charset=utf-8", "utf-8");
        wvPart11.loadData(getString(R.string.parte11), "text/html; charset=utf-8", "utf-8");

        // Inflate the layout for this fragment
        return rootView;
    }

}
