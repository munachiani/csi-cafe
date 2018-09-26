package csicafe.model.dao;

import java.util.List;

import csicafe.model.User;

public interface UserDao {

    User getUser( Long id );

    List<User> getUsers();

    User saveUser( User user );

}