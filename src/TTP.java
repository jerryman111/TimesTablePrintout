import java.util.Random;
import java.util.Scanner;

public class TTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		//Setup Variables
		int hi;
		int low;
		int num; 
		int x=1;
		int y=1;
        int j=1;
        
		//Ask for hi, low and num
		System.out.println("Welcome to my Times Table Challenge");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		in.nextLine();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		in.nextLine();
		if(hi<low) {
			hi=hi+low;
			low=hi-low;
			hi=hi-low;
		}
		//Loop and ask questions
		for (j=low;j<=hi;j++) {
		System.out.print("\t"+j);
	
		}
		System.out.println();
			for (x=low;x<=hi;x++) {
//			System.out.print("\t");
			System.out.print(""+x+"\t");

			for (y=low;y<=hi;y++) {
//				System.out.print("\t");
				System.out.print(""+x*y+" \t");
				
				
			}
			System.out.println();
		}

            
	}		
}