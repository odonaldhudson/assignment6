import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class NAMECOUNTS{
	
	public static void main(String[] args)  {
		ArrayList<String> names = new ArrayList<String>();
		Scanner nameCount = new Scanner(System.in);
		
		String name = (" ");
		
		while (true) {
			System.out.println("Enter Name: ");
			name = nameCount.nextLine();
			
			if (!(names.contains(name)))
				names.add(name);
			if (name == (""))
				break;
		}
		System.out.println("nameCount");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	}
}