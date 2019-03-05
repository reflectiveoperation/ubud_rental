package Controller;

import Model.JdbcConnection;
import View.Movies;
import View.SetMainStage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JdbcConnection jdbcConnection = new JdbcConnection();

        SetMainStage setMainStage = new SetMainStage();
        setMainStage.stageWelcomeScreen();

        Scanner scanner = new Scanner(System.in);
        Integer userSelection = scanner.nextInt();
        captureUserSelectionAndProceedToStep(userSelection, jdbcConnection);
    }

    private static void displayMovieAvailability(JdbcConnection jdbcConnection) {
        jdbcConnection.establishConnectionWithDatabase();
        String tempSqlQuery = "SELECT movies.m_title FROM movies LEFT JOIN rentals ON (movies.m_id = rentals.r_m_id) " +
                "WHERE rentals.r_m_id IS NULL;";
        System.out.println("Current Movies Available: ");
        System.out.println();
        jdbcConnection.extractDataFromResultSet(jdbcConnection.executeSqlQuery(tempSqlQuery), new Movies(),
                "m_title");
    }

    private static void captureUserSelectionAndProceedToStep (Integer userSelection, JdbcConnection jdbcConnection) {
        switch (userSelection) {
            case 0:
                System.out.println("Exiting Ubud Rental Store");
                break;
            case 1:
                System.out.println("--------------------------");
                System.out.println("Loading...");
                System.out.println("--------------------------");
                Main.displayMovieAvailability(jdbcConnection);
                System.out.println();
                break;
        }
    }
}
