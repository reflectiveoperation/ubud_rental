package View;

import java.util.Date;

public class Rentals extends MovieRentalObject {

    private Integer rentalId;
    private Integer rentalMovieId;
    private Integer rentalCustomerId;
    private Date dateStart;
    private Date dateFinish;

    public Integer getRentalId() {
        return rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    public Integer getRentalMovieId() {
        return rentalMovieId;
    }

    public void setRentalMovieId(Integer rentalMovieId) {
        this.rentalMovieId = rentalMovieId;
    }

    public Integer getRentalCustomerId() {
        return rentalCustomerId;
    }

    public void setRentalCustomerId(Integer rentalCustomerId) {
        this.rentalCustomerId = rentalCustomerId;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }
}
