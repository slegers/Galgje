package domain.db;

/**
 * Created by yanice on 07/06/2017.
 */
public class Database
{
    private static Database ourInstance = new Database();

    public static Database getInstance() {
        return ourInstance;
    }

    private Database() {
    }
}
