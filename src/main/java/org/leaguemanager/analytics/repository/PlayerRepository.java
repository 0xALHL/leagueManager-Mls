package org.leaguemanager.analytics.repository;
import org.leaguemanager.analytics.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
// This repo is set up for crud