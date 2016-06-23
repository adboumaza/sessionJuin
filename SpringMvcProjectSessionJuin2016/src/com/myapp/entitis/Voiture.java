package com.myapp.entitis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVoiture;
	private String marqueVoiture;
	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getMarqueVoiture() {
		return marqueVoiture;
	}
	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}
	public Voiture() {
		// TODO Auto-generated constructor stub
	}
	public Voiture(String marqueVoiture) {
		super();
		this.marqueVoiture = marqueVoiture;
	}
	
	
	
	
	
}
