package com.adi.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.adi.demo.model.alien;
public interface AlienRepo extends CrudRepository <alien, Integer> {
   
}
