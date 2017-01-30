package keywords;

import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	
	private TicTacToeModel model;
	
	public void startNewGame() {
		model = new TicTacToeModel();
		
	}
	
	public void markLocation(int row, int col) {
		model.setMark(row, col);

	}
	
	public String getMark(int row, int col) {
		TicTacToeModel.Mark m = model.getMark(row, col);
		if (m == TicTacToeModel.Mark.X) return "X";
		else if (m == TicTacToeModel.Mark.O) return "O";
		else return "";

	}
    
	public String getWinner() {
		String winner = "";
		TicTacToeModel.Result r = model.getResult();
		if ( r == TicTacToeModel.Result.OWin ){
			winner = "O";
		}

		if ( r == TicTacToeModel.Result.CAT ) {
			winner = "CAT";
		}

		if ( r == TicTacToeModel.Result.XWin ){
			winner = "X";
		}

		return winner;

	}
}
