
/*
 * NOTES
 * 
 * NEED TO CLOSE SCANNERS (Might need to re-do the scanners)
 * NEED TO ADD 'try' conditions incase it fails
 * NEED TO STOP USER FROM INPUTING ILLEGAL DATATYPES
 * WORK ON 6TH OPERATION
 * WORK ON PROMPHT OPERATIONS
 * THE FITH AND 6TH OPERATIONS WORK BUT IT ASKS FOR 1 MORE COLOMN THAN ITS SUPPOSE TO
 * (Think it might be because arrays start at 0)
 * DATA GETS CORRUPTED AT FINAL OUTPUT
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class GenerateCSV {

	void endOfProgram() {

	}



	public static void main(String[] args) {

		/* INIT DECLARE */
		//Dates
		Date date = null;

		//Scanners
		Scanner intGrabber = null;
		Scanner yesnoscnr = null;
		Scanner charScanner = null;

		//chars
		char yeschr = 0;

		//ints
		int customcolnum = 0;
		int customrownum = 0;

		/* END INIT DECLARE */

		//First Operation: Gets the amount of columns that a user wants in their csv file
		boolean opr1 = true;
		opr1p1:
			while(opr1 == true) {

				//String customdatstr = "NULL"; //Not used yet TODO 
				//float customdatnum = 0; //Not used yet TODO 

				/* How to do Custom Dates */
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				try {
					date = format.parse("21/09/1995");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(date);
				/* END note: there is native sql in java if that is better */
				//String customdatdate = "00/00/0000"; //No date support in Eclipse

				System.out.println("Enter How Many Coloumns You Would Like Generated?");
				try {
					intGrabber = new Scanner(System.in);
					customcolnum = intGrabber.nextInt();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break opr1p1;
				}
				System.out.println("You Have Entered " + customcolnum + " Coloumns, Continue? YES/NO");
				try {
					yesnoscnr = new Scanner(System.in);	
					yeschr = yesnoscnr.next("Y|y|N|n").charAt(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break opr1p1;
				}

				if (yeschr == 'Y'|| yeschr == 'y') {
					System.out.println ("YOU HAVE ENTERED YES");
					opr1 = false;
					//Continue operation
					break;

				}

				else if (yeschr == 'N' || yeschr == 'n') {
					System.out.println ("YOU HAVE ENTERED NO");
					opr1 = true;
					//Restart operation
				}
			}//First Operation While Loop END



		//Second Operation: Gets the amount of rows that the user wants to be generated
		boolean opr2 = true;
		opr2p1:
			while(opr2 == true) {



				System.out.println("Please Enter The Maximum Amount Of Rows Generated By This Program");
				try {
					intGrabber = new Scanner(System.in);	
					customrownum = intGrabber.nextInt();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break opr2p1;
				}	

				System.out.println("You Have Entered " + (customrownum) + " Rows, Continue? YES/NO");	

				try {
					yesnoscnr = new Scanner(System.in);
					yeschr = yesnoscnr.next("Y|y|N|n").charAt(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break opr2p1;
				}


				if (yeschr == 'Y'|| yeschr == 'y') {
					System.out.println ("YOU HAVE ENTERED YES");
					opr2 = true;
					//Continue operation
					break;

				}

				else if (yeschr == 'N' || yeschr == 'n') {
					System.out.println ("YOU HAVE ENTERED NO");
					opr2 = false;
					//Restart operation
				}
			}//Second Operation While Loop END



		//Third Operation: Displays the total amount of columns and rows that a user wants to input into the program

		boolean opr3 = true;
		opr3p1:
			while(opr3 == true) {


				System.out.println(customcolnum + " Colums and " + customrownum +  " rows, CONTINUE YES/NO");	

				try {
					yesnoscnr = new Scanner(System.in);
					yeschr = yesnoscnr.next("Y|y|N|n").charAt(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break opr3p1;
				}


				if (yeschr == 'Y'|| yeschr == 'y') {
					System.out.println ("YOU HAVE ENTERED YES");
					customrownum--;
					customcolnum--;
					opr3 = false;
					//Continue operation
					break;

				}

				else if (yeschr == 'N' || yeschr == 'n') {
					System.out.println ("YOU HAVE ENTERED NO");
					opr3 = true;
					//Restarts operation
				}
			}//Third Operation END


		//Sixth Operation: TODO

		ArrayList<String> coldata = new ArrayList<String>();
		ArrayList<ArrayList<String>> rowdata = new ArrayList<ArrayList<String>>();
		int sixoploop = 0;
		int forthoploop = 0;
		for(sixoploop = 0; sixoploop <= customrownum;sixoploop++)
		{
			//Fourth Operation: Gets the user to enter the data for each column in a row





			charScanner = new Scanner(System.in); //Having issues trying to close it
			for(forthoploop = 0; customcolnum >= (forthoploop);forthoploop++){
				System.out.println("Please enter your data for column " + (forthoploop +1) + " In row " + (sixoploop + 1));
				coldata.add (charScanner.nextLine());


			}//Forth Operation END
			ArrayList<String> coldatacopy = new ArrayList<String>();
			coldatacopy = (ArrayList)coldata.clone();
			coldata.clear();
			rowdata.add(coldatacopy);

		}



		//Fifth Operation: Displays all data entered for the selected row
		System.out.println('\n' + "				" + rowdata);

		/* End of Program */
		intGrabber.close();
		intGrabber=null;
		yesnoscnr.close();
		yesnoscnr = null;
		charScanner.close();
		charScanner = null;
		/* End of Program */
	}//Main END

}//Class END




