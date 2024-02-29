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
@Table(name="T_BORDEREAU")
public class Bordereau {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("NUM_BORD")
    @Column(name = "num_bord")
	int NUM_BORD;
	@JsonProperty("ANNEE_BORD")
    @Column(name = "annee_bord")
	String ANNEE_BORD;
	@JsonProperty("NB_DOC_BORD")
    @Column(name = "nb_doc_bord")
	int NB_DOC_BORD;
	@JsonProperty("REF_CTR_BORD")
    @Column(name = "ref_ctr_bord")
	int REF_CTR_BORD;
	@JsonProperty("REF_ADH_BORD")
    @Column(name = "ref_adh_bord")
	String REF_ADH_BORD;
	@JsonProperty("MONT_TOT_BORD")
    @Column(name = "mont_tot_bord")
	double MONT_TOT_BORD;
	@JsonProperty("DEVISE_ACH")
    @Column(name = "devise_ach")
	String DEVISE_ACH;
	@JsonProperty("VALIDE_BORD")
    @Column(name = "valide_bord")
	byte VALIDE_BORD;
	@JsonProperty("DAT_SAISIE_BORD")
    @Column(name = "dat_saisie_bord")
	@Temporal(TemporalType.DATE)
	Date DAT_SAISIE_BORD;
	@ManyToOne
    @JoinColumn(name = "REF_CTR_BORD", insertable = false, updatable = false)
    private Contrat contrat;

	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public int getNUM_BORD() {
		return NUM_BORD;
	}
	public void setNUM_BORD(int nUM_BORD) {
		NUM_BORD = nUM_BORD;
	}
	public String getANNEE_BORD() {
		return ANNEE_BORD;
	}
	public void setANNEE_BORD(String aNNEE_BORD) {
		ANNEE_BORD = aNNEE_BORD;
	}
	public int getNB_DOC_BORD() {
		return NB_DOC_BORD;
	}
	public void setNB_DOC_BORD(int nB_DOC_BORD) {
		NB_DOC_BORD = nB_DOC_BORD;
	}
	public double getMONT_TOT_BORD() {
		return MONT_TOT_BORD;
	}
	public void setMONT_TOT_BORD(double mONT_TOT_BORD) {
		MONT_TOT_BORD = mONT_TOT_BORD;
	}
	public String getDEVISE_ACH() {
		return DEVISE_ACH;
	}
	public void setDEVISE_ACH(String dEVISE_ACH) {
		DEVISE_ACH = dEVISE_ACH;
	}
	public byte getVALIDE_BORD() {
		return VALIDE_BORD;
	}
	public void setVALIDE_BORD(byte vALIDE_BORD) {
		VALIDE_BORD = vALIDE_BORD;
	}
	public Date getDAT_SAISIE_BORD() {
		return DAT_SAISIE_BORD;
	}
	public void setDAT_SAISIE_BORD(Date dAT_SAISIE_BORD) {
		DAT_SAISIE_BORD = dAT_SAISIE_BORD;
	}
 
	public int getREF_CTR_BORD() {
		return REF_CTR_BORD;
	}
	public void setREF_CTR_BORD(int rEF_CTR_BORD) {
		REF_CTR_BORD = rEF_CTR_BORD;
	}
	public String getREF_ADH_BORD() {
		return REF_ADH_BORD;
	}
	public void setREF_ADH_BORD(String rEF_ADH_BORD) {
		REF_ADH_BORD = rEF_ADH_BORD;
	}
	 
}
