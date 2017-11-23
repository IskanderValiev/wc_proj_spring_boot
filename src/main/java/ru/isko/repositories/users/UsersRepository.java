package ru.isko.repositories.users;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isko.models.User;

import java.util.Optional;

/**
 * Created by isko on 9/25/17.
 */
public interface UsersRepository extends JpaRepository<User, Long> {

//    String getPasswordByLogin(String login);
//    String getColumnByLogin(String columnName, String login);
//    String getLoginByEmail(String email);
//    boolean exists(String login);
//    boolean existingEmail(String email);
//    boolean isAdmin(String login);
//    void updateUsersData(String login, String changeableColumnName, String value);
//    String getLoginByPassword(String password);
//    boolean getGenderByLogin(String login);
//    Date getDateByLogin(String login);

    Optional<User> findOneByEmail(String username);

    Optional<User> findById(Long id);

    Optional<User> findByHashLink(String hashLink);
}
