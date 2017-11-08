package com.projects.cristianzapata.vaneapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class tabVoces extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_voces, container, false);

        // Se obtienen las webView para los textos
        final WebView wvVocesIntro = (WebView) rootView.findViewById(R.id.introduccionVoces);

        // Se adiciona el texto
        wvVocesIntro.loadData(getString(R.string.introVoces), "text/html; charset=utf-8", "utf-8");

        return rootView;
    }
}
