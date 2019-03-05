package View;

public class MovieTypes extends MovieRentalObject {

    private Integer movieTypeId;
    private Integer movieType;
    private Double movieCost;

    public Integer getMovieTypeId() {
        return movieTypeId;
    }

    public void setMovieTypeId(Integer movieTypeId) {
        this.movieTypeId = movieTypeId;
    }

    public Integer getMovieType() {
        return movieType;
    }

    public void setMovieType(Integer movieType) {
        this.movieType = movieType;
    }

    public Double getMovieCost() {
        return movieCost;
    }

    public void setMovieCost(Double movieCost) {
        this.movieCost = movieCost;
    }
}
