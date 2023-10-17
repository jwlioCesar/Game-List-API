package com.juliocesar.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliocesar.dslist.entities.Game;

//jpa repository facilita tudo

public interface GameRepository extends JpaRepository<Game, Long>{

}
