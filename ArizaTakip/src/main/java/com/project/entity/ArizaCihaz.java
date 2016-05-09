
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
@Table(name = "ARIZA_CIHAZ")
public class ArizaCihaz implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4003502045108597796L;
	private Long id;
    private String cihazadi;

    @Id
    @SequenceGenerator(name = "SEQ_DEVICE_ID", sequenceName = "SEQ_DEVICE_ID", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DEVICE_ID")
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "DEVICENAME", length = 100)
    public String getCihazadi() {
        return cihazadi;
    }

    public void setCihazadi(String cihazadi) {
        this.cihazadi = cihazadi;
    }


}
