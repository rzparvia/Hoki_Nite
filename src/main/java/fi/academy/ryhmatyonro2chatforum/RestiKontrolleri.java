package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RestiKontrolleri {
    private UserRepo userRepo;
    private MessageRepo messageRepo;
    private SectionRepo sectionRepo;
    private TopicRepo topicRepo;

    @Autowired
    RestiKontrolleri(UserRepo userRepo, MessageRepo messageRepo, SectionRepo sectionRepo, TopicRepo topicRepo) {
        this.userRepo = userRepo;
        this.messageRepo = messageRepo;
        this.sectionRepo = sectionRepo;
        this.topicRepo = topicRepo;
    }

    @GetMapping("/all")
    Iterable<Messages> all() {
        return messageRepo.findAll();
    }
}