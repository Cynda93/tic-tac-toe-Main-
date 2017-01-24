package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.Scanner;

public class TicTacToeTest {
	
	private TicTacToeModel model;
	
	@Before
	public void setUp(){
		model = new TicTacToeModel();
	}
	
	@Test
	public void testInitialBoardIsEmpty() {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
                TicTacToeModel.Mark m = model.getMark(row, col);
                assertEquals(TicTacToeModel.Mark.EMPTY, m);
            }
        }
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {					
		model.setMark(0,2);
        TicTacToeModel.Mark m = model.getMark(0,2);
        assertEquals(TicTacToeModel.Mark.X, m);
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		model.setMark(0,2); 
		model.setMark(2,0);
		TicTacToeModel.Mark m = model.getMark(2,0);
		assertEquals(TicTacToeModel.Mark.O, m);
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		model.setMark(0,0);
		model.setMark(0,0);
		Assert.That(game.IsAllowedMove(0,0), IsFalse);
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		Assert.That(game.IsOver(), Is.False);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		model.setMark(0,2);
		model.setMark(2,0);
		model.setMark(0,0);
		model.setMark(1,0);
		model.setMark(0,1);
		TicTacToeModel.Mark m = model.getMark(0,2)(0,0)(0,1);
		assertEquals(TicTacToeModel.Mark.X, m);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		model.setMark(0,0);
		model.setMark(0,1);
		model.setMark(1,1);
		model.setMark(0,2);
		model.setMark(1,2);
		model.setMark(1,0);
		model.setMark(2,0);
		model.setMark(2,1);
		model.setMark(2,2);

	}	
}
