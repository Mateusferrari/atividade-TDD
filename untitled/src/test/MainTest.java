package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import app.Main;

public class MainTest {

    @Test
    public void testTrenoEquilibrado() {
        int[] presentes = {4, 6, 2};
        boolean resultado = Main.podeEquilibrar(presentes, 0, 0); // Chame a função da classe Main
        assertEquals(true, resultado, "O trenó deveria estar equilibrado.");
    }

    @Test
    public void testTrenoDesequilibrado() {
        int[] presentes = {6, 6};
        boolean resultado = Main.podeEquilibrar(presentes, 0, 0); // Chame a função da classe Main
        assertEquals(false, resultado, "O trenó não deveria estar equilibrado.");
    }
}

