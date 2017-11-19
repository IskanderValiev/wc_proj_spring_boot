package ru.isko.repositories.clubs;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.isko.models.Club;

public interface ClubsRepository extends JpaRepository<Club, Long> {
}
