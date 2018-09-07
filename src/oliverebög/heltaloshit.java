package oliverebög;

import java.util.Scanner;

public class heltaloshit {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Heltal ett?");
			int ett = sc.nextInt();
			
		System.out.println("heltal två?");
			int tvo = sc.nextInt();		
		
		if (ett > tvo){ 
			System.out.println("mindre talet är " + tvo);
		}
			else{
				System.out.println("mindre talet är " + ett);
			}
				
			
		}
		
		
		
		
	}


