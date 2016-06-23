package com.myapp.service;

import java.util.List;

import com.myapp.entitis.Client;

public interface IclientService {

	public Client addClient(Client c);
	public Client addClientToVoiture(Client c,Long idVoiture);
	public Client updateClient(Client c);
	public Client supClient(Long idClient);
	public Client getClient (Long idClient);
	public List<Client> getClients();
	public List<Client> getClientsPaMc(String mc);
}
