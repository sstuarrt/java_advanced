package com.company.java_advanced.homework1.task1;

import java.util.Objects;
import java.util.TreeMap;
import java.util.ArrayList;

public class Cinema {
    TreeMap<Days, Schedule> schedules;
    ArrayList<Seance> moviesLibrary = new ArrayList<Seance>();
    private Time open;
    private Time close;

    public TreeMap<Days, Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(TreeMap<Days, Schedule> schedules) {
        this.schedules = schedules;
    }

    public ArrayList<Seance> getMoviesLibrary() {
        return moviesLibrary;
    }

    public void setMoviesLibrary(ArrayList<Seance> moviesLibrary) {
        this.moviesLibrary = moviesLibrary;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cinema)) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(getSchedules(), cinema.getSchedules()) && Objects.equals(getMoviesLibrary(), cinema.getMoviesLibrary()) && Objects.equals(getOpen(), cinema.getOpen()) && Objects.equals(getClose(), cinema.getClose());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSchedules(), getMoviesLibrary(), getOpen(), getClose());
    }

    public void addMovie(Seance movie, Time time) {
        moviesLibrary.add(movie);
    }

    public void removeMovie(Movie movie) {
        moviesLibrary.remove(movie);
    }

    public void addSeance (Seance seance, String title) {
        moviesLibrary.add(seance);
    }

    public void removeSeance(Seance seance) {
        moviesLibrary.remove(seance);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "schedules=" + schedules +
                ", moviesLibrary=" + moviesLibrary +
                ", open=" + open +
                ", close=" + close +
                '}';
    }

    public Cinema() {
        super();
    }
}
