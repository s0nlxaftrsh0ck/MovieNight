class Movie {
	String title;
	String genre;
	int rating;

	void PlayIt() {
		System.out.println("Playing the movie");
	}
}

public class movieTestDrive {
	public static void main(String[] args) {

		Movie one = new Movie();
		one.title = "Gone with the stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "Lost in cubicle space";
		two.genre = "Comedy";
		two.rating = 5;
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
	}

}
