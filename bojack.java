import java.util.*;
import java.lang.*;

public class bojack {

  public static int[][] move = {{2,1}, {1,2}, {-1,2}, {-2,1}, {-2,-1}, {-1,-2}, {1,-2}, {-2,-1}};

  public static void main(String[] args)
  {
    //Tamanho do tabuleiro
    int size = 0;
    int[][] board;

    // << inicio da InitialCondition
    Scanner userInput = new Scanner(System.in);
    String inputRequest = "\nPlease, enter the size of the board (equal or greater than 8)";

    while (size < 8)
    {
      System.out.println(inputRequest);
      size = Integer.parseInt(userInput.nextLine());
      if (size < 8)
      {
        inputRequest = "Invalid value, please, enter the size of the board equal or greater than 8";
      }
    }
    // >> Final da Initial condition


    // << inicio classe PrintBoard recebe board e tamanho
    board = new int[size][size];
    
    for(int i = 0; i < size; i++)
    {
      for(int j = 0; j < size; j++)
      {
        if (j == 0) 
        {
          System.out.println(); 
        }
        System.out.print(board[j][i]);
      }
    }
    System.out.println("\nOK");
    // << fim da classe PrintBoard, retorna 0.
  }
}