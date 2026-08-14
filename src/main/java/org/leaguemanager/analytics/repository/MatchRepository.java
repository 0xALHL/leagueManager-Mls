package org.leaguemanager.analytics.repository;
import org.leaguemanager.analytics.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MatchRepository extends JpaRepository <Match, Long> {

    // CRUD features
}
