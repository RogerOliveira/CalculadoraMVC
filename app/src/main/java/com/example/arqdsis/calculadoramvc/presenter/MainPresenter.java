package com.example.arqdsis.calculadoramvc.presenter;

import com.example.arqdsis.calculadoramvc.model.Calculadora;
import com.example.arqdsis.calculadoramvc.view.MainView;

/**
 * Created by roger.oliveira-816117932 on 02/05/2018.
 */

public class MainPresenter implements Presenter {
    private Calculadora model;
    private MainView view;

    public MainPresenter(MainView view){
        this.view = view;
    }
    @Override
    public void onCreate() {
        model = new Calculadora();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onDestroy() {

    }

    public void calculo(){
        model.setValor1(view.getValor1());
        model.setValor2(view.getValor2());
        model.setOperador(view.getOperador());
        model.calculo();
        view.setResultado(model.getResultado());
    }

    public  String getResultado(){
        return  model.getResultado();
    }
}
