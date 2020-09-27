package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

import static java.lang.Math.abs;


public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;


    public Movie(String title, Rating maturityRating) {
        super(title,maturityRating);
    }



    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }





    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public String getPlayingTime(){
        if (duration == 0){
            return "?";
        }
        else if (duration < 60){
            return String.format("%d min",getDuration());
        }
        else if(duration % 60 == 0){
            return String.format("%d h",getDuration() / 60);
        }
        else {
            return String.format("%d h %d min",getDuration() / 60, getDuration() % 60);
        }
    }

    @Override
    public void play() {
        System.out.println("Playing " + super.getTitle());
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + super.getTitle());
    }

    public void setDuration(int duration) {
        this.duration = abs(duration);
    }

    @Override
    public String toString() {
        if (releaseDate != null){
            return String.format("%s (%d)",getTitle(),getReleaseDate().getYear());
        }
        return super.getTitle();
    }
    public boolean isLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }
}
