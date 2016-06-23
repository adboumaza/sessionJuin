package com.myapp.dao;

import java.util.List;

import com.myapp.entitis.Voiture;

public interface IvoitureDao {

	public Voiture addVoiture(Voiture v);
	public Voiture updateVoiture(Voiture v);
	public Voiture supVoiture(Long idVoiture);
	public Voiture getVoiture(Long idVoiture);
	public List<Voiture> getVoitures();
	public List<Voiture> getVoitureByMc(String mc);
}
