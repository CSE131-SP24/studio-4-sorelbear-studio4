package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		if (shape.equals("rectangle")) {
			StdDraw.setPenColor(in.nextInt(),in.nextInt(),in.nextInt());
			if(in.nextBoolean()==true) {
				StdDraw.filledRectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else {
				StdDraw.rectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		}
		if (shape.equals("triangle")) {
			StdDraw.setPenColor(in.nextInt(),in.nextInt(),in.nextInt());
			if(in.nextBoolean()==true) {
				double[] x = new double [3];
				double[] y = new double [3];
				for (int i =0;i<3;i++) {
					x[i]=in.nextDouble();
					y[i]=in.nextDouble();
				}
				StdDraw.filledPolygon(x, y);
			}
			
			else {
				double[] x = new double [3];
				double[] y = new double [3];
				for (int i =0;i<3;i++) {
					x[i]=in.nextDouble();
					y[i]=in.nextDouble();
				}
				StdDraw.polygon(x, y);
			
		}}
		if (shape.equals("ellipse")) {
			StdDraw.setPenColor(in.nextInt(),in.nextInt(),in.nextInt());
			if(in.nextBoolean()==true) {
				StdDraw.filledEllipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else {
				StdDraw.ellipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		
		}
	}
	}
