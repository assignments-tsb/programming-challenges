package info.startupbuilder.programmingchallenges.infrastructure;

import info.startupbuilder.programmingchallenges.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
}
