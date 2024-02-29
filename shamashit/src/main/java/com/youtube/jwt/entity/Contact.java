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
 
@Table(name="T_CONTACT")
public class Contact {
	@JsonProperty("ID_CONTACT")
    @Column(name = "id_contact")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int ID_CONTACT;
	@JsonProperty("POS_CONTACT")
    @Column(name = "pos_contact")
	String POS_CONTACT;
	@JsonProperty("TEL1_CONTACT")
    @Column(name = "tel1_contact")
	String TEL1_CONTACT;
	@JsonProperty("TEL2_CONTACT")
    @Column(name = "tel2_contact")
	String TEL2_CONTACT;
	@JsonProperty("MAIL1_CONTACT")
    @Column(name = "mail1_contact")
	String MAIL1_COONTACT;
	@JsonProperty("MAIL2_CONTACT")
    @Column(name = "mail2_contact")
	String MAIL2_COONTACT;
	@JsonProperty("FAX_CONTACT")
    @Column(name = "fax_contact")
	String FAX_CONTACT;
	@JsonProperty("ACTIF_CONTACT")
    @Column(name = "actif_contact")
	byte ACTIF_CONTACT;
	@JsonProperty("REF_IND_CONTACT")
    @Column(name = "ref_ind_contact")
	String REF_IND_CONTACT;
	  
    
	

	public String getREF_IND_CONTACT() {
		return REF_IND_CONTACT;
	}

	public void setREF_IND_CONTACT(String rEF_IND_CONTACT) {
		REF_IND_CONTACT = rEF_IND_CONTACT;
	}

	public int getID_CONTACT() {
		return ID_CONTACT;
	}

	public void setID_CONTACT(int iD_CONTACT) {
		ID_CONTACT = iD_CONTACT;
	}

	public String getPOS_CONTACT() {
		return POS_CONTACT;
	}

	public void setPOS_CONTACT(String pOS_CONTACT) {
		POS_CONTACT = pOS_CONTACT;
	}

	public String getTEL1_CONTACT() {
		return TEL1_CONTACT;
	}

	public void setTEL1_CONTACT(String tEL1_CONTACT) {
		TEL1_CONTACT = tEL1_CONTACT;
	}

	public String getTEL2_CONTACT() {
		return TEL2_CONTACT;
	}

	public void setTEL2_CONTACT(String tEL2_CONTACT) {
		TEL2_CONTACT = tEL2_CONTACT;
	}

	public String getMAIL1_COONTACT() {
		return MAIL1_COONTACT;
	}

	public void setMAIL1_COONTACT(String mAIL1_COONTACT) {
		MAIL1_COONTACT = mAIL1_COONTACT;
	}

	public String getMAIL2_COONTACT() {
		return MAIL2_COONTACT;
	}

	public void setMAIL2_COONTACT(String mAIL2_COONTACT) {
		MAIL2_COONTACT = mAIL2_COONTACT;
	}

	public String getFAX_CONTACT() {
		return FAX_CONTACT;
	}

	public void setFAX_CONTACT(String fAX_CONTACT) {
		FAX_CONTACT = fAX_CONTACT;
	}

	public byte getACTIF_CONTACT() {
		return ACTIF_CONTACT;
	}

	public void setACTIF_CONTACT(byte aCTIF_CONTACT) {
		ACTIF_CONTACT = aCTIF_CONTACT;
	}

	 
	
}
