public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.title = "Avatar";
        movie.date = "2022.11.2";
        movie.actor = "Jake";
        movie.genre = "Action";
        movie.runningTime = 192;
        movie.grade = "12 years old";

        System.out.println(movie.title + " / " + movie.date + " / " + movie.actor + " / " + movie.genre + " / " + movie.runningTime + " / " + movie.grade);
    }
}

