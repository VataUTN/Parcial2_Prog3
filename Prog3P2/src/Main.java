public class Main {
    // Método para verificar si hay una secuencia mutante en diagonal inversa
    public static boolean diagonalInversa(String[] dna) {
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].toCharArray().length; j++) {
                try {
                    if (dna[i].toCharArray()[j] == dna[i + 1].toCharArray()[j - 1] &&
                            dna[i + 2].toCharArray()[j - 2] == dna[i + 3].toCharArray()[j - 3] &&
                            dna[i + 1].toCharArray()[j - 1] == dna[i + 3].toCharArray()[j - 3]) {
                        return true; // Si se encuentra una secuencia mutante, retorna true
                    }
                } catch (Exception e) {
                    // Se utiliza un bloque try-catch para evitar errores de índice fuera de rango
                }
            }
        }
        return false; // Si no se encuentra una secuencia mutante en diagonal inversa, retorna false
    }

    // Método para verificar si hay una secuencia mutante en diagonal
    public static boolean diagonal(String[] dna) {
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].toCharArray().length; j++) {
                try {
                    if (dna[i].toCharArray()[j] == dna[i + 1].toCharArray()[j + 1] &&
                            dna[i + 2].toCharArray()[j + 2] == dna[i + 3].toCharArray()[j + 3] &&
                            dna[i + 1].toCharArray()[j + 1] == dna[i + 3].toCharArray()[j + 3]) {
                        return true; // Si se encuentra una secuencia mutante, retorna true
                    }
                } catch (Exception e) {
                    // Se utiliza un bloque try-catch para evitar errores de índice fuera de rango
                }
            }
        }
        return false; // Si no se encuentra una secuencia mutante en diagonal, retorna false
    }

    // Método para verificar si hay una secuencia mutante en el lado
    public static boolean lado(String[] dna) {
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].toCharArray().length; j++) {
                if (dna[i].toCharArray().length - 4 - j >= 0) {
                    if (dna[i].toCharArray()[j] == dna[i].toCharArray()[j + 1] &&
                            dna[i].toCharArray()[j + 2] == dna[i].toCharArray()[j + 3] &&
                            dna[i].toCharArray()[j + 1] == dna[i].toCharArray()[j + 3]) {
                        return true; // Si se encuentra una secuencia mutante, retorna true
                    }
                }
            }
        }
        return false; // Si no se encuentra una secuencia mutante en el lado, retorna false
    }

    // Método para verificar si hay una secuencia mutante hacia arriba
    public static boolean arriba(String[] dna) {
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].toCharArray().length; j++) {
                if (dna.length - i - 4 >= 0) {
                    if (dna[i].toCharArray()[j] == dna[i + 1].toCharArray()[j] &&
                            dna[i + 2].toCharArray()[j] == dna[i + 3].toCharArray()[j] &&
                            dna[i + 1].toCharArray()[j] == dna[i + 3].toCharArray()[j]) {
                        return true; // Si se encuentra una secuencia mutante, retorna true
                    }
                }
            }
        }
        return false; // Si no se encuentra una secuencia mutante hacia arriba, retorna false
    }

    // Método principal para verificar si una secuencia de ADN es mutante
    public static boolean isMutant(String[] dna) {
        if (arriba(dna) || lado(dna) || diagonal(dna) || diagonalInversa(dna)) {
            return true; // Si se encuentra una secuencia mutante en alguna dirección, retorna true
        }
        return false; // Si no se encuentra una secuencia mutante en ninguna dirección, retorna false
    }

    public static void main(String[] args) {
        String[] dna = {
                "ACCTTG",
                "CACCGT",
                "TTAGGT",
                "CTGAGG",
                "GGTATG",
                "GCTACT"
        };
        if (isMutant(dna))
            System.out.println("Es mutante");
        else
            System.out.println("No es mutante");
    }
}
