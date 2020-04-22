

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle{
	
	private LetterLabel letter;
	/*
	 * There are 5 status for the tile:
	 * 0 means normal tile, no bonus points
	 * 1 means double letter tile
	 * 2 means triple letter tile
	 * 3 means double word tile
	 * 4 means triple word tile
	 * 9 means letter tile
	 * x and y means tile's locate. x is horizontal, y is vertical
	 */
	
	public Tile (int status, int x, int y) {
		setWidth(GUI.TILE_SIZE);
		setHeight(GUI.TILE_SIZE);
		
		relocate(x * GUI.TILE_SIZE, y * GUI.TILE_SIZE);
		
		setStroke(Color.valueOf("000000"));
		
		if (status == 0) {
			setFill(Color.valueOf("bdada0"));
		}else if (status == 1) {
			setFill(Color.valueOf("9baeb5"));
		}else if (status == 2) {
			setFill(Color.valueOf("438c9f"));
		}else if (status == 3) {
			setFill(Color.valueOf("d8aca1"));
		}else if (status == 4) {
			setFill(Color.valueOf("d75e3f"));
		}else if (status == 9) {
			setFill(Color.valueOf("d8cecc"));
		}
		
	}
	
	public boolean hasLetter() {
		return false;
	}
	
	public void setLetter(LetterLabel letter) {
		this.letter = letter;
	}

}