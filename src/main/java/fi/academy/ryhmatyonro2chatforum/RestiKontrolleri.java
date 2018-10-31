package fi.academy.ryhmatyonro2chatforum;

import fi.academy.ryhmatyonro2chatforum.entities.Messages;
import fi.academy.ryhmatyonro2chatforum.entities.Topics;
import fi.academy.ryhmatyonro2chatforum.entities.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
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

    @GetMapping("/viestit/{id}")
    public List<Messages> haeIdlla(@PathVariable("id") int id) {
        return messageRepo.findAllById(id);
    }

    @GetMapping("/topicit")
    public List<Topics> kaikki() {
        return topicRepo.findAll();
    }

    @GetMapping("/topicit/{id}")
    public List<Topics> haeIdllaTopic(@PathVariable("id") int id) {
        return topicRepo.findAllById(id);
    }

    @GetMapping("/userit")
    public List<Users> kaikkiUserit() {
        return userRepo.findAll();
    }
    @PostMapping("/luoUser")
    public Users luoUusi(@Valid @RequestBody Users user) {
        return userRepo.save(user);
    }
    @PostMapping("/luouusiviesti")
    public Messages luoUusiViesti(@Valid @RequestBody Messages message) {
        return messageRepo.save(message);
    }
    @PostMapping("/luouusitopic")
    public Topics luoUusiTopic(@Valid @RequestBody Topics topics) {
        return topicRepo.save(topics);
    }

    @DeleteMapping("/viestit/{id}")
    @Transactional
    public List<Messages> poistaIdlla(@PathVariable("id") int id) {
        return messageRepo.removeAllById(id);
    }

    @DeleteMapping("/topicit/{id}")
    @Transactional
    public List<Topics> poistaTopicIdlla(@PathVariable("id") int id) {
        return topicRepo.removeAllById(id);
    }

}