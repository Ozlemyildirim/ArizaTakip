package com.project.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.project.entity.ArizaCihaz;
import com.project.entity.ArizaMarka;
import com.project.entity.ArizaTip;


import com.project.service.ArizaCihazService;
import com.project.service.ArizaMarkaService;
import com.project.service.ArizaTipService;



@ManagedBean(name = "homeBean")
@ViewScoped
public class HomeMBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6735523767121544017L;
    
	ArizaTipService arizaTipService;
	ArizaMarkaService arizaMarkaService;
	ArizaCihazService arizaCihazService;
	

	private ArizaTip arizaTip;
	private ArizaMarka arizaMarka;
	private ArizaCihaz arizaCihaz;
	
	List<ArizaCihaz> arizaCihazList;
	List<ArizaMarka> arizaMarkaList;
	List<ArizaTip> arizaTipList;

	
	@PostConstruct
	private void init() {
		System.out.println("HomeMBean construct");

		arizaTipService = new ArizaTipService();
		arizaMarkaService = new ArizaMarkaService();
		arizaCihazService = new ArizaCihazService();
		
		arizaTipList= arizaTipService.getAll();
		arizaCihazList = arizaCihazService.getAll();
		arizaMarkaList = arizaMarkaService.getAll();
	}

	public void ekle() {
		System.out.println(arizaCihaz.toString());
		arizaCihazService.save(arizaCihaz);
		arizaCihazList = arizaCihazService.getAll();
		arizaCihaz = new ArizaCihaz();


	}
		

	
		


	public void olustur() {
	

		System.out.println(arizaMarka.toString());
		arizaMarkaService.save(arizaMarka);
		arizaMarkaList = arizaMarkaService.getAll();
		arizaMarka = new ArizaMarka();
	
	
	}
	
	public void yapilandir() {

		System.out.println(arizaTip.toString());
		arizaTipService.save(arizaTip);
		arizaTipList = arizaTipService.getAll();
		arizaTip = new ArizaTip();
	
	
	}
	
	
	public void sil(Long id) {
		ArizaCihaz entity = arizaCihazService.getById(id);
		arizaCihazService.delete(entity);
		arizaCihazList = arizaCihazService.getAll();
	
	}
		
	public void temizle (Long id) {
		ArizaMarka entity = arizaMarkaService.getById(id);
		arizaMarkaService.delete(entity);
		arizaMarkaList = arizaMarkaService.getAll();

	}
	
	
	
	public void clear (Long id) {
		ArizaTip entity = arizaTipService.getById(id);
		arizaTipService.delete(entity);
		arizaTipList = arizaTipService.getAll();

	}
	
	


	public ArizaCihaz getArizaCihaz() {
		if (arizaCihaz == null) {
			arizaCihaz = new ArizaCihaz();
		}
		return arizaCihaz;
	}

	public void setArizaCihaz(ArizaCihaz arizaCihaz) {
		this.arizaCihaz = arizaCihaz;
	}

	public List<ArizaCihaz> getArizaCihazList() {
		return arizaCihazList;
	}

	public ArizaMarka getArizaMarka() {
		if (arizaMarka == null) {
			arizaMarka = new ArizaMarka();
		}
		return arizaMarka;
	}

	public void setArizaMarka(ArizaMarka arizaMarka) {
		this.arizaMarka = arizaMarka;
	}

	public List<ArizaMarka> getArizaMarkaList() {
		return arizaMarkaList;
	}
	
	
	
	
	
	
	
	
	
	public ArizaTip getArizaTip() {
		if (arizaTip == null) {
			arizaTip = new ArizaTip();
		}
		return arizaTip;
	}

	public void setArizaTip(ArizaTip arizaTip) {
		this.arizaTip = arizaTip;
	}

	public List<ArizaTip> getArizaTipList() {
		return arizaTipList;
	}

	
	
	
	
	

}
