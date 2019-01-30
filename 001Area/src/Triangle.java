import java.lang.Math.*;
import java.util.Scanner;
public class Triangle {

// class variables go here
private double sideA, sideB, sideC;
private double perimeter;
private double theArea;
Scanner keyboard = new Scanner(System.in);
// constructor goes here
// constructor has same name as class, but no class, void, and stuff like that
public Triangle() {

}
public void setVarsToZero() {
        sideA=0.0;
        sideB=0.0;
        sideC=0.0;
        perimeter=0.0;
        theArea=0.0;
    }
//method definition: 
public void showVars() {
        System.out.println("Side A = " + sideA);
        System.out.println("Side B = " + sideB);
        System.out.println("Side C = " + sideC);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + theArea);
    }


public void setSides() {
System.out.println("Please enter the length of side A (integer): ");
sideA = keyboard.nextDouble();
System.out.println("you entered:" + sideA);
System.out.println("Please enter the length of side B (integer): ");
sideB = keyboard.nextDouble();
System.out.println("Please enter the length of side C (integer): ");
sideC = keyboard.nextDouble();

}



	public void calcPerimeter() {
		perimeter = sideA + sideB +sideC;
	}
	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		System.out.println("Perimeter / 2.0 = " + p);
		
		theArea = Math.sqrt(p* (p-sideA) * (p-sideB) * (p-sideC));
		
		
	}
}

