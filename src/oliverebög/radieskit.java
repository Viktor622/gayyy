package oliverebög;
import java.util.Scanner;

public class radieskit {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sphereRadius ;
		double sphereVolume;

		System.out.println("Radien av horklotet? :");
		sphereRadius = sc.nextDouble();
		
		sphereVolume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( sphereRadius, 3 );
		System.out.println("volymen är fucking : " + sphereVolume);
		
		
		
		sc.close();
	}
	
	
	
}

