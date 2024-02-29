package com.youtube.jwt.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "T_DET_BORD")
public class DetailBordereau {
	 @Id
	    @Column(name = "ID_DET_BORD")
		@JsonProperty("IDDETBORD")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int idDetBord;
	 @JsonProperty("ref_ctr_det_bord")
	    @Column(name = "ref_ctr_det_bord")
		int REF_CTR_DET_BORD;
	 @JsonProperty("ANNEE_BORD")
	    @Column(name = "annee_bord")
		String ANNEE_BORD;
	 @JsonProperty("NUM_BORD")
	    @Column(name = "num_bord")
		int NUM_BORD;
	 @JsonProperty("TYP_DET_BORD")
	    @Column(name = "typ_det_bord")
		String TYP_DET_BORD;
	 @JsonProperty("DATE_DET_BORD")
	    @Column(name = "date_det_bord")
		@Temporal(TemporalType.DATE)
		Date DATE_DET_BORD;
	 @JsonProperty("MONT_TTC_DET_BORD")
	    @Column(name = "mont_ttc_det_bord")
		int MONT_TTC_DET_BORD;
	 @JsonProperty("ECH_DET_BORD")
	    @Column(name = "ech_det_bord")
		int ECH_DET_BORD;
	 @JsonProperty("MONT_OUV_DET_BORD")
	    @Column(name = "mont_ouv_det_bord")
		int MONT_OUV_DET_BORD;
	 
	 @JsonProperty("MODE_REG_DET_BORD")
	    @Column(name = "mode_reg_det_bord")
		String MODE_REG_DET_BORD;
	 @JsonProperty("VALIDE_DET_BORD")
	    @Column(name = "valide_det_bord")
		int VALIDE_DET_BORD;
	 @JsonProperty("ref_ind_det_bord")
	    @Column(name = "ref_ind_det_bord")
		String REF_IND_DET_BORD;
	 
	public int getIdDetBord() {
		return idDetBord;
	}
	public void setIdDetBord(int idDetBord) {
		this.idDetBord = idDetBord;
	}
	public int getREF_CTR_DET_BORD() {
		return REF_CTR_DET_BORD;
	}
	public void setREF_CTR_DET_BORD(int rEF_CTR_DET_BORD) {
		REF_CTR_DET_BORD = rEF_CTR_DET_BORD;
	}
	public String getANNEE_BORD() {
		return ANNEE_BORD;
	}
	public void setANNEE_BORD(String aNNEE_BORD) {
		ANNEE_BORD = aNNEE_BORD;
	}
	public int getNUM_BORD() {
		return NUM_BORD;
	}
	public void setNUM_BORD(int nUM_BORD) {
		NUM_BORD = nUM_BORD;
	}
	public String getTYP_DET_BORD() {
		return TYP_DET_BORD;
	}
	public void setTYP_DET_BORD(String tYP_DET_BORD) {
		TYP_DET_BORD = tYP_DET_BORD;
	}
	public Date getDATE_DET_BORD() {
		return DATE_DET_BORD;
	}
	public void setDATE_DET_BORD(Date dATE_DET_BORD) {
		DATE_DET_BORD = dATE_DET_BORD;
	}
	public int getMONT_TTC_DET_BORD() {
		return MONT_TTC_DET_BORD;
	}
	public void setMONT_TTC_DET_BORD(int mONT_TTC_DET_BORD) {
		MONT_TTC_DET_BORD = mONT_TTC_DET_BORD;
	}
	public int getECH_DET_BORD() {
		return ECH_DET_BORD;
	}
	public void setECH_DET_BORD(int eCH_DET_BORD) {
		ECH_DET_BORD = eCH_DET_BORD;
	}
	public int getMONT_OUV_DET_BORD() {
		return MONT_OUV_DET_BORD;
	}
	public void setMONT_OUV_DET_BORD(int mONT_OUV_DET_BORD) {
		MONT_OUV_DET_BORD = mONT_OUV_DET_BORD;
	}
 
	public String getMODE_REG_DET_BORD() {
		return MODE_REG_DET_BORD;
	}
	public void setMODE_REG_DET_BORD(String mODE_REG_DET_BORD) {
		MODE_REG_DET_BORD = mODE_REG_DET_BORD;
	}
	public int getVALIDE_DET_BORD() {
		return VALIDE_DET_BORD;
	}
	public void setVALIDE_DET_BORD(int vALIDE_DET_BORD) {
		VALIDE_DET_BORD = vALIDE_DET_BORD;
	}
	public String getREF_IND_DET_BORD() {
		return REF_IND_DET_BORD;
	}
	public void setREF_IND_DET_BORD(String rEF_IND_DET_BORD) {
		REF_IND_DET_BORD = rEF_IND_DET_BORD;
	}
	 
	 
	
}
