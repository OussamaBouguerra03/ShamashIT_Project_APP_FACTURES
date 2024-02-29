package com.youtube.jwt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="T_INDIVIDU")
public class Individus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("REF_IND")
    @Column(name = "ref_ind")
	int REF_IND;
	
	@JsonProperty("NATIONALITE_IND")
    @Column(name = "nationalite_ind")
	String NATIONALITE_IND;
	@JsonProperty("LANGUE_IND")
    @Column(name = "langue_ind")
	String LANGUE_IND;
	@JsonProperty("NOM_IND")
    @Column(name = "nom_ind")
	String NOM_IND;
	@JsonProperty("PRENOM_IND")
    @Column(name = "prenom_ind")
	String PRENOM_IND;
	@JsonProperty("LOGIN_IND")
    @Column(name = "login_ind")
	String LOGIN_IND;
	@JsonProperty("PASS_IND")
    @Column(name = "pass_ind")
	String PASS_IND;
	@JsonProperty("PROFESSION_IND")
    @Column(name = "profession_ind")
	String PROFESSION_IND;
	@JsonProperty("DAT_NAISSANCE")
    @Column(name = "dat_naissance")
	@Temporal(TemporalType.DATE)
	Date DAT_NAISSANCE;
	@JsonProperty("DAT_PIECE")
    @Column(name = "dat_piece")
	@Temporal(TemporalType.DATE)
	Date DAT_PIECE;
	@JsonProperty("PIECE_IND")
    @Column(name = "piece_ind")
	String PIECE_IND;
	@JsonProperty("LIEU_PIECE_IND")
    @Column(name = "lieu_piece_ind")
	String LIEU_PIECE_IND;
	@JsonProperty("NUM_PIECE_IND")
	@Column(name = "num_piece_ind", unique = true)
	int NUM_PIECE_IND;
	
	@JsonProperty("VILLE_IND")
    @Column(name = "ville_ind")
	String VILLE_IND;
	@JsonProperty("TEL_IND")
    @Column(name = "tel_ind")
	int TEL_IND;
	@JsonProperty("EMAIL_IND")
    @Column(name = "email_ind")
	String EMAIL_IND;
	@JsonProperty("FAX_IND")
    @Column(name = "fax_ind")
	int FAX_IND;
	 
	public int getREF_IND() {
		return REF_IND;
	}
	public void setREF_IND(int rEF_IND) {
		REF_IND = rEF_IND;
	}
	 
	public String getNATIONALITE_IND() {
		return NATIONALITE_IND;
	}
	public void setNATIONALITE_IND(String nATIONALITE_IND) {
		NATIONALITE_IND = nATIONALITE_IND;
	}
	public String getLANGUE_IND() {
		return LANGUE_IND;
	}
	public void setLANGUE_IND(String lANGUE_IND) {
		LANGUE_IND = lANGUE_IND;
	}
	public String getNOM_IND() {
		return NOM_IND;
	}
	public void setNOM_IND(String nOM_IND) {
		NOM_IND = nOM_IND;
	}
	public String getPRENOM_IND() {
		return PRENOM_IND;
	}
	public void setPRENOM_IND(String pRENOM_IND) {
		PRENOM_IND = pRENOM_IND;
	}
	public String getLOGIN_IND() {
		return LOGIN_IND;
	}
	public void setLOGIN_IND(String lOGIN_IND) {
		LOGIN_IND = lOGIN_IND;
	}
	public String getPASS_IND() {
		return PASS_IND;
	}
	public void setPASS_IND(String pASS_IND) {
		PASS_IND = pASS_IND;
	}
	public String getPROFESSION_IND() {
		return PROFESSION_IND;
	}
	public void setPROFESSION_IND(String pROFESSION_IND) {
		PROFESSION_IND = pROFESSION_IND;
	}
	public Date getDAT_NAISSANCE() {
		return DAT_NAISSANCE;
	}
	public void setDAT_NAISSANCE(Date dAT_NAISSANCE) {
		DAT_NAISSANCE = dAT_NAISSANCE;
	}
	public Date getDAT_PIECE() {
		return DAT_PIECE;
	}
	public void setDAT_PIECE(Date dAT_PIECE) {
		DAT_PIECE = dAT_PIECE;
	}
	public String getPIECE_IND() {
		return PIECE_IND;
	}
	public void setPIECE_IND(String pIECE_IND) {
		PIECE_IND = pIECE_IND;
	}
	 
	public String getLIEU_PIECE_IND() {
		return LIEU_PIECE_IND;
	}
	public void setLIEU_PIECE_IND(String lIEU_PIECE_IND) {
		LIEU_PIECE_IND = lIEU_PIECE_IND;
	}
	

	public int getNUM_PIECE_IND() {
		return NUM_PIECE_IND;
	}
	public void setNUM_PIECE_IND(int nUM_PIECE_IND) {
		NUM_PIECE_IND = nUM_PIECE_IND;
	}

	public String getVILLE_IND() {
		return VILLE_IND;
	}
	public void setVILLE_IND(String vILLE_IND) {
		VILLE_IND = vILLE_IND;
	}
	
	public int getTEL_IND() {
		return TEL_IND;
	}
	public void setTEL_IND(int tEL_IND) {
		TEL_IND = tEL_IND;
	}
	public String getEMAIL_IND() {
		return EMAIL_IND;
	}
	public void setEMAIL_IND(String eMAIL_IND) {
		EMAIL_IND = eMAIL_IND;
	}
	public int getFAX_IND() {
		return FAX_IND;
	}
	public void setFAX_IND(int fAX_IND) {
		FAX_IND = fAX_IND;
	}
 
	
	
	
	
}
