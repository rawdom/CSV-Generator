import java.util.Scanner;

import com.sun.tools.javac.Main;


//First Operation that gets the number of coloumns a user wants to be generated, also promphs out the coloumns aswel
public class GenerateCSV {
	public static void main(String[] args) {
		FirstOperation(0);
		SecondOperation(0);
		ThirdOperation();
	}

		
	
	
public static int FirstOperation(int customcolnum) {
	 



		int calCulateColoumn = 1;
		boolean opr1 = false;
		
	//This operation grabs the number of coloumns from the scanner	
		while(opr1 == false) {
		
		//Valid data that can be inputed 
		String customdatstr = "NULL";
		float customdatnum = 0;
		String customdatdate = "00/00/0000"; //No date support in Eclipse
		
		//Start 
		
		
		//First Operation
		System.out.println("Enter How Many Coloumns You Would Like Generated?");
		Scanner colnum = new Scanner(System.in);
		customcolnum = colnum.nextInt();	
		System.out.println("You Have Entered " + customcolnum + " Coloumns, Continue? YES/NO");
		Scanner yesnoscnr = new Scanner(System.in);	
		char yeschr = yesnoscnr.next("Y|y|N|n").charAt(0);
		//colnum.close();
		//yesnoscnr.close();
		if (yeschr == 'Y'|| yeschr == 'y') {
			  System.out.println ("YOU HAVE ENTERED YES");
			  opr1 = false;
			break;	
			
			}
		
		else if (yeschr == 'N' || yeschr == 'n') {
			  System.out.println ("YOU HAVE ENTERED NO");

			  opr1 = true;
			  
			  //Quits this operation
		}
		break;

		

}



return customcolnum;




	}
	
public static int SecondOperation(int customrownum) {

boolean opr2 = false; //Re-uses this variable from previous operation

while(opr2 == false) {

	
	
	System.out.println("Please Enter The Maximum Amount Of Rows Generated By This Program");
	Scanner customrownumscnr = new Scanner(System.in);
	customrownum = customrownumscnr.nextInt();	
	
	System.out.println("You Have Entered " + customrownum + " Rows, Continue? YES/NO");	
	
	Scanner yesnoscnr = new Scanner(System.in);	
	char yeschr = yesnoscnr.next("Y|y|N|n").charAt(0);
	
	
if (yeschr == 'Y'|| yeschr == 'y') {
	  System.out.println ("YOU HAVE ENTERED YES");
	  opr2 = true;
	break;
		
	}

else if (yeschr == 'N' || yeschr == 'n') {
	  System.out.println ("YOU HAVE ENTERED NO");
	  opr2 = true;
	  
	  //Quits this operation
}


} 
return customrownum;

}

public static void ThirdOperation() {
	int customcolnum = 0;
	int customrownum = 0;
	customcolnum = FirstOperation(customcolnum);
	customrownum = SecondOperation(customrownum);
//SecondOperation();
//SecondOperation.customrownum();
boolean opr3 = false; //Re-uses this variable from previous operation

while(opr3 == false) {
	
	
	System.out.println(customcolnum + "Colums and " + customrownum +  "rows, CONTINUE YES/NO");	
	
	Scanner yesnoscnr = new Scanner(System.in);	
	char yeschr = yesnoscnr.next("Y|y|N|n").charAt(0);
	
	
if (yeschr == 'Y'|| yeschr == 'y') {
	  System.out.println ("YOU HAVE ENTERED YES");
	  opr3 = false;
	  break;
	  
	  
	}

else if (yeschr == 'N' || yeschr == 'n') {
	  System.out.println ("YOU HAVE ENTERED NO");
	  opr3 = true;
	  
	  //Quits this operation
}
break;

}
return;

}
	
//Do not return!!!! It breaks the operations Maybe
//Need to pass the variable between classes
//OLD CODE DONT USE!!

/*

		System.out.println("Please Enter The Maximum Amount Of Rows Generated By This Program");
		System.out.println("You Have Entered " + customrownum + " Rows, Continue YES/NO?");
		System.out.println("Please Select Which Data Type For the Coloumn"); //Need to loop for each coloumn
		
		//Enter data for each row, TODO
		System.out.println("Please Enter Your Data For The First Coloumn From 1 To " + customrownum );
		System.out.println(customrownum + " Created");
		System.out.println("All Data For " + customrownum + " Entered Succefully!");
		
		
		//Write To CSV File, TODO
		System.out.println("Writing Data...........");
		System.out.println("DONE!");
		System.out.println("ERROR!");
		TEST TEST
		*/
	}


