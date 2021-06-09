package controlStatementProject;
import java.util.*;
public class LeapYearCalculator {
	public static void main(String[] args) {
		int year, month;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Masukkan Bulan(dalam bentuk angka 1-12): ");
    	month = scan.nextInt();
    	System.out.println("Masukkan Tahun: ");
    	year = scan.nextInt();
    	
    	String output = (month%2 == 0) ? "Genap" : "Ganjil";
    	System.out.println("Bulan yang anda input termasuk bil : " + output);
    	switch(month)
    	{
    		case 1 :
    			System.out.println ("Jumlah Hari = 31 hari");
    		break;
    		case 2 :
    			if (year % 400 == 0) 
    			{
    				System.out.println ("Jumlah Hari = 29 hari");
    			}
    			else if((year % 400 != 0)&&(year % 100 == 0)) 
    			{
    				System.out.println ("Jumlah Hari = 28 hari"); 
    			}
    			else if((year % 400 != 0)&&(year % 100 != 0)&&(year % 4 == 0)) 
    			{
    				System.out.println ("Jumlah Hari = 29 hari"); 
    			}
    			else 
    			{
    				System.out.println ("Jumlah Hari = 28 hari");
    			}
    		break;
    		case 3 :
    			System.out.println ("Jumlah Hari = 31 hari");
    		break;
    		case 4 :
    			System.out.println ("Jumlah Hari = 30 hari");
    		break;
    		case 5 :
    			System.out.println ("Jumlah Hari = 31 hari");
    		break;
    		case 6 :
    			System.out.println ("Jumlah Hari = 30 hari");
    		break;
    		case 7 :
    			System.out.println ("Jumlah Hari = 31 hari");
    		break;
    		case 8 :
    			System.out.println ("Jumlah Hari = 31 hari");
    		break;
    		case 9 :
    			System.out.println ("Jumlah Hari = 30 hari");
    		break;
    		case 10 :
    			System.out.println ("Jumlah Hari = 31 hari");
    		break;
    		case 11 :
    			System.out.println ("Jumlah Hari = 30 hari");
    		break;
    		case 12 :
    			System.out.println ("Jumlah Hari = 31 hari");
    		break;
    		default :
    			System.out.println ("Invalid input");
    		break;
    	}
	}
}
