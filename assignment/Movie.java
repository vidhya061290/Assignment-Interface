package assignment;

public class Movie implements ContentActions {
	String title;

	public Movie(String title) {
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
		return "Movie [title=" + title + "]";
	}

	@Override
	public String playContent() {
		return "Now playing the movie : "+ title ;
	}

	@Override
	public String pauseContent() {
		return title + " movie is paused";
	}

	@Override
	public String stopContent() {
		return "The content is stopped in the movie : " + title;
	}
	
	
	

}
