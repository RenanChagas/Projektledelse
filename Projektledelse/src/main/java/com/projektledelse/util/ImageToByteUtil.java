package com.projektledelse.util;


import com.projektledelse.service.AvatarToByteService;

public class ImageToByteUtil {
	
	public static void main(String args[]){
		
		AvatarToByteService service = new AvatarToByteService();
		service.saveImage("renan", "/Users/renanchagas/Desktop/Avatar_1.png");
		System.out.println("Imagem salva com sucesso");
		
		
	}

}