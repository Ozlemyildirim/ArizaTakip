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

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "ARIZA_TIP")
public class ArizaTip implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1865446533562250634L;
	private Long id;
    private String arizatipi;
    

    @Id
    @SequenceGenerator(name = "SEQ_TYPE_ID", sequenceName = "SEQ_TYPE_ID", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TYPE_ID")
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "TYPENAME", length = 100)
    public String getArizatipi() {
        return arizatipi;
    }

    public void setArizatipi(String arizatipi) {
        this.arizatipi = arizatipi;
    }


    
    
    
    
}
