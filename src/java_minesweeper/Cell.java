package java_minesweeper;

public class Cell {
	private boolean hasMine;
	private boolean isRevealed;
    private boolean isFlagged;
    private int numSurroundMines;
    
    public Cell() {
    	this.hasMine = false;
    	this.isRevealed = false;
    	this.isFlagged = false;
    }
    
    public boolean hasMine() {
    	return hasMine;
    }
    
    public void setMine (boolean hasMine) {
    	this.hasMine = hasMine;
    }
    
    public boolean isRevealed() {
    	return isRevealed;
    }
    
    public void setRevealed (boolean isRevealed) {
    	this.isRevealed = isRevealed;
    }
    
    public boolean isFlagged() {
    	return isFlagged;
    }
    
    public void setFlagged (boolean isFlagged) {
    	this.isFlagged = isFlagged;
    }

    public int getNumSurroundMines() {
    	return numSurroundMines;
    }
    
	public void setNumSurroundMines(int numSurroundMines) {
		this.numSurroundMines = numSurroundMines;
		
	}
}
