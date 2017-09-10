package assignment;
import java.util.Scanner;
public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		String del;
		String str2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give me a sentence: ");
		str=sc.nextLine();
		System.out.println("Give me characters to delete: ");
		del=sc.nextLine();
		
		str2=str.replace(del,"");
		System.out.println("Original sentence: "+str);
		System.out.println("Modified sentence: "+str2);

		return;
	}

}
