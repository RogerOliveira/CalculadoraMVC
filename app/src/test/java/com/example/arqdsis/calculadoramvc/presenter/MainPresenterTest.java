package com.example.arqdsis.calculadoramvc.presenter;

import com.example.arqdsis.calculadoramvc.view.MainActivity;
import com.example.arqdsis.calculadoramvc.view.MainView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnit44Runner;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by roger.oliveira-816117932 on 03/05/2018.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setUp(){
        presenter = new MainPresenter(view);
        presenter.onCreate();
    }

    @Test
    public void testCalculo(){
        when(view.getValor1()).thenReturn("1");
        when(view.getValor2()).thenReturn("2");
        when(view.getOperador()).thenReturn("+");
        when(view.getResultado()).thenReturn("3");
        presenter.calculo();
        assertEquals("3",presenter.getResultado());

        when(view.getValor1()).thenReturn("2");
        when(view.getValor2()).thenReturn("5");
        when(view.getOperador()).thenReturn("*");
        when(view.getResultado()).thenReturn("10");
        presenter.calculo();
        assertEquals("10",presenter.getResultado());
    }


}
