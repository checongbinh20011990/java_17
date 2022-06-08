package com.cybersoft.movie_clix.repository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.cybersoft.movie_clix.entity.DTPhim;
import com.cybersoft.movie_clix.entity.Phim;

@Repository
@Transactional
public interface PhimRepository extends JpaRepository<Phim, Long> {
	
	@Procedure(procedureName = "GetAllPhim")
	List<Phim> getAllPhim();
	
	@Procedure(procedureName = "GetAllPhimWithId")
	List<DTPhim> getAllPhimById(Long id);
	
}
