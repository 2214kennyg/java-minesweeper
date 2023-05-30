package java_minesweeper;

import java.util.Random;

public class Board {
	private Cell[][] cells;
	
	public Board() {
		this.cells = new Cell[10][10];
		initialiseBoard();
		placeMines();
		
	}
	
	private void initialiseBoard() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				cells[i][j] = new Cell();
			}
		}
	}
	
	public void placeMines() {
		Random rand = new Random();
		int numMines = 10;
		while (numMines > 0) {
			int row = rand.nextInt(10);
			int col = rand.nextInt(10);
            if (!cells[row][col].hasMine()) {
                cells[row][col].setMine(true);
                numMines--;
            }
		}
	}
	
	public Cell getCell(int row, int col) {
		return cells[row][col];
	}
	
	public void revealCell(int row, int col) {
		if (row >= 0 && row < 10 && col >= 0 && col < 10 && !cells[row][col].isRevealed() && !cells[row][col].isFlagged()) {
			cells[row][col].setRevealed(true);
			
//			if (cells[row][col].getNumSurroundMines() == 00 && !cells[row][col].hasMine()) {
//				for (int i = row - 1; i <= row + 1; i++) {
//					for (int j = row - 1; j <= row + 1; j++) {
//						if (i >= 0 && i < 10 && j >= 0 && j < 10) {
//                            revealCell(i, j);
//                        }
//					}
//				}
//			}
		}
	}
		
//	surrounding mines
	public void findNumOfSurroundMines() {
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				int numSurroundMines = 0;
				for (int i = row - 1; i <= row + 1; i++) {
					for (int j = col - 1; j <= col + 1; j++) {
						if (i >= 0 && i < 10 && j >= 0 && j < 10 && cells[i][j].hasMine()) {
							numSurroundMines++;
						}
					}
				}
				cells[row][col].setNumSurroundMines(numSurroundMines);
			}
		}
	}
	
    public void flagCell(int row, int col) {
        cells[row][col].setFlagged(!cells[row][col].isFlagged());
    }
    
    public boolean isGameWon() {
    	for (int row = 0; row < 10; row++) {
    		for (int col = 0; col < 10; col++) {
    			if (!cells[row][col].hasMine() && !cells[row][col].isRevealed()) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
   
}
