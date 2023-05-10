package com.aerojosue.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aerojosue.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {


}
