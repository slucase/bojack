import java.util.*;
import java.lang.*;


public class bojack {

  public static int[][] ValidMoves = {{2,1}, {1,2}, {-1,2}, {-2,1}, {-2,-1}, {-1,-2}, {1,-2}, {-2,-1}};

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
    MoveValue = new int [2];

    int moveNumber = 1;
    int[] positionZ = {0,0};
    

    
    Random rand = new Random();
    int NextMove = rand.nextInt(8);

    MoveValue[0] = positionZ[0] + ValidMoves[NextMove][0];
    MoveValue[1] = positionZ[1] + ValidMoves[NextMove][1];

    if ( MoveValue[0] >= 0 &&
         MoveValue[0] < 8 &&
         MoveValue[1] >= 0 &&
         MoveValue[1] < 8 &&
         board[positionZ[0]][positionZ[1]] < 1)
      {
        

      }

    ;
    positionZ[1] += ValidMoves[NextMove][1];

    board[positionZ[0]][positionZ[1]] = moveNumber;

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



/*


    //>> make a move:

    

*/




  }
}