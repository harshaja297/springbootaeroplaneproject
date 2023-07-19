package edu.jsp.aeroplane_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import edu.jsp.aeroplane_app.dao.AeroplaneDao;
import edu.jsp.aeroplane_app.dto.Aeroplane;
import edu.jsp.aeroplane_app.util.ResponseStructure;

@Service
public class AeroplaneService {//business logix

	@Autowired
	AeroplaneDao aeroplaneDao;
	
	public ResponseStructure<Aeroplane> saveAeroplane(Aeroplane aeroplane){
		ResponseStructure <Aeroplane>rs = new ResponseStructure<>();	
		Aeroplane a = aeroplaneDao.saveAeroplane(aeroplane); 		
		rs.setStatus(HttpStatus.CREATED.value());
		rs.setMessage("Details have been Saved Successfully");
		rs.setData(a);
		
		return rs;
	}
	
	public ResponseStructure<List<Aeroplane>> getAllDetails() {
		ResponseStructure <List<Aeroplane>> rs = new ResponseStructure<>();	
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("Data received Successfully");
		rs.setData(aeroplaneDao.getAllDetails());
		return rs;
	}
	
	public ResponseStructure<Aeroplane> deleteById(int id){
		ResponseStructure<Aeroplane> rs = new ResponseStructure<>();	
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("Deleted");
		rs.setData(aeroplaneDao.deleteById(id));		
		return rs;
		
	}
	
	public ResponseStructure<Aeroplane> updateAeroplane(Aeroplane aeroplane , int id) {
		Aeroplane a = aeroplaneDao.getById(id);
		
		if(a != null) {
			aeroplane.setId(id);
			ResponseStructure<Aeroplane> rs = new ResponseStructure<>();
			
			rs.setStatus(HttpStatus.OK.value());
			rs.setMessage("updated Successfully");
			rs.setData(aeroplaneDao.updateAeroplane(aeroplane));
			
			return rs;
		}
		
		else {
			return null;
		}
	}
	
	
}
