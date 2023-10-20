package com.juliocesar.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;import com.juliocesar.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
