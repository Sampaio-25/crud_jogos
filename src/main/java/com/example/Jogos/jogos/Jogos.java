package com.example.Jogos.jogos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "jogos")
@Entity(name = "jogos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Jogos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;

    public Long id() {
        return id;
    }

    public String title() {
        return title;
    }

    public String image() {
        return image;
    }

    public Jogos(JogoRequestDTO data){

        this.title = data.title();
        this.image = data.image();

    }
}
