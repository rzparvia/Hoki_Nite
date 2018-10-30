package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Topics;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TopicRepo extends PagingAndSortingRepository<Topics, String> {
}
