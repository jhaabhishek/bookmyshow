package com.bookmyshow.bangalore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.bangalore.entity.Movies;


@Repository
public interface MovieRepository extends JpaRepository<Movies, Long> {

}
