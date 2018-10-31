import java.util.Scanner;
public class DemoHorses {
public static void main(String [] args)
	{
	RaceHorse r=new RaceHorse();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name of the horse : ");
	String na=s.nextLine();
	System.out.println("Enter the color of the horse : ");
	String co=s.nextLine();
	System.out.println("Enter the year of birth of the horse : ");
	int ye=s.nextInt();
	System.out.println("Enter the number of races run by the horse : ");
	int ra=s.nextInt();
	r.setName(na);
	r.setColor(co);
	r.setYear(ye);
	r.setRaces(ra);
	System.out.print("Values has been received by the program !!!");
	System.out.println("Name : "+r.getName());
	System.out.println("Color : "+r.getColor());
	System.out.println("Year : "+r.getYear());
	System.out.println("Races run by the horse : "+r.getRaces());
	}
	  
	}