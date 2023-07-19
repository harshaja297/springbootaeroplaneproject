package edu.jsp.aeroplane_app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.aeroplane_app.dao.AeroplaneDao;
import edu.jsp.aeroplane_app.dto.Aeroplane;
import edu.jsp.aeroplane_app.service.AeroplaneService;
import edu.jsp.aeroplane_app.util.ResponseStructure;

@RestController
public class AeroplaneController {

//	@Autowired
//	AeroplaneDao aeroplaneDao;
	
	@Autowired
	AeroplaneService aeroplaneService;
	
	@RequestMapping(method = RequestMethod.POST , path = "/saveaeroplane")
	public ResponseStructure<Aeroplane> saveAeroplane(@RequestBody Aeroplane aeroplane) {
//		return aeroplaneDao.saveAeroplane(aeroplane);
		return aeroplaneService.saveAeroplane(aeroplane);
	}
	
//	@RequestMapping(method = RequestMethod.POST , path = "/saveplane")
//	public String saveplane(@RequestBody Aeroplane aeroplane) {
//		return aeroplaneDao.savePlane(aeroplane);
//	}
	
	@RequestMapping("getall")
	public ResponseStructure<List<Aeroplane>> getAllDetails(){
		return aeroplaneService.getAllDetails();
	}
	@DeleteMapping("deletebyid")
	public ResponseStructure<Aeroplane> deleteById(@RequestParam int id){
		return aeroplaneService.deleteById(id);
	}
	@PutMapping("updateaeroplane/{id}")
	public ResponseStructure<Aeroplane> updateAeroplane(@RequestBody Aeroplane  aeroplane ,@PathVariable int id){
		return aeroplaneService.updateAeroplane(aeroplane, id);
	}
}
