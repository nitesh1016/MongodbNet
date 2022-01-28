package com.netflix.api.service;

import com.netflix.api.entity.Cast;
import com.netflix.api.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CastService {

    @Autowired
    private CastRepository castRepository;

    public String postactorandactressList(Cast cast) {
        castRepository.save(cast);
        return "Added profile of " + cast.getName();
    }

    public List<Cast> getactorandactressList() {
        return castRepository.findAll();
    }

    public String putactorandactress(Cast cast, Long id) {
        Optional<Cast> optional = castRepository.findById(id);
        if (optional.isPresent()) {
            optional.get().setName(cast.getName());
            optional.get().setSocialmedia(cast.getSocialmedia());
            optional.get().setImdblink(cast.getImdblink());
            optional.get().setAbout(cast.getAbout());
            castRepository.save(optional.get());
            return "User profile Updated";
        } else {
            return "User profile not Updated";
        }
    }

    public String deleteactorandactressList(Long id) {
        Optional<Cast> optional = castRepository.findById(id);
        if (optional.isPresent()) {
            castRepository.deleteById(id);
            return "User deleted Successfully";
        } else {
            return "User not found";
        }
    }
}
