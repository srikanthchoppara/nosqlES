package my.learning.exercise.hsearch.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.learning.exercise.hsearch.model.correlator.HistoryEvent;

@Repository
public interface FmHistoryEventRepository extends JpaRepository<HistoryEvent, String>{

}
