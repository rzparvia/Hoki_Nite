package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Sections;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SectionRepo extends PagingAndSortingRepository<Sections, String> {
}
