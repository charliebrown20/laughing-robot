//Charles Bejarano 

import java.util.ArrayList; 

public class MavBoxTest
{
	public static void main(String args[])
	{
		
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		ArrayList<Game> gameList = new ArrayList<Game>(); 
		
		Customer c1 = new Customer("Jones", "1234-1234-1234-1234");
		Customer c2 = new Customer("Smith", "6543-6543-6543-6543");
		
		Movie m1 = new Movie("Titanic", "1A", 4.99);
		Movie m2 = new Movie("Star Wars", "2C", 5.99);
		m1.setMtype(Movie.MovieType.BLURAY);
		m2.setMtype(Movie.MovieType.DVD); 
		
		Game g1 = new Game("Warcraft", "5D", 3.99);
		Game g2 = new Game("Tomb Raider", "12F", 3.59);
		g1.setGtype(Game.GameType.PLAYSTATION);
		g2.setGtype(Game.GameType.NINTENDO);
		
		customerList.add(c1);
		customerList.add(c2);
		
		movieList.add(m1);
		movieList.add(m2);
		
		gameList.add(g1);
		gameList.add(g2);
		
		System.out.println(customerList);
		System.out.println(movieList);
		System.out.println(gameList); 
		
	}
	
}