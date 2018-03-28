import java.util.Scanner;
public class Taptha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan=new Scanner(System.in);
DogClas[]dog=new DogClas[3];
	for (int i=0; i<3; i++)
	{	
		System.out.println("Dogs name?");
		String name=Scan.nextLine();
		
		System.out.println("Dog Bread?");
		String bread=Scan.nextLine();
		
		dog[i]=new DogClas(name,bread);
	}
	System.out.println(dog[0].Name);
	}

}
