package com.youtube.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "TJ_CIR")
public class TJ_CIR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CIR")
    private int idCIR;
    
    
     
     
	@JsonProperty("REF_CTR_CIR")
	@Column(name = "ref_ctr_cir")
	private int REF_CTR_CIR;

	@JsonProperty("ID_ADER_CIR")
	@Column(name = "id_ader_cir")
	private int ID_ADER_CIR;

	@JsonProperty("ID_ROLE_CIR")
	@Column(name = "id_role_cir")
	private String ID_ROLE_CIR;

	
	public int getREF_CTR_CIR() {
		return REF_CTR_CIR;
	}

	public void setREF_CTR_CIR(int rEF_CTR_CIR) {
		REF_CTR_CIR = rEF_CTR_CIR;
	}

	public int getID_ADER_CIR() {
		return ID_ADER_CIR;
	}

	public void setID_ADER_CIR(int iD_ADER_CIR) {
		ID_ADER_CIR = iD_ADER_CIR;
	}

	public int getIdCIR() {
		return idCIR;
	}

	public void setIdCIR(int idCIR) {
		this.idCIR = idCIR;
	}

	public String getID_ROLE_CIR() {
		return ID_ROLE_CIR;
	}

	public void setID_ROLE_CIR(String iD_ROLE_CIR) {
		ID_ROLE_CIR = iD_ROLE_CIR;
	}

	
 
    // Getters and setters
}