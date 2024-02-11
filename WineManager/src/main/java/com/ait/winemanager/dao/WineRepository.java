package com.ait.winemanager.dao;

import com.ait.winemanager.dto.Wine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WineRepository extends CrudRepository<Wine, Long>
{


}