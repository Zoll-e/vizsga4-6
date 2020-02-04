package eu.pontsystems.javatanfolyam.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Table(name = "etelek")
public class Etel implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "etel_neve")
        private String etelNeve;

        @Column(name = "elkeszitesi_ido")
        private Integer elkeszitesiIdo;

        public Etel() {
        }

        public Etel(Long id, String etelNeve, Integer elkeszitesiIdo) {
                this.id = id;
                this.etelNeve = etelNeve;
                this.elkeszitesiIdo = elkeszitesiIdo;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getEtelNeve() {
                return etelNeve;
        }

        public void setEtelNeve(String etelNeve) {
                this.etelNeve = etelNeve;
        }

        public Integer getElkeszitesiIdo() {
                return elkeszitesiIdo;
        }

        public void setElkeszitesiIdo(Integer elkeszitesiIdo) {
                this.elkeszitesiIdo = elkeszitesiIdo;
        }

        @Override
        public String toString() {
                return "Etel{" +
                        "id=" + id +
                        ", etelNeve='" + etelNeve + '\'' +
                        ", elkeszitesiIdo=" + elkeszitesiIdo +
                        '}';
        }
}
