package org.leaguemanager.analytics.repository;
import org.leaguemanager.analytics.model.TeamAnalytics;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamAnalyticsRepository extends JpaRepository<TeamAnalytics, Long> {
}
