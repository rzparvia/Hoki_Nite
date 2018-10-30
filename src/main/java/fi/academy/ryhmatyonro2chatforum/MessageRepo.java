package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Messages;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageRepo extends PagingAndSortingRepository<Messages, String> {
}
