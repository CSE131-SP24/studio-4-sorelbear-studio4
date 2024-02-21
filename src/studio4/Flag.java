package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.25, 0.175);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(0.5, 0.5, .145);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(0.5, 0.5, .125);
	}
}