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
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_name")
    private String name;

    @Column(name = "country_flag")
    private String flag;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
    private Set<Player> players;
}
