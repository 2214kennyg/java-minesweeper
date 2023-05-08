package java_minesweeper;

import java.util.Scanner;

public class Game {
    private Board board;
    private boolean gameOver;
    private boolean gameWon;

    public Game() {
        this.board = new Board();
        this.gameOver = false;
        this.gameWon = false;
        board.findNumOfSurroundMines();
    }
    
    public void play() {
    	Scanner scanner = new Scanner(System.in);
        while (!gameOver && !gameWon) {
            printBoard();
            System.out.print("Enter row (0-9): ");
            int row = scanner.nextInt();
//            if (!scanner.hasNextInt()) {
//            	throw new IllegalArgumentException ("Invalid input - input must be an integer");
//            }
            System.out.print("Enter column (0-9): ");
            int col = scanner.nextInt();
//            if (!scanner.hasNextInt()) {
//            	throw new IllegalArgumentException ("Invalid input - input must be an integer");
//            }
            System.out.print("Enter 'r' to reveal cell, 'f' to flag/unflag cell: ");
            String action = scanner.next();
            
            if (action.equals("r")) {
            	if (board.getCell(row, col).hasMine()) {
            		gameOver = true;
            	} else {
            		board.revealCell(row, col);
            		if (board.isGameWon()) {
            			gameWon = true;
            		}
            	}
            } else if (action.equals("f")) {
            	board.flagCell(row, col);
            } else {
            	System.out.println("Invalid action");
            }
        }
        
        printBoard();
        
        if (gameOver) {
        	System.out.println("You stepped on a mine :( Game over");
        } else if (gameWon) {
        	System.out.println("Congratulations, you win!");
        }
        scanner.close();
    } 
        
    public void printBoard() {
    	System.out.println("    0 1 2 3 4 5 6 7 8 9");
    	System.out.println("    -------------------");
    	for (int row = 0; row < 10; row++) {
    		System.out.print(row + " | ");
    		for (int col = 0; col < 10; col++) {
                Cell cell = board.getCell(row, col);
                if (gameOver && cell.hasMine()) {
                    System.out.print("* ");
                } else if (cell.isRevealed()){
                	if (cell.hasMine()) {
                        System.out.print("* ");
                    } else {
                        System.out.print(cell.getNumSurroundMines() + " ");
                    }                	
                } else if (cell.isFlagged()){
                	System.out.print("F ");
                }  else {
                    System.out.print("? ");
                } 
    		} 
    		System.out.println("|" + row);
    	}
    	System.out.println("    -------------------");
    	System.out.println("    0 1 2 3 4 5 6 7 8 9");
    }
}
