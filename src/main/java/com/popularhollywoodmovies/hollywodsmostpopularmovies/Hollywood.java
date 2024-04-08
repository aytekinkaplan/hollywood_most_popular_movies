package com.popularhollywoodmovies.hollywodsmostpopularmovies;

import java.util.List;

public class Hollywood {
    private int rank;
    private String filmTitle;
    private int releaseYear;
    private double boxOffice;
    private String director;
    private List<String> leadActors;
    private List<String> genres;

    // Constructor
    public Hollywood(int rank, String filmTitle, int releaseYear, double boxOffice, String director, List<String> leadActors, List<String> genres) {
        this.rank = rank;
        this.filmTitle = filmTitle;
        this.releaseYear = releaseYear;
        this.boxOffice = boxOffice;
        this.director = director;
        this.leadActors = leadActors;
        this.genres = genres;
    }

    // Getters and setters
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(double boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getLeadActors() {
        return leadActors;
    }

    public void setLeadActors(List<String> leadActors) {
        this.leadActors = leadActors;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
}
