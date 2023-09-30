public class Main {
    public static void main(String[] args) {
        int i, j;
        float phi = 3.14f;
        char pil;
        boolean kondisi = true;
        String kata = "teks";

        for (i = 0; i < 5; i++) {
            if (kondisi) {
                System.out.println(kata);
            }
        }

        System.out.println();
        i = 0;
        while (i < 3) {
            System.out.println(phi + " * " + i + " = " + phi * i);
            i++;
        }

        System.out.println();
        do {
            System.out.println(kata);
            System.out.println("Apakah anda ingin mengulang kata tersebut?");
            System.out.println("(y/n)");
            pil = new java.util.Scanner(System.in).next().charAt(0);
        } while (pil == 'y' || pil == 'Y');

        System.out.println();
        int[] array = {1, 2, 3};
        for (i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }

        System.out.println();
        int[][] Arr = {{1, 2}, {3, 4}};
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }

        // Ini adalah komentar satu baris

        /*
         * Ini adalah komentar
         * multiple line
         */
    }
}
