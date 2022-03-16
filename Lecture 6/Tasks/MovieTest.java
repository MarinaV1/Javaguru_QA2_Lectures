import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovieTest {

    //        Create movie object
    Movie movie = new Movie();


    public void printAll() {
        //        Get all information from movies
        System.out.println("Movie Name " + movie.getMovieName());
        System.out.println("Movie Director " + movie.getMovieDirector());
        System.out.println("Movie Genre " + movie.getMovieGenre());
        System.out.println("Movie Year " + movie.getYear());
        System.out.println("Movie Box Office " + movie.getBoxOffice());
        System.out.println("Movie Budget " + movie.getBudget());
    }

    @Before
    public void setUp() {
        printAll();
        //        Set Parameters
        movie.setMovieName("Rocketman");
        movie.setMovieDirector("Dexter Fletcher");
        movie.setMovieGenre("Musical/Drama");
        movie.setYear(2019);
        movie.setBoxOffice(195000000);
        movie.setBudget(41000000);
    }

    @After
    public void tearDown() {
        movie = null;
    }

    @Test
    public void firstTest() {
        printAll();
//      Adding assertions
        assertThat(movie.getMovieName()).isEqualTo("Rocketman");
        assertThat(movie.getMovieDirector()).isNotEmpty();
        assertThat(movie.getMovieGenre()).contains("Musical");
        assertThat(movie.getMovieGenre()).contains("Drama");
        assertThat(movie.getYear()).isLessThan(2022);
        int expectedBoxOffice = movie.getBudget() * 2;
        assertThat(movie.getBoxOffice()).isGreaterThan(expectedBoxOffice);
    }
}
