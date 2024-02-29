package com.youtube.jwt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class TJ_LETTRAGE {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("ID_LET")
    @Column(name = "ID_LET")
	int ID_LET;
	@JsonProperty("ID_DET_BORD_LET")
    @Column(name = "ID_DET_BORD_LET")
	int ID_DET_BORD_LET;
	@JsonProperty("ID_ENC_LET")
    @Column(name = "ID_ENC_LET")
	int ID_ENC_LET;
	@JsonProperty("MONT_TTC_LET")
    @Column(name = "MONT_TTC_LET")
	int MONT_TTC_LET;
	@JsonProperty("DAT_LET")
    @Column(name = "DAT_LET")
	@Temporal(TemporalType.DATE)
	Date DAT_LET;
	@JsonProperty("DAT_RECONCIL")
    @Column(name = "DAT_RECONCIL")
	@Temporal(TemporalType.DATE)
	Date DAT_RECONCIL;
	@JsonProperty("VALID_LET")
    @Column(name = "VALID_LET")
	int VALID_LET;
	public int getID_LET() {
		return ID_LET;
	}
	public void setID_LET(int iD_LET) {
		ID_LET = iD_LET;
	}
	public int getID_DET_BORD_LET() {
		return ID_DET_BORD_LET;
	}
	public void setID_DET_BORD_LET(int iD_DET_BORD_LET) {
		ID_DET_BORD_LET = iD_DET_BORD_LET;
	}
	public int getID_ENC_LET() {
		return ID_ENC_LET;
	}
	public void setID_ENC_LET(int iD_ENC_LET) {
		ID_ENC_LET = iD_ENC_LET;
	}
	public int getMONT_TTC_LET() {
		return MONT_TTC_LET;
	}
	public void setMONT_TTC_LET(int mONT_TTC_LET) {
		MONT_TTC_LET = mONT_TTC_LET;
	}
	public Date getDAT_LET() {
		return DAT_LET;
	}
	public void setDAT_LET(Date dAT_LET) {
		DAT_LET = dAT_LET;
	}
	public Date getDAT_RECONCIL() {
		return DAT_RECONCIL;
	}
	public void setDAT_RECONCIL(Date dAT_RECONCIL) {
		DAT_RECONCIL = dAT_RECONCIL;
	}
	public int getVALID_LET() {
		return VALID_LET;
	}
	public void setVALID_LET(int vALID_LET) {
		VALID_LET = vALID_LET;
	}
	
}
