package com.youtube.jwt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
 

@Entity
@Table(name="T_ENCAISSEMENT")
public class Encaissement {
	@Id
	@JsonProperty("ID_ENC")
    @Column(name = "id_enc")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int ID_ENC;
	@JsonProperty("REF_CTR_ENC")
    @Column(name = "ref_ctr_enc")
	String REF_CTR_ENC;
	@JsonProperty("REF_ADH_ENC")
    @Column(name = "ref_adh_enc")
	String REF_ADH_ENC;
	@JsonProperty("REF_ACH_ENC")
    @Column(name = "ref_ach_enc")
	String REF_ACH_ENC;
	@JsonProperty("MONT_ENC")
    @Column(name = "mont_enc")
	double MONT_ENC;
	@JsonProperty("DEVISE_ENC")
    @Column(name = "devise_enc")
	String DEVISE_ENC;
	@JsonProperty("TYP_ENC")
    @Column(name = "typ_enc")
	String TYP_ENC;
	@JsonProperty("VALIDE_ENC")
    @Column(name = "valide_enc")
	byte VALIDE_ENC;
	@JsonProperty("RIB_ENC")
    @Column(name = "rib_enc")
	String RIB_ENC;
	 
	  
	 
	public int getID_ENC() {
		return ID_ENC;
	}
	public void setID_ENC(int iD_ENC) {
		ID_ENC = iD_ENC;
	}
	 
	public String getREF_CTR_ENC() {
		return REF_CTR_ENC;
	}
	public void setREF_CTR_ENC(String rEF_CTR_ENC) {
		REF_CTR_ENC = rEF_CTR_ENC;
	}
	public String getREF_ADH_ENC() {
		return REF_ADH_ENC;
	}
	public void setREF_ADH_ENC(String rEF_ADH_ENC) {
		REF_ADH_ENC = rEF_ADH_ENC;
	}
	 
	public String getREF_ACH_ENC() {
		return REF_ACH_ENC;
	}
	public void setREF_ACH_ENC(String rEF_ACH_ENC) {
		REF_ACH_ENC = rEF_ACH_ENC;
	}
	public double getMONT_ENC() {
		return MONT_ENC;
	}
	public void setMONT_ENC(double mONT_ENC) {
		MONT_ENC = mONT_ENC;
	}
	public String getDEVISE_ENC() {
		return DEVISE_ENC;
	}
	public void setDEVISE_ENC(String dEVISE_ENC) {
		DEVISE_ENC = dEVISE_ENC;
	}
	public String getTYP_ENC() {
		return TYP_ENC;
	}
	public void setTYP_ENC(String tYP_ENC) {
		TYP_ENC = tYP_ENC;
	}
	public byte getVALIDE_ENC() {
		return VALIDE_ENC;
	}
	public void setVALIDE_ENC(byte vALIDE_ENC) {
		VALIDE_ENC = vALIDE_ENC;
	}
	public String getRIB_ENC() {
		return RIB_ENC;
	}
	public void setRIB_ENC(String rIB_ENC) {
		RIB_ENC = rIB_ENC;
	}
	 
	    
	 
	
}
