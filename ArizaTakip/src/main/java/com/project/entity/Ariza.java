package com.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "ARIZA")
public class Ariza implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4002531456751666208L;
	/**
	 * 
	 */

	private Long id;

	private String musteriadi;
	private String soyadi;
	private String tel;
	private String adres;

	private String arizalicihaz;
	private String arizalimarka;
	private String arizalibirim;

	private Date alisTarihi;
	private Date teslimTarihi;
	private Boolean teslimAlindi;

	@Id
	@SequenceGenerator(name = "SEQ_DEFECT_ID", sequenceName = "SEQ_DEFECT_ID", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DEFECT_ID")
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CUSTOMERNAME", length = 75)
	public String getmusteriadi() {
		return musteriadi;
	}

	public void setmusteriadi(String musteriadi) {
		this.musteriadi = musteriadi;
	}

	@Column(name = "SURNAME", length = 75)
	public String getsoyadi() {
		return soyadi;
	}

	public void setsoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	@Column(name = "TEL", length = 75)
	public String getTel() {
		return tel;
	}

	public void setTel(String Tel) {
		this.tel = Tel;
	}

	@Column(name = "ADDRESS", length = 75)
	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	@Column(name = "DEFECTDEVÝCE", length = 75)
	public void setArizalicihaz(String arizalicihaz) {
		this.arizalicihaz = arizalicihaz;
	}

	public String getArizalicihaz() {
		return arizalicihaz;
	}

	@Column(name = "DEFECTMARKA", length = 75)
	public String getArizalimarka() {
		return arizalimarka;
	}

	public void setArizalimarka(String arizalimarka) {
		this.arizalimarka = arizalimarka;
	}

	@Column(name = "DEFECTYPE", length = 75)
	public String getArizalibirim() {
		return arizalibirim;
	}

	public void setArizalibirim(String arizalibirim) {
		this.arizalibirim = arizalibirim;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DEFECT_DATE")
	public Date getAlisTarihi() {
		return alisTarihi;
	}

	public void setAlisTarihi(Date alisTarihi) {
		this.alisTarihi = alisTarihi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RETURN_DATE")
	public Date getTeslimTarihi() {
		return teslimTarihi;
	}

	public void setTeslimTarihi(Date teslimTarihi) {
		this.teslimTarihi = teslimTarihi;
	}

	@Type(type= "org.hibernate.type.NumericBooleanType")
	@Column(name = "IS_RETURN")
	public Boolean getTeslimAlindi() {
		return teslimAlindi;
	}

	public void setTeslimAlindi(Boolean teslimAlindi) {
		this.teslimAlindi = teslimAlindi;
	}
}
