package example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user1 = new User("Someone");
        User user2 = new User("Another one");
        User user3 = new User("Somebody");
        User user4 = new User("And another body");

        UsersHandler.getInstance().create(user1);
        UsersHandler.getInstance().create(user2);
        UsersHandler.getInstance().create(user3);
        UsersHandler.getInstance().create(user4);

        System.out.println(UsersHandler.getInstance().getUser("Somebody"));
    }
}
