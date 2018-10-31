package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepo extends JpaRepository<Users, String> {
}
