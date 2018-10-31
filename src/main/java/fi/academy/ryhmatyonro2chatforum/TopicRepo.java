package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TopicRepo extends JpaRepository<Topics, String> {
    List<Topics> findAllById(Integer id);
    List<Topics> removeAllById(int id);
}
