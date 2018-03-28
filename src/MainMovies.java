import java.util.Scanner;
public class MainMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieClassw movie0=new MovieClassw("Twilight ","Science Fiction ",9);
		MovieClassw movie1=new MovieClassw("Captian America ","Action ",8);
		MovieClassw movie2=new MovieClassw("Finding Dory ","Comedy ",8);
		MovieClassw movie3=new MovieClassw("Moon Light ","Drama ",7);
		MovieClassw movie4=new MovieClassw("Loving ","Romance ",7);
		
		MovieClassw[] movieList={movie0,movie1,movie2,movie3,movie4};
		
		System.out.println("When finished key in quit");
		
		while(true){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a movie you want to see (Caps Sensitive) ");
		String moviename=scan.nextLine();
		
		
		if (moviename.equals("Twilight"))
		{
			System.out.println("Movie is in our listings");
			System.out.println(movieList[0].Name+movieList[0].Genre+movieList[0].Rating);
			
		}
		else if (moviename.equals("Captain America"))
		{
			System.out.println("Movie is in our listings");
			System.out.println(movieList[1].Name+movieList[1].Genre+movieList[1].Rating);
		}
		else if (moviename.equals("Finding Dory"))
		{
			System.out.println("Movie is in our listings");
			System.out.println(movieList[2].Name+movieList[2].Genre+movieList[2].Rating);
		}
		else if (moviename.equals("Moon Light"))
		{
			System.out.println("Movie is in our listings");
			System.out.println(movieList[3].Name+movieList[3].Genre+movieList[3].Rating);
		}
		else if (moviename.equals("Loving"))
		{
			System.out.println("Movie is in our listings");
			System.out.println(movieList[4].Name+movieList[4].Genre+movieList[4].Rating);
		}
		else if (moviename.equals("Quit"))
		{
			break;
		}
		else 
		{
			System.out.println("Your moive was not found");
		}
	}
	}
	

}
