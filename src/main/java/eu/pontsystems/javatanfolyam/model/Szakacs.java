package eu.pontsystems.javatanfolyam.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "szakacsok")
public class Szakacs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "neve")
    private String neve;

    @Column(name = "cime")
    private String cime;

    @Column(name = "email_cime")
    private String email_cim;

    public Szakacs() {
    }

    public Szakacs(Long id, String neve, String cime, String email_cim) {
        this.id = id;
        this.neve = neve;
        this.cime = cime;
        this.email_cim = email_cim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    public String getCime() {
        return cime;
    }

    public void setCime(String cime) {
        this.cime = cime;
    }

    public String getEmail_cim() {
        return email_cim;
    }

    public void setEmail_cim(String email_cim) {
        this.email_cim = email_cim;
    }

    @Override
    public String toString() {
        return "Szakacs{" +
                "id=" + id +
                ", neve='" + neve + '\'' +
                ", cime='" + cime + '\'' +
                ", email_cim='" + email_cim + '\'' +
                '}';
    }
}


