import java.util.Random;
import java.util.Scanner;

public class minefield {
    int rowNumber, colNumber;
    int[][] map;
    int[][] board;
    Random rand = new Random();
    Scanner scan=new Scanner(System.in);

    public minefield(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map=new int[rowNumber][colNumber];
        this.board=new int[rowNumber][colNumber];
    }

   
}
