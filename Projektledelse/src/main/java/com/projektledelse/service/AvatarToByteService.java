package com.projektledelse.service;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projektledelse.dao.UserDao;
import com.projektledelse.model.User;

@Service("AvatarToByteService")
@Transactional
public class AvatarToByteService{
	
	@Autowired
	private UserDao dao;
	
	public void saveImage(String sso, String image){
	
		
		//save image into database
		File file = new File(image);
	    byte[] bFile = new byte[(int) file.length()];
	    
	    try {
	     FileInputStream fileInputStream = new FileInputStream(file);
	     //convert file into array of bytes
	     fileInputStream.read(bFile);
	     fileInputStream.close();
	    } catch (Exception e) {
	     e.printStackTrace();
	    }
	    
	    User avatar = new User();
	    
	    avatar = dao.findBySSO(sso);
	    
        avatar.setImage(bFile);
        
        dao.save(avatar);
        
		
	} //Fim do método saveImage
	
	
}