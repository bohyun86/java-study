package stream.ex;

class MovieRating {
    String movieName;
    int rating;

    MovieRating(String movieName, int rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    String getMovieName() {
        return movieName;
    }

    int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return movieName + " (" + rating + ")";
    }
}
