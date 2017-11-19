package ru.isko.models;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "club_name")
    private String name;

    @Column(name = "club_country_id")
    private int country;

    @Column(name = "club_logo")
    private String logo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "club")
    private Set<Player> players;
}
