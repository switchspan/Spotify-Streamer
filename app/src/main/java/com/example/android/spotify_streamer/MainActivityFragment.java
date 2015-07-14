package com.example.android.spotify_streamer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import kaaes.spotify.webapi.android.SpotifyApi;
import kaaes.spotify.webapi.android.SpotifyService;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;
    private SpotifyApi api = new SpotifyApi();

    public MainActivityFragment() {
        //SpotifyService spotify = api.getService();
        //ArtistsPager results = spotify.searchArtists("Beyonce");
//        int x = 0;
//        int y = 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        SpotifyService spotify = api.getService();
//        ArtistsPager results = spotify.searchArtists("Beyonce");

        int i = 0;

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
