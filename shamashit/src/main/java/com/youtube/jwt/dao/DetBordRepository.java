package com.youtube.jwt.dao;

 
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.youtube.jwt.entity.DetailBordereau;

public interface DetBordRepository  extends CrudRepository<DetailBordereau,Integer>{
	 @Query(value="SELECT * FROM T_DET_BORD WHERE REF_CTR_DET_BORD =?", nativeQuery = true)
	    Object[] findbyID(@Param("REF_CTR_DET_BORD") int refCtr);
	 @Modifying
	 @Transactional
	 @Query(value = "UPDATE T_DET_BORD JOIN T_ENCAISSEMENT SET T_DET_BORD.MONT_OUV_DET_BORD = T_DET_BORD.MONT_OUV_DET_BORD - T_ENCAISSEMENT.MONT_ENC WHERE T_DET_BORD.ID_DET_BORD = ? AND T_ENCAISSEMENT.ID_ENC = ?", nativeQuery = true)
	 void updateMontOuvDetBordByIdAndIdEnc(int idDetBord, int idEnc);
	 @Query(value="SELECT db.ref_ind_det_bord AS 'Adherent', db.typ_det_bord AS 'Document', db.mont_ouv_det_bord AS 'Montant ouvert', db.mont_ttc_det_bord AS 'Montant Total', db.ref_ctr_det_bord AS 'Reference Contrat', db.num_bord AS 'Bordereau', DATE_ADD(db.date_det_bord, INTERVAL db.ech_det_bord DAY) AS 'Echeance', ti.email_ind AS 'Email' FROM shamashit.t_det_bord db JOIN shamashit.t_individu ti ON db.ref_ind_det_bord = ti.nom_ind WHERE db.date_det_bord + INTERVAL db.ech_det_bord DAY <= CURDATE() + INTERVAL 7 DAY AND db.date_det_bord + INTERVAL db.ech_det_bord DAY >= CURDATE() AND db.mont_ouv_det_bord > 0;", nativeQuery = true)
	   List<DetailBordereau> findbyDate();
	 
}
