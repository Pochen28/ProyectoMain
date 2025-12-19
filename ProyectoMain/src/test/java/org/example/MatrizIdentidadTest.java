import org.example.MatrizIdentidad;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MatrizIdentidadTest {

    @Test
    void comprobarIdentidad() {

        int[][] identidad2x2 = {
                {1, 0},
                {0, 1}
        };

        int[][] noIdentidadDiagonalMal = {
                {2, 0},
                {0, 1}
        };

        int[][] noIdentidadFueraDiagonal = {
                {1, 1},
                {0, 1}
        };

        int[][] identidad3x3 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        assertAll(
                () -> assertTrue(MatrizIdentidadTest.comprobarindentidad(identidad2x2)),
                () -> assertFalse(MatrizIdentidad.comprobar)
