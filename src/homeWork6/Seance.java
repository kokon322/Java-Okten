package homeWork6;

import java.util.Comparator;
import java.util.Objects;

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = startTime.calculateEndTime(movie.getDuration());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Season{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance season = (Seance) o;
        return Objects.equals(movie, season.movie) && Objects.equals(startTime, season.startTime) && Objects.equals(endTime, season.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }


    @Override
    public int compareTo(Seance o) {
        if (this.startTime.getHour() < o.startTime.getHour()) {
            return -1;
        } else if (this.startTime.getHour() > o.startTime.getHour()) {
            return 1;
        } else {
            return 0;
        }
    }
}
