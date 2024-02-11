package com.ait.winemanager.controllers;

import com.ait.winemanager.dao.WineRepository;
import com.ait.winemanager.dto.Wine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Service
public class WineService
{

    @Autowired
    WineRepository wineRepo;

    @RequestMapping("/wines/{id}")
    Optional<Wine> getProduct(@PathVariable("id") Long id)
    {
        return wineRepo.findById(id);
    }

}

