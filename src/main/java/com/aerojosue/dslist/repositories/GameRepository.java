package com.aerojosue.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aerojosue.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	

}
