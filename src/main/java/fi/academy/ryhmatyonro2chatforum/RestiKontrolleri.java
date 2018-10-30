package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class RestiKontrolleri {
    private UserRepo userRepo;
    private MessageRepo messageRepo;
    private SectionRepo sectionRepo;
    private TopicRepo topicRepo;

    @Autowired
    public RestiKontrolleri(UserRepo userRepo, MessageRepo messageRepo, SectionRepo sectionRepo, TopicRepo topicRepo) {
        this.userRepo = userRepo;
        this.messageRepo = messageRepo;
        this.sectionRepo = sectionRepo;
        this.topicRepo = topicRepo;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Iterable<Messages> kaikkiViestit() {
        return messageRepo.findAll();
    }
}