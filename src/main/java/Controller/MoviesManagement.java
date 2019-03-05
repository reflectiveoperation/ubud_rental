package Controller;

public class MoviesManagement {

    public String listAvailableMoviesSql() {
        return "SELECT movies.m_title FROM movies LEFT JOIN rentals ON (movies.m_id = rentals.r_m_id) " +
                "WHERE rentals.r_m_id IS NULL;";
    }
}
