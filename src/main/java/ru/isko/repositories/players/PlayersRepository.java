package ru.isko.repositories.players;


;import org.springframework.data.jpa.repository.JpaRepository;
import ru.isko.models.Player;

public interface PlayersRepository extends JpaRepository<Player, Long> {
//    List<Player> findAllByClub(Integer clubId);
//    List<Player> findAllByCountry(Integer countryId);
//    String getClub(Player player);
//    String getColumnByName(String columnName, String name);
}
