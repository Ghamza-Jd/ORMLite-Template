package example;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import template.IModel;

@DatabaseTable(tableName = "user")
public class User implements IModel {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String username;

    public User() { /* keep an empty constructor for ormlite reflection */ }

    public User(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
