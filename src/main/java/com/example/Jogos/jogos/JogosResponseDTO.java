package com.example.Jogos.jogos;

public record JogosResponseDTO(Long id, String title, String image) {

    public JogosResponseDTO(Jogos jogos) {
        this(jogos.id(), jogos.title(), jogos.image());
    }
}
