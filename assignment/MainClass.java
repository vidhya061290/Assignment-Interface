package assignment;

public class MainClass {
public static void main(String[] args) {
	
	ContentActions movie = new Movie("The Frozen");
	
    System.out.println(	movie.playContent());
    System.out.println(movie.stopContent());
    System.out.println(movie.pauseContent());
	
	ContentActions game = new Game("MineCraft");
	
	System.out.println(game.playContent());
	System.out.println(game.pauseContent());
	System.out.println(game.stopContent());
	
	
	
}

}
