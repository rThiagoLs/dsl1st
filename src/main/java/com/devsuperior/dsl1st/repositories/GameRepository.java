package com.devsuperior.dsl1st.repositories;

import com.devsuperior.dsl1st.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
