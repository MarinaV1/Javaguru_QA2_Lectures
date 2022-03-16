public class Movie {

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(int boxOffice) {
        this.boxOffice = boxOffice;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    private String movieName;
    private String movieDirector;
    private String movieGenre;
    private int year;
    private int boxOffice;
    private int budget;
}
