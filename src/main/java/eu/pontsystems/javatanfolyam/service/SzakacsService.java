package eu.pontsystems.javatanfolyam.service;

import eu.pontsystems.javatanfolyam.model.Szakacs;
import eu.pontsystems.javatanfolyam.repository.SzakacsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("szakacsservice")
public class SzakacsService {

        @Autowired
        private SzakacsRepository szakacsRepository;

        @Transactional
        public List<Szakacs> getAllSzakacs(){

            return szakacsRepository.findAll();

        }

        @Transactional
        public void addSzakacs(Szakacs szakacs) {
            try {
                szakacsRepository.save(szakacs);
            } catch (org.springframework.dao.DataIntegrityViolationException ex) {

            }
        }
        @Transactional
        public void del(Long id) {
            szakacsRepository.delete(id);
        }


        @Transactional
        public Szakacs getSzakacs(Long id){
            return szakacsRepository.findOne(id);
        }


    }
