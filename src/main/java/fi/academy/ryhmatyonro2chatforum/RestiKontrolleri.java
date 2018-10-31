package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Messages;
import fi.academy.ryhmatyonro2chatforum.entities.Topics;
import fi.academy.ryhmatyonro2chatforum.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
class RestiKontrolleri {
    private UserRepo userRepo;
    private MessageRepo messageRepo;

    private TopicRepo topicRepo;

    @Autowired
    RestiKontrolleri(UserRepo userRepo, MessageRepo messageRepo, TopicRepo topicRepo) {
        this.userRepo = userRepo;
        this.messageRepo = messageRepo;
        this.topicRepo = topicRepo;
    }

    @GetMapping("/viestit")
    public List<Messages> all() {
        return messageRepo.findAll();
    }
    @GetMapping("/topicit")
    public List<Topics> kaikki() {
        return topicRepo.findAll();
    }


}