package com.cybersoft.cineflix_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybersoft.cineflix_api.entity.Phim;

@Repository
public interface PhimRepository extends JpaRepository<Phim, Long> {

}
