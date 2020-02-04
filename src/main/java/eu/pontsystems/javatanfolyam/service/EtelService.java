package eu.pontsystems.javatanfolyam.service;

import eu.pontsystems.javatanfolyam.model.Etel;
import eu.pontsystems.javatanfolyam.repository.EtelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("etelservice")
public class EtelService {



        @Autowired
        private EtelRepository etelRepository;

        @Transactional
        public List<Etel> getAllEtel(){

            return etelRepository.findAll();

        }

        @Transactional
        public void addEtel(Etel etel) {
            try {
                etelRepository.save(etel);
            } catch (org.springframework.dao.DataIntegrityViolationException ex) {

            }
        }
        @Transactional
        public void del(Long id) {
            etelRepository.delete(id);
        }


        @Transactional
        public Etel getEtel(Long id){
            return etelRepository.findOne(id);
        }



}
