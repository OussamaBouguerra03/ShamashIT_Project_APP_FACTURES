package com.youtube.jwt.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonProperty;

 

@Entity
@Table(name="T_CONTRAT")
public class Contrat {
	@JsonProperty("REF_CTR")
    @Column(name = "ref_ctr")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int REF_CTR;
	@JsonProperty("STATUT_CTR")
    @Column(name = "statut_ctr")
	int STATUT_CTR;
	@JsonProperty("NOM_ADER")
    @Column(name = "nom_ader")
	String NOM_ADER;
	@JsonProperty("NOM_ACHE")
    @Column(name = "nom_ache")
	String NOM_ACHE;
	@JsonProperty("TYP_CTR")
    @Column(name = "typ_ctr")
	String TYP_CTR;
	@JsonProperty("DAT_SIGN_CTR")
    @Column(name = "dat_sign_ctr")
	@Temporal(TemporalType.DATE)
	Date DAT_SIGN_CTR;
	@JsonProperty("DAT_DEB_CTR")
    @Column(name = "dat_deb_ctr")
	@Temporal(TemporalType.DATE)
	Date DAT_DEB_CTR;
	@JsonProperty("DAT_RESIL_CTR")
    @Column(name = "dat_resil_ctr")
	@Temporal(TemporalType.DATE)
	Date DAT_RESIL_CTR;
	@JsonProperty("DAT_PROCH_VERS_CTR")
    @Column(name = "dat_proch_vers_ctr")
	@Temporal(TemporalType.DATE)
	Date DAT_PROCH_VERS_CTR;
	@JsonProperty("CA_CTR")
    @Column(name = "ca_ctr")
	double CA_CTR;
	@JsonProperty("CA_EXP_CTR")
    @Column(name = "ca_exp_ctr")
	double CA_EXP_CTR;
	@JsonProperty("CA_IMP_CTR")
    @Column(name = "ca_imp_ctr")
	double CA_IMP_CTR;
	@JsonProperty("LIM_FIN_CTR")
    @Column(name = "lim_fin_ctr")
	double LIM_FIN_CTR;
	@JsonProperty("DEVISE_CTR")
    @Column(name = "devise_ctr")
	String DEVISE_CTR;
	@JsonProperty("NB_ACH_PREVU_CTR")
    @Column(name = "nb_ach_prevu_ctr")
	int NB_ACH_PREVU_CTR;
	@JsonProperty("NB_FACT_PREVU_CTR")
    @Column(name = "nb_fact_prevu_ctr")
	int NB_FACT_PREVU_CTR;
	@JsonProperty("NB_AVOIRS_PREVU_CTR")
    @Column(name = "nb_avoirs_prevu_ctr")
	int NB_AVOIRS_PREVU_CTR;
	@JsonProperty("NB_REMISES_PREVU_CTR")
    @Column(name = "nb_remises_prevu_ctr")
	int NB_REMISES_PREVU_CTR;
	@JsonProperty("DELAI_MOYEN_REG_CTR")
    @Column(name = "delai_moyen_reg_ctr")
	int DELAI_MOYEN_REG_CTR;
	@JsonProperty("DELAI_MAX_REG_CTR")
    @Column(name = "delai_max_reg_ctr")
	int DELAI_MAX_REG_CTR;
	 
	 
	public int getREF_CTR() {
		return REF_CTR;
	}
	public void setREF_CTR(int rEF_CTR) {
		REF_CTR = rEF_CTR;
	}
	 
 
	 
