package com.adi.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.adi.demo.model.Alien;

public interface Alienrepo extends CrudRepository<Alien,Integer>
{

	char[] findByTech(String tech);
   List <Alien> findbyAidGreaterThan(int aid);
   char[] findByAidGreaterThan(int aid);
   
   @Query("from Alien where tech =?1 order by aname")
   List<Alien>findByTechSorted(String tech);

}
