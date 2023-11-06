import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void diagonalInversa() {
        // Prueba 1: Una matriz con una secuencia mutante en diagonal inversa
        String[] dna = {
                "atgcgA",
                "cagtAc",
                "ttaAtt",
                "agAcgg",
                "gAgtca",
                "Acactg"
        };
        boolean result = Main.diagonalInversa(dna);
        assertTrue(result, "La prueba para la condición diagonal inversa verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        // Prueba 2: Otra matriz con una secuencia mutante en diagonal inversa
        String[] dna2 = {
                "ATGCGAT",
                "CAGTACTT",
                "TTAATTA",
                "AGACGGA",
                "GTGTCAA",
                "CCACTGA"
        };
        result = Main.diagonalInversa(dna2);
        assertTrue(result, "La prueba para la condición diagonal inversa verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        // Prueba 3: Una matriz sin secuencia mutante en diagonal inversa
        String[] dna3 = {
                "ATGCGT",
                "CACTAC",
                "TCAATT",
                "CGACGG",
                "GTGTCA",
                "CCACTG"
        };
        result = Main.diagonalInversa(dna3);
        assertTrue(result, "La prueba para la condición diagonal inversa falsa falló");
        System.out.println("Resultado de la prueba: " + result);
    }

    @org.junit.jupiter.api.Test
    void diagonal() {
        // Prueba 1: Una matriz con una secuencia mutante en diagonal
        String[] dna = {
                "ATGCGA",
                "CAGTAC",
                "TAAATT",
                "AGAAGG",
                "GAGTCA",
                "ACACTG"
        };
        boolean result = Main.diagonal(dna);
        assertTrue(result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        // Prueba 2: Otra matriz con una secuencia mutante en diagonal
        String[] dna2 = {
                "ATGCGA",
                "CATTAC",
                "TTATTT",
                "AGACTG",
                "GTGTCA",
                "CCACTG"
        };
        result = Main.diagonal(dna2);
        assertTrue(result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        // Prueba 3: Una matriz sin secuencia mutante en diagonal
        String[] dna4 = {
                "CGATGA",
                "TACAGT",
                "AATTAA",
                "GGACAG",
                "TCAGAG",
                "TGTCAC"
        };
        result = Main.diagonal(dna4);
        assertFalse(result, "La prueba para la condición diagonal falsa falló");
        System.out.println("Resultado de la prueba: " + result);
    }

    @org.junit.jupiter.api.Test
    void lado() {
        // Prueba 1: Una matriz con una secuencia mutante en el lado
        String[] dna = {
                "AAAAAA",
                "CAGTAC",
                "TTTTTT",
                "AGACCG",
                "GTGTCA",
                "ACACTG"
        };
        boolean result = Main.lado(dna);
        assertTrue(result, "La prueba para la condición lado verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        // Prueba 2: Otra matriz con una secuencia mutante en el lado
        String[] dna2 = {
                "ATGCGA",
                "CAGTAC",
                "TTAATT",
                "AGACGG",
                "GAGTCA",
                "ACACTG"
        };
        result = Main.lado(dna2);
        assertFalse(result, "La prueba para la condición lado verdadera falló");
        System.out.println("Resultado de la prueba: " + result);
    }

    @org.junit.jupiter.api.Test
    void arriba() {
        // Prueba 1: Una matriz con una secuencia mutante hacia arriba
        String[] dna = {
                "ATGCGA",
                "TAGTAC",
                "TTAATT",
                "TGACGG",
                "TAGTCA",
                "ACACTG"
        };
        boolean result = Main.arriba(dna);
        assertTrue(result, "La prueba para la condición arriba verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        // Prueba 2: Otra matriz sin secuencia mutante hacia arriba
        String[] dna2 = {
                "ATGCGA",
                "CAGTAC",
                "TTAATT",
                "AGACGG",
                "GAGTCA",
                "ACACTG"
        };
        result = Main.arriba(dna2);
        assertFalse(result, "La prueba para la condición arriba falsa falló");
        System.out.println("Resultado de la prueba: " + result);
    }

    @org.junit.jupiter.api.Test
    void isMutant() {
        // Prueba 1: Una matriz con una secuencia mutante en diagonal inversa
        String[] dna = {
                "ATGCGA",
                "CAGTAC",
                "TTAATT",
                "AGACGG",
                "GAGTCA",
                "ACACTG"
        };
        boolean result = Main.isMutant(dna);
        assertTrue(result, "La prueba para la condición mutante verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        // Prueba 2: Una matriz con todas las secuencias iguales (debería considerarse mutante)
        String[] dna2 = {
                "AAAAAA",
                "AAAAAA",
                "AAAAAA",
                "AAAAAA",
                "AAAAAA",
                "AAAAAA"
        };
        result = Main.isMutant(dna2);
        assertTrue(result, "La prueba para la condición mutante verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        // Prueba 3: Una matriz con una secuencia mutante en diagonal
        String[] dna3 = {
                "AAACAA",
                "ATAAAA",
                "AATTAA",
                "AAAAAA",
                "AAAAAA",
                "ACCCCA"
        };
        result = Main.isMutant(dna3);
        assertTrue(result, "La prueba para la condición mutante verdadera falló");
        System.out.println("Resultado de la prueba: " + result);
    }
}
