package com.project.util;

import com.project.entity.Kullanici;
import com.project.service.KullaniciService;

public class Hiberr {
	public static void main(String[] args) {
		System.out.println("merhaba");

		KullaniciService kullaniciService = new KullaniciService();
		Kullanici kullanici = new Kullanici();
		kullanici.setUsername("oz");
		kullanici.setPassword("rhdr");

		kullaniciService.save(kullanici);

		System.out.println("kullanici kaydedildi");

	}

}