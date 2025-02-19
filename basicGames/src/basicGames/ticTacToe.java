package basicGames;

public class ticTacToe {

	public static void main(String[] args) {
		char[] board= {'1','2','3',
				   '4','5','6',
				   '7','8','9'};
	var numberOfsqrsPlayed=0;
	var whoseTurnitIs='X';
	var gameEndingMsg="well, its a draw";
	while(numberOfsqrsPlayed < 9) {
		printBoard(board);
		getUsertoSelectSquare(board, whoseTurnitIs);
		if(theyWonOrNot(board, whoseTurnitIs))
		{
			printBoard(board);
			gameEndingMsg = "Yayy, you won the game!";
			break;
		}
		else {
			numberOfsqrsPlayed++;
			whoseTurnitIs = (whoseTurnitIs == 'X')?'O':'X';
	}
	}
	printBoard(board);
	System.out.println(gameEndingMsg);
	}
private static boolean theyWonOrNot(char[] board, char whoseTurnitIs) {
	return (board[0]+board[1]+board[2])==(whoseTurnitIs*3) 
	|| (board[3]+board[4]+board[5])==(whoseTurnitIs*3)
	|| (board[6]+board[7]+board[8])==(whoseTurnitIs*3)
	|| (board[0]+board[4]+board[8])==(whoseTurnitIs*3)
	|| (board[2]+board[4]+board[6])==(whoseTurnitIs*3)
	|| (board[0]+board[3]+board[6])==(whoseTurnitIs*3)
	|| (board[1]+board[4]+board[7])==(whoseTurnitIs*3)
	|| (board[2]+board[5]+board[8])==(whoseTurnitIs*3);
}
private static void getUsertoSelectSquare(char[] board, char whoseTurnitIs) {
	do {
		try {
			System.out.printf("Choose a square played %s:", whoseTurnitIs);
			var scanner = new java.util.Scanner(System.in);
			var input = scanner.nextInt();
			if(Character.isDigit(board[input-1])){
				board[input - 1] = whoseTurnitIs;
				break;
			}
			else {
				System.out.println("sorry, this square is taken!");
			}
			}
		 catch (Exception e) {
			System.out.println("something's not right. Try entering again..");
		}
	} while (true);
}
private static void printBoard(char[] board) {
	System.out.println(board[0]+" | "+board[1]+" | "+board[2]);
	System.out.println("- + - + - ");
	System.out.println(board[3]+" | "+board[4]+" | "+board[5]);
	System.out.println("- + - + - ");
	System.out.println(board[6]+" | "+board[7]+" | "+board[8]);
	System.out.println("- + - + - ");
}
}

