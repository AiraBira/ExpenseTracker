import com.airabira.expensetracker.database.DatabaseManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();

        try {
            databaseManager.ouvrirConnection();
            System.out.println("Connexion réussie !");

            databaseManager.fermerConnection();
            System.out.println("Connexion fermée !");
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
    }
}