package com.projektledelse.service;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projektledelse.dao.UserDao;
import com.projektledelse.model.User;

@Service("UserService")
@Transactional
public class UserService{

	@Autowired
	private UserDao dao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public void save(User user){
		
	//	if (user.getImage().toString() != null){
		
			//save image into database
			File file = new File("/Users/renanchagas/Desktop/Avatar_1.png");
			byte[] bFile = new byte[(int) file.length()];
			System.out.println("USER AVATAR" +user.getAvatarDesc());
				
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				//convert file into array of bytes
				fileInputStream.read(bFile);
				fileInputStream.close();
				} 
			catch (Exception e) {
				e.printStackTrace();
			}
			user.setImage(bFile);
	//	}
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		dao.save(user);
	}
	
	public User findById(int id) {
		return dao.findById(id);
	}

	public User findBySso(String sso) {
		return dao.findBySSO(sso);
	}
	
}
