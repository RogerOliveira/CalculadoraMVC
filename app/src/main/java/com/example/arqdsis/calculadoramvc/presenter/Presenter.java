package com.example.arqdsis.calculadoramvc.presenter;

/**
 * Created by roger.oliveira-816117932 on 02/05/2018.
 */

public interface Presenter {

    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onRestart();
    void onDestroy();
}
