package tictactoe;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static tictactoe.State.*;

enum State {
	GAME_NOT_FINISHED("Game not finished"),
	DRAW("Draw"),
	X_WINS("X wins"),
	O_WINS("O wins"),
	IMPOSSIBLE("Impossible");

	private final String stateDescription;

	State(String stateDescription) {
		this.stateDescription = stateDescription;
	}

	public String getStateDescription() {
		return stateDescription;
	}
}

public class Main {
	static char[] board = new char[9];
	static State state = GAME_NOT_FINISHED;

	public static void main(String[] args) {
		int positionOnField;
		char player = 'X';

		Arrays.fill(board, ' ');

		while (state == GAME_NOT_FINISHED) {
			printField(board);

			if (state == GAME_NOT_FINISHED) {
				positionOnField = enterXY();
				doMove(positionOnField, player);
				if (player == 'X') {
					player = 'O';
				} else {
					player = 'X';
				}
				getTextState();
			}

			if (state != GAME_NOT_FINISHED) {
				printField(board);
				System.out.println(state.getStateDescription());
			}
		}
	}

	private static void getTextState() {
		if (isNotFinish()) {
			state = GAME_NOT_FINISHED;
		} else if (isDraw()) {
			state = DRAW;
		} else if (isWinsX()) {
			state = X_WINS;
		} else if (isWinsO()) {
			state = O_WINS;
		} else if (isImpossible()) {
			state = IMPOSSIBLE;
		}
	}

	private static void printField(char[] board) {
		System.out.println("---------");
		System.out.println("| " + board[0] + " " + board[1] + " " + board[2] + " |");
		System.out.println("| " + board[3] + " " + board[4] + " " + board[5] + " |");
		System.out.println("| " + board[6] + " " + board[7] + " " + board[8] + " |");
		System.out.println("---------");
	}

	private static void doMove(int positionOnField, char c) {
		board[positionOnField] = c;
	}

	private static int enterXY() {
		int x;
		int y;
		int positionOnField = 0;
		boolean incorrectCoordinates = true;
		String userInput = "";
		Scanner scannerSystemIn = new Scanner(System.in);
		Scanner scannerUserInput;

		while (incorrectCoordinates) {
			System.out.print("Enter the coordinates: ");
			try {
				userInput = scannerSystemIn.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
			}

			scannerUserInput = new Scanner(userInput);
			try {
				x = scannerUserInput.nextInt();
				y = scannerUserInput.nextInt();
			} catch (NoSuchElementException | NumberFormatException e) {
				System.out.println("You should enter numbers!");
				incorrectCoordinates = true;
				continue;
			}

			positionOnField = getPositionOnFieldFromCoordinates(x, y);
			if (positionOnField == -1) {
				System.out.println("Coordinates should be from 1 to 3!");
				incorrectCoordinates = true;
				continue;
			}

			if (board[positionOnField] == 'X' || board[positionOnField] == 'O') {
				System.out.println("This cell is occupied! Choose another one!");
				incorrectCoordinates = true;
				continue;
			}
			incorrectCoordinates = false;
		}
		return positionOnField;
	}

	private static int getPositionOnFieldFromCoordinates(int x, int y) {
		switch (x) {
			case 1:
				switch (y) {
					case 1:
						return 0;
					case 2:
						return 1;
					case 3:
						return 2;
					default:
						return -1;
				}
			case 2:
				switch (y) {
					case 1:
						return 3;
					case 2:
						return 4;
					case 3:
						return 5;
					default:
						return -1;
				}
			case 3:
				switch (y) {
					case 1:
						return 6;
					case 2:
						return 7;
					case 3:
						return 8;
					default:
						return -1;
				}
			default:
				return -1;
		}
	}

	private static boolean isNotFinish() {
		return count(' ') > 0 &&	!isWinsX() && !isWinsO() &&	!isImpossible();
	}

	private static boolean isDraw() {
		return count(' ') == 0 && !isWinsX() && !isWinsO() && !isImpossible();
	}

	private static boolean isWinsX() {
		return isWin('X') && !isImpossible();
	}

	private static boolean isWinsO() {
		return isWin('O') && !isImpossible();
	}

	private static boolean isImpossible() {
		int x = count('X');
		int o = count('O');
		return (isWin('X') && isWin('O') || Math.abs(x - o) > 1);
	}

	private static boolean isWin(char c) {
		return (board[0] == c && board[1] == c && board[2] == c) ||
				(board[3] == c && board[4] == c && board[5] == c) ||
				(board[6] == c && board[7] == c && board[8] == c) ||
				(board[0] == c && board[3] == c && board[6] == c) ||
				(board[1] == c && board[4] == c && board[7] == c) ||
				(board[2] == c && board[5] == c && board[8] == c) ||
				(board[0] == c && board[4] == c && board[8] == c) ||
				(board[2] == c && board[4] == c && board[6] == c);
	}

	private static int count(char c) {
		int counter = 0;
		for (char c1 : board) {
			if (c == c1) {
				counter++;
			}
		}
		return counter;
	}
}
