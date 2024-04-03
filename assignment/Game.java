package assignment;

public class Game implements ContentActions {
	
	String title;

	public Game(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Game [title=" + title + "]";
	}

	@Override
	public String playContent() {
		return "The game " + title + " is playing now" ;
	}

	@Override
	public String pauseContent() {
			return  title + " game is paused";
	}

	@Override
	public String stopContent() {
		return title + " content is stopped";
	}
	
	
	

}
