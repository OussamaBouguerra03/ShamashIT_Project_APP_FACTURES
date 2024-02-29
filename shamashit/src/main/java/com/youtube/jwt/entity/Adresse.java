package com.youtube.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

 

@Entity
 
@Table(name="T_ADRESSE")
public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("ID_ADR")
    @Column(name = "id_adr")
	int ID_ADR;
	@JsonProperty("REF_IND_ADR")
    @Column(name = "ref_ind_adr")
	String REF_IND_ADR;
	@JsonProperty("LIB_ADR")
    @Column(name = "lib_adr")
	String LIB_ADR;
	@JsonProperty("ACTIF_ADR")
    @Column(name = "actif_adr")
	byte ACTIF_ADR;
	@JsonProperty("ID_NLDP")
    @Column(name = "id_nldp")
	String ID_NLDP;
	@JsonProperty("ID_GOUV_ADR")
    @Column(name = "id_gouv_adr")
	String ID_GOUV_ADR;
	@JsonProperty("ID_CP")
    @Column(name = "id_cp")
	String ID_CP;
	public int getID_ADR() {
		return ID_ADR;
	}
	public void setID_ADR(int iD_ADR) {
		ID_ADR = iD_ADR;
	}
	 
	public String getREF_IND_ADR() {
		return REF_IND_ADR;
	}
	public void setREF_IND_ADR(String rEF_IND_ADR) {
		REF_IND_ADR = rEF_IND_ADR;
	}
	public String getLIB_ADR() {
		return LIB_ADR;
	}
	public void setLIB_ADR(String lIB_ADR) {
		LIB_ADR = lIB_ADR;
	}
	public byte getACTIF_ADR() {
		return ACTIF_ADR;
	}
	public void setACTIF_ADR(byte aCTIF_ADR) {
		ACTIF_ADR = aCTIF_ADR;
	}
	public String getID_NLDP() {
		return ID_NLDP;
	}
	public void setID_NLDP(String iD_NLDP) {
		ID_NLDP = iD_NLDP;
	}
	public String getID_GOUV_ADR() {
		return ID_GOUV_ADR;
	}
	public void setID_GOUV_ADR(String iD_GOUV_ADR) {
		ID_GOUV_ADR = iD_GOUV_ADR;
	}
	public String getID_CP() {
		return ID_CP;
	}
	public void setID_CP(String iD_CP) {
		ID_CP = iD_CP;
	}
	
		
}
