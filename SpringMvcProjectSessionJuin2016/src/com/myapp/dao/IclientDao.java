package com.myapp.dao;

import java.util.List;

import com.myapp.entitis.Client;
import com.myapp.entitis.Voiture;

public interface IclientDao {

	public Client addClient(Client c);
	public Client addClientToVoiture(Client c,Long idVoiture);
	public Client updateClient(Client c);
	public Client supClient(Long idClient);
	public Client getClient (Long idClient);
	public List<Client> getClients();
	public List<Client> getClientsPaMc(String mc);

	
}
