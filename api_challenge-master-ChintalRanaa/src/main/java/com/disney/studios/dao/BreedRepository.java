package com.disney.studios.dao;

import org.springframework.data.repository.CrudRepository;
import com.disney.studios.domain.Breed;

import java.util.List;

/**
 * This Repo is for breed information.
 */
public interface BreedRepository extends CrudRepository<Breed, Long> {

    public List<Breed> findAllByOrderByNameAsc();
}