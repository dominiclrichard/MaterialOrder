package view;

import java.util.Scanner;

import bts.RidgeShingles;
import bts.DripEdge;
import bts.Material;
import bts.Shingles;
import bts.SyntheticUnderlayment;

public class CLTest {

	public static void main(String[] args) {
		
		Scanner scanOne = new Scanner(System.in);
		System.out.println("Enter Number of Squares: ");
		int squares = scanOne.nextInt();
		
		Scanner scanTwo = new Scanner(System.in);
		System.out.println("Enter Length of Ridge (ft.): ");
		int ridge = scanTwo.nextInt();
		
		Scanner scanThree = new Scanner(System.in);
		System.out.println("Enter Length of Edge (ft.): ");
		int edge = scanTwo.nextInt();
		
		System.out.println("Squares: " + squares + " sq.");
		System.out.println("Ridge: " + ridge + " ft.");
		System.out.println("Edge: " + edge + " ft.");
		
		System.out.println();
		
		Material shingles = new Shingles(squares, ridge, edge);
		System.out.println("Shingles: " + shingles.getAmount() + " sq.");
		Material ridgeShingles = new RidgeShingles(squares, ridge, edge);
		System.out.println("Ridge: " + ridgeShingles.getAmount() + " bundles");
		Material underlay = new SyntheticUnderlayment(squares, ridge, edge);
		System.out.println("Underlayment: " + underlay.getAmount() + " rolls");
		Material dripEdge = new DripEdge(squares, ridge, edge);
		System.out.println("Drip Edge: " + dripEdge.getAmount() + " pieces");
	}

}
