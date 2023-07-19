package edu.jsp.aeroplane_app.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.aeroplane_app.dto.Aeroplane;
import edu.jsp.aeroplane_app.repository.AeroplaneRepository;
@Repository
public class AeroplaneDao {//database Logix

	@Autowired
	AeroplaneRepository aeroplaneRepository;
	
	
	public Aeroplane saveAeroplane(Aeroplane aeroplane) {
		return aeroplaneRepository.save(aeroplane); 
	}
	
	public String savePlane(Aeroplane aeroplane) {
		return aeroplane+""; 
	}
	
	public List<Aeroplane>getAllDetails(){
		
		return aeroplaneRepository.findAll();
	}
	
	public Aeroplane deleteById(int id) {
		aeroplaneRepository.deleteById(id);	
		return	aeroplaneRepository.findById(id).get();	
	}
	
	public Aeroplane getById(int id) {
		return	aeroplaneRepository.findById(id).get();
	}
	
	public Aeroplane updateAeroplane(Aeroplane aeroplane) {
		return aeroplaneRepository.save(aeroplane);
	}
}