	public String getNOM_ADER() {
		return NOM_ADER;
	}
	public void setNOM_ADER(String nOM_ADER) {
		NOM_ADER = nOM_ADER;
	}
	public String getNOM_ACHE() {
		return NOM_ACHE;
	}
	public void setNOM_ACHE(String nOM_ACHE) {
		NOM_ACHE = nOM_ACHE;
	}
	public int getSTATUT_CTR() {
		return STATUT_CTR;
	}
	public void setSTATUT_CTR(int sTATUT_CTR) {
		STATUT_CTR = sTATUT_CTR;
	}
	public String getTYP_CTR() {
		return TYP_CTR;
	}
	public void setTYP_CTR(String tYP_CTR) {
		TYP_CTR = tYP_CTR;
	}
	public Date getDAT_SIGN_CTR() {
		return DAT_SIGN_CTR;
	}
	public void setDAT_SIGN_CTR(Date dAT_SIGN_CTR) {
		DAT_SIGN_CTR = dAT_SIGN_CTR;
	}
	public Date getDAT_DEB_CTR() {
		return DAT_DEB_CTR;
	}
	public void setDAT_DEB_CTR(Date dAT_DEB_CTR) {
		DAT_DEB_CTR = dAT_DEB_CTR;
	}
	public Date getDAT_RESIL_CTR() {
		return DAT_RESIL_CTR;
	}
	public void setDAT_RESIL_CTR(Date dAT_RESIL_CTR) {
		DAT_RESIL_CTR = dAT_RESIL_CTR;
	}
	public Date getDAT_PROCH_VERS_CTR() {
		return DAT_PROCH_VERS_CTR;
	}
	public void setDAT_PROCH_VERS_CTR(Date dAT_PROCH_VERS_CTR) {
		DAT_PROCH_VERS_CTR = dAT_PROCH_VERS_CTR;
	}
	public double getCA_CTR() {
		return CA_CTR;
	}
	public void setCA_CTR(double cA_CTR) {
		CA_CTR = cA_CTR;
	}
	public double getCA_EXP_CTR() {
		return CA_EXP_CTR;
	}
	public void setCA_EXP_CTR(double cA_EXP_CTR) {
		CA_EXP_CTR = cA_EXP_CTR;
	}
	public double getCA_IMP_CTR() {
		return CA_IMP_CTR;
	}
	public void setCA_IMP_CTR(double cA_IMP_CTR) {
		CA_IMP_CTR = cA_IMP_CTR;
	}
	public double getLIM_FIN_CTR() {
		return LIM_FIN_CTR;
	}
	public void setLIM_FIN_CTR(double lIM_FIN_CTR) {
		LIM_FIN_CTR = lIM_FIN_CTR;
	}
	public String getDEVISE_CTR() {
		return DEVISE_CTR;
	}
	public void setDEVISE_CTR(String dEVISE_CTR) {
		DEVISE_CTR = dEVISE_CTR;
	}
	public int getNB_ACH_PREVU_CTR() {
		return NB_ACH_PREVU_CTR;
	}
	public void setNB_ACH_PREVU_CTR(int nB_ACH_PREVU_CTR) {
		NB_ACH_PREVU_CTR = nB_ACH_PREVU_CTR;
	}
	public int getNB_FACT_PREVU_CTR() {
		return NB_FACT_PREVU_CTR;
	}
	public void setNB_FACT_PREVU_CTR(int nB_FACT_PREVU_CTR) {
		NB_FACT_PREVU_CTR = nB_FACT_PREVU_CTR;
	}
	public int getNB_AVOIRS_PREVU_CTR() {
		return NB_AVOIRS_PREVU_CTR;
	}
	public void setNB_AVOIRS_PREVU_CTR(int nB_AVOIRS_PREVU_CTR) {
		NB_AVOIRS_PREVU_CTR = nB_AVOIRS_PREVU_CTR;
	}
	public int getNB_REMISES_PREVU_CTR() {
		return NB_REMISES_PREVU_CTR;
	}
	public void setNB_REMISES_PREVU_CTR(int nB_REMISES_PREVU_CTR) {
		NB_REMISES_PREVU_CTR = nB_REMISES_PREVU_CTR;
	}
	public int getDELAI_MOYEN_REG_CTR() {
		return DELAI_MOYEN_REG_CTR;
	}
	public void setDELAI_MOYEN_REG_CTR(int dELAI_MOYEN_REG_CTR) {
		DELAI_MOYEN_REG_CTR = dELAI_MOYEN_REG_CTR;
	}
	public int getDELAI_MAX_REG_CTR() {
		return DELAI_MAX_REG_CTR;
	}
	public void setDELAI_MAX_REG_CTR(int dELAI_MAX_REG_CTR) {
		DELAI_MAX_REG_CTR = dELAI_MAX_REG_CTR;
	}
}