package view;

import java.util.Scanner;

import bts.RidgeShingles;
import bts.DripEdge;
import bts.IceAndWater;
import bts.Material;
import bts.PipeJackFour;
import bts.PipeJackThreeToOne;
import bts.Shingles;
import bts.Starter;
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
		int edge = scanThree.nextInt();
		
		Scanner scanFour = new Scanner(System.in);
		System.out.println("Enter Length of Valleys (ft.): ");
		int valley = scanFour.nextInt();
		
		Scanner scanFive = new Scanner(System.in);
		System.out.println("Enter number of 3\" - 1\" pipes");
		int pipesSmall = scanFive.nextInt();
		
		Scanner scanSix = new Scanner(System.in);
		System.out.println("Enter number of 4\" pipes");
		int pipesLarge = scanSix.nextInt();
		
		System.out.println("Squares: " + squares + " sq.");
		System.out.println("Ridge: " + ridge + " ft.");
		System.out.println("Edge: " + edge + " ft.");
		System.out.println("Valley: " + valley + " ft.");
		
		System.out.println();
		
		Material shingles = new Shingles(squares, ridge, edge, valley);
		System.out.println("Shingles: " + shingles.getAmount() + " sq.");
		
		Material ridgeShingles = new RidgeShingles(squares, ridge, edge, valley);
		System.out.println("Ridge: " + ridgeShingles.getAmount() + " bundles");
		
		Material starter = new Starter(squares, ridge, edge, valley);
		System.out.println("Starter: " + starter.getAmount() + " bundles");
		
		Material underlay = new SyntheticUnderlayment(squares, ridge, edge, valley);
		System.out.println("Underlayment: " + underlay.getAmount() + " rolls");
		
		Material dripEdge = new DripEdge(squares, ridge, edge, valley);
		System.out.println("Drip Edge: " + dripEdge.getAmount() + " pieces");
		
		Material iceAndWater = new IceAndWater(squares, ridge, edge, valley);
		System.out.println("Ice & Water: " + iceAndWater.getAmount() + " rolls");
		
		Material threeInPipes = new PipeJackThreeToOne(pipesSmall);
		System.out.println("Three to one inch pipe Jacks: " + threeInPipes.getAmount());
		
		Material fourInPipes = new PipeJackFour(pipesLarge);
		System.out.println("Four inch pipe Jacks: " + fourInPipes.getAmount());
		
	}

}
