package javafile;

/**
 *
 * @author CC44040337883
 */
    /**
     */
public class Matriz {

    public static void main(String[] args) {

        int i;
        int j;
        int number = 0;
        int matriz[][] = new int[3][3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j <= 2; j++) {
                matriz[i][j] = number++;
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println("");
        }

    }

}
