package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';
    public static final char SYMBOL2 = ' ';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] twoDimensionalArray = new char[size][size];
        for (int i = 0; i< twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = (j == i || j == twoDimensionalArray.length - 1 - i) ? SYMBOL : SYMBOL2;
                System.out.print(twoDimensionalArray[i][j]);
            }
            System.out.println();
        }



        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return twoDimensionalArray;
    }
}