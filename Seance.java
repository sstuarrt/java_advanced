package com.company.java_advanced.homework1.task1;

public class Seance extends Movie {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance() {
        //endTime = startTime + Movie.getDuration();
    }

    public Seance(Movie movie, Time startTime, Time endTime) {
        this.movie = movie;
        this.startTime = startTime;
        //this.endTime = this.startTime + Movie.getDuration();
    }

    public Seance(Movie movie1, int i, int i1) {}

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
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}

