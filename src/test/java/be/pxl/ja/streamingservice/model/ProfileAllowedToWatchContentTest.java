package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProfileAllowedToWatchContentTest {
    private Profile profile;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;
    private Movie movie4;
    @BeforeEach
    public void init(){
        profile = new Profile();
    }
    @Test
    public void ifNoDateOfBirthAlwaysFalse(){
        for (Rating rating:Rating.values()) {
            movie1 = new Movie("test",rating);
            Assertions.assertFalse(profile.allowedToWatchContent(movie1));
        }
    }
    @Test
    public void ifAgeUnder7OnlyLittle(){
        profile.setDateOfBirth(LocalDate.now());
        movie1 = new Movie("test",Rating.LITTLE_KIDS);
        movie2 = new Movie("test",Rating.OLDER_KIDS);
        movie3 = new Movie("test",Rating.TEENS);
        movie4 = new Movie("test",Rating.MATURE);

        Assertions.assertTrue(profile.allowedToWatchContent(movie1));
        Assertions.assertFalse(profile.allowedToWatchContent(movie2));
        Assertions.assertFalse(profile.allowedToWatchContent(movie3));
        Assertions.assertFalse(profile.allowedToWatchContent(movie4));

    }
    @Test
    public void ifAgeIs7LittleAndOlderKidsOk(){
        profile.setDateOfBirth(LocalDate.now().minusYears(7));
        movie1 = new Movie("test",Rating.LITTLE_KIDS);
        movie2 = new Movie("test",Rating.OLDER_KIDS);
        movie3 = new Movie("test",Rating.TEENS);
        movie4 = new Movie("test",Rating.MATURE);

        Assertions.assertTrue(profile.allowedToWatchContent(movie1));
        Assertions.assertTrue(profile.allowedToWatchContent(movie2));
        Assertions.assertFalse(profile.allowedToWatchContent(movie3));
        Assertions.assertFalse(profile.allowedToWatchContent(movie4));

    }
    @Test
    public void ifAgeIs12LittleOlderAndTeensOk(){
        profile.setDateOfBirth(LocalDate.now().minusYears(12));
        movie1 = new Movie("test",Rating.LITTLE_KIDS);
        movie2 = new Movie("test",Rating.OLDER_KIDS);
        movie3 = new Movie("test",Rating.TEENS);
        movie4 = new Movie("test",Rating.MATURE);

        Assertions.assertTrue(profile.allowedToWatchContent(movie1));
        Assertions.assertTrue(profile.allowedToWatchContent(movie2));
        Assertions.assertTrue(profile.allowedToWatchContent(movie3));
        Assertions.assertFalse(profile.allowedToWatchContent(movie4));

    }
    @Test
    public void ifAgeIs16AllIsOk(){
        profile.setDateOfBirth(LocalDate.now().minusYears(16));
        movie1 = new Movie("test",Rating.LITTLE_KIDS);
        movie2 = new Movie("test",Rating.OLDER_KIDS);
        movie3 = new Movie("test",Rating.TEENS);
        movie4 = new Movie("test",Rating.MATURE);

        Assertions.assertTrue(profile.allowedToWatchContent(movie1));
        Assertions.assertTrue(profile.allowedToWatchContent(movie2));
        Assertions.assertTrue(profile.allowedToWatchContent(movie3));
        Assertions.assertTrue(profile.allowedToWatchContent(movie4));

    }
}
