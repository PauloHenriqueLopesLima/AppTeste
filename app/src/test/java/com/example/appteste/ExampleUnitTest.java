package com.example.appteste;

import junit.framework.TestCase;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void calculoImcCorreto(){

        MainActivity mainActivity = new MainActivity();
        float imc = mainActivity.calcularImc(80,2);
        assertEquals(20F,imc);
    }
}