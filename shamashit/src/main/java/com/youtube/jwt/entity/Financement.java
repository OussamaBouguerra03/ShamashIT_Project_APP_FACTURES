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
 
@Table(name="T_FINANCEMENT")
public class Financement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int ID_FIN;
	@JsonProperty("MONT_FIN")
    @Column(name = "mont_fin")
	double MONT_FIN;
	@JsonProperty("DAT_FIN")
    @Column(name = "dat_fin")
	@Temporal(TemporalType.DATE)
	Date DAT_FIN;
	@JsonProperty("INSTR_FIN")
    @Column(name = "instr_fin")
	String INSTR_FIN;
	@JsonProperty("REF_CTR_FIN")
    @Column(name = "ref_ctr_fin")
	int REF_CTR_FIN;
	@JsonProperty("REF_ADH_FIN")
    @Column(name = "ref_adh_fin")
	int REF_ADH_FIN;
	@JsonProperty("REF_INSTR_FIN")
    @Column(name = "ref_instr_fin")
	String REF_INSTR_FIN;
	@JsonProperty("ETAT_FIN")
    @Column(name = "etat_fin")
	String ETAT_FIN;
	@JsonProperty("DAT_INSTR_FIN")
    @Column(name = "dat_instr_fin")
	@Temporal(TemporalType.DATE)
	Date DAT_INSTR_FIN;
	@ManyToOne
    @JoinColumn(name = "REF_CTR_FIN", insertable = false, updatable = false)
    private Contrat contrat;
	  
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public int getID_FIN() {
		return ID_FIN;
	}
	public void setID_FIN(int iD_FIN) {
		ID_FIN = iD_FIN;
	}
	public double getMONT_FIN() {
		return MONT_FIN;
	}
	public void setMONT_FIN(double mONT_FIN) {
		MONT_FIN = mONT_FIN;
	}
	public Date getDAT_FIN() {
		return DAT_FIN;
	}
	public void setDAT_FIN(Date dAT_FIN) {
		DAT_FIN = dAT_FIN;
	}
	public String getINSTR_FIN() {
		return INSTR_FIN;
	}
	public void setINSTR_FIN(String iNSTR_FIN) {
		INSTR_FIN = iNSTR_FIN;
	}
	public String getREF_INSTR_FIN() {
		return REF_INSTR_FIN;
	}
	public void setREF_INSTR_FIN(String rEF_INSTR_FIN) {
		REF_INSTR_FIN = rEF_INSTR_FIN;
	}
	public String getETAT_FIN() {
		return ETAT_FIN;
	}
	public void setETAT_FIN(String eTAT_FIN) {
		ETAT_FIN = eTAT_FIN;
	}
	public Date getDAT_INSTR_FIN() {
		return DAT_INSTR_FIN;
	}
	public void setDAT_INSTR_FIN(Date dAT_INSTR_FIN) {
		DAT_INSTR_FIN = dAT_INSTR_FIN;
	}
	public int getREF_CTR_FIN() {
		return REF_CTR_FIN;
	}
	public void setREF_CTR_FIN(int rEF_CTR_FIN) {
		REF_CTR_FIN = rEF_CTR_FIN;
	}
	public int getREF_ADH_FIN() {
		return REF_ADH_FIN;
	}
	public void setREF_ADH_FIN(int rEF_ADH_FIN) {
		REF_ADH_FIN = rEF_ADH_FIN;
	}

}
