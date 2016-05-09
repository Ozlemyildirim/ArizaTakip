package com.project.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.project.entity.Kullanici;
import com.project.service.KullaniciService;


@ManagedBean (name="homeVBean")
@ViewScoped
public class HomeVBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5517311481517958021L;

	
	private String mesaj;
	private Kullanici kullanici;
	KullaniciService kullaniciService;
	
	@PostConstruct
	private void init (){
		System.out.println("HomeMBean construct");

		kullaniciService = new KullaniciService();

	}
	
	public void ekle() {
		System.out.println(kullanici.toString());
		kullaniciService.save(kullanici);
 		mesaj="Kullanýcý kaydedildi.";
		kullanici = new Kullanici();
	}
	
	
	
	public Kullanici getKullanici() {
		if (kullanici == null) {
			kullanici = new Kullanici();
		}
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}
	

	public String getMesaj() {
		return mesaj;
	}
	
	
	
	
}
