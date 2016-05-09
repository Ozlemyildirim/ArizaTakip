/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "ARIZA_MARKA")
public class ArizaMarka implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8796188079782569912L;
	private Long id;
    private String ad;

    @Id
    @SequenceGenerator(name = "SEQ_MARKA_ID", sequenceName = "SEQ_MARKA_ID", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MARKA_ID")
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "MARKANAME", length = 100)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }


}
