package fi.academy.ryhmatyonro2chatforum.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Topic {
    @Id
    private Integer id;
    private Integer idUser;
    private Integer idSections;
    private String title;
    private String content;
    private Date creationdate;

    @OneToMany(mappedBy = "topic") //tarkastettu
    private List<Message> msglist = new ArrayList<>();

    @ManyToOne //tarkastettu
    @JoinColumn(name = "id_sections")
    private Section section;

    @ManyToOne //tarkastettu
    @JoinColumn(name = "id_user")
    private User user;

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public List<Message> getMsglist() {
        return msglist;
    }

    public void setMsglist(List<Message> msglist) {
        this.msglist = msglist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdSections() {
        return idSections;
    }

    public void setIdSections(Integer idSections) {
        this.idSections = idSections;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }
}
