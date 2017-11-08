package com.projects.cristianzapata.vaneapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class tabPersonajes extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_personajes, container, false);

        // Se obtienen las webView para los textos
        final WebView wvPersIntro = (WebView) rootView.findViewById(R.id.introduccionPersonajes);
        final WebView wvPart1 = (WebView) rootView.findViewById(R.id.parte1Personajes);
        final WebView wvPart2 = (WebView) rootView.findViewById(R.id.parte2Personajes);
        final WebView wvPart3 = (WebView) rootView.findViewById(R.id.parte3Personajes);

        // Se adiciona el texto
        wvPersIntro.loadData(getString(R.string.introPersonajes), "text/html; charset=utf-8", "utf-8");
        wvPart1.loadData(getString(R.string.parte1Personajes), "text/html; charset=utf-8", "utf-8");
        wvPart2.loadData(getString(R.string.parte2Personajes), "text/html; charset=utf-8", "utf-8");
        wvPart3.loadData(getString(R.string.parte3Personajes), "text/html; charset=utf-8", "utf-8");

        return rootView;
    }

}
