package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        var result =  repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        var result =  repository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id){
        var result =  repository.searchByList(id);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
