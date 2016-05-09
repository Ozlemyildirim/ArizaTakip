package com.project.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


import com.project.entity.Ariza;
import com.project.service.ArizaService;

@ManagedBean(name = "homeBBean")
@ViewScoped
public class HomeBBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4173686788447999111L;
	private Ariza ariza;

	ArizaService arizaService;
	List<Ariza> arizaList;
	List<Ariza> filteredList;

	@PostConstruct
	private void init() {
		System.out.println("HomeMBean construct");
		arizaService = new ArizaService();
		arizaList = arizaService.getAll();

	}

	

	public void olustur() {
		System.out.println(ariza.toString());

		if (this.ariza != null && this.ariza.getId() != null) {
			arizaService.update(ariza);
		} else {
		
		arizaService.save(ariza);
		}
		FacesMessage msg = new FacesMessage("Successful");
        FacesContext.getCurrentInstance().addMessage(null, msg);
		filteredList = arizaService.getAll();
		ariza = new Ariza();

	}

	public void sil(Long id) {
		Ariza entity = arizaService.getById(id);
		arizaService.delete(entity);
		arizaList = arizaService.getAll();
		FacesMessage msg = new FacesMessage("Silindi");
        FacesContext.getCurrentInstance().addMessage(null, msg);

	}

	public void duzenle(Long id) {
		Ariza entity = arizaService.getById(id);
		this.ariza = entity;
	}

	public void yeni() {
		this.ariza = new Ariza();
	}

	

	public Ariza getAriza() {
		if (ariza == null) {
			ariza = new Ariza();
		}
		return ariza;
	}

	public void setAriza(Ariza ariza) {
		this.ariza = ariza;
	}



	public List<Ariza> getArizaList() {
		return arizaList;
	}

	public List<Ariza> getFilteredList() {
		return filteredList;
	}

	public void setFilteredList(List<Ariza> filteredList) {
		this.filteredList = filteredList;
	}

	public void setArizaService(ArizaService arizaService) {
		this.arizaService = arizaService;
	}
	
	
	
     
	
}
