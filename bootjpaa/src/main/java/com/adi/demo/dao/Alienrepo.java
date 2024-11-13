package com.adi.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.adi.demo.model.Alien;

public interface Alienrepo extends CrudRepository<Alien,Integer>
{

}
