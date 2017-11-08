package com.projects.cristianzapata.vaneapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class tabReflexion extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_reflexion, container, false);

        // Se obtienen las webView para los textos
        final WebView wvReflexIntro = (WebView) rootView.findViewById(R.id.introduccionReflexiona);
        final WebView wvPart1 = (WebView) rootView.findViewById(R.id.parte1Reflexion);
        final WebView wvPart2 = (WebView) rootView.findViewById(R.id.parte2Reflexion);

        // Se adiciona el texto
        wvReflexIntro.loadData(getString(R.string.introReflexion), "text/html; charset=utf-8", "utf-8");
        wvPart1.loadData(getString(R.string.parte1Reflexion), "text/html; charset=utf-8", "utf-8");
        wvPart2.loadData(getString(R.string.parte2Reflexion), "text/html; charset=utf-8", "utf-8");

        return rootView;
    }

}
