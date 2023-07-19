package edu.jsp.aeroplane_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.aeroplane_app.dto.Aeroplane;

public interface AeroplaneRepository extends JpaRepository<Aeroplane, Integer>{

}
