package example;

import com.j256.ormlite.dao.Dao;
import template.IModel;
import template.Persistence;

import java.sql.SQLException;
import java.util.List;

public class UsersHandler extends Persistence {
    private static UsersHandler _handler;
    private Dao<IModel, String> _accessObject;

    private UsersHandler() throws SQLException {
        _accessObject = getAccessObject(User.class);
    }

    public static UsersHandler getInstance() throws SQLException {
        if(_handler == null) _handler = new UsersHandler();
        return _handler;
    }

    @Override
    public void create(IModel model) throws SQLException {
        User user = (User) model;
        _accessObject.create(user);
    }

    @Override
    public List<IModel> retrieveAll() throws SQLException {
        return _accessObject.queryBuilder().query();
    }

    @Override
    public void update(IModel model) throws SQLException { }

    @Override
    public void delete(IModel model) throws SQLException { }

    public User getUser(String username) throws SQLException {
        List<IModel> m = _accessObject.queryBuilder().where().eq("username", username).query();
        return m.size() > 0 ? (User) m.get(0) : null;
    }
}
