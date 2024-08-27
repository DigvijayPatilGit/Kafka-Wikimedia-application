package kafka.wikimedia.demoApp.repository;

import kafka.wikimedia.demoApp.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
