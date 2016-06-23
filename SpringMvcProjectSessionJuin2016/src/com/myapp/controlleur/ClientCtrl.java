package com.myapp.controlleur;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myapp.entitis.Client;
import com.myapp.service.IclientService;

@Controller
public class ClientCtrl {
	
	@Autowired
    private IclientService metier;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		model.addAttribute("AttrClient",metier.getClients());
		return "index";
	}
	
	@RequestMapping(value="/getClients")
	public String getClient(Model model,String motCle){
		model.addAttribute("AttrClient",metier.getClientsPaMc(motCle));
		return "index";
	}
	@RequestMapping(value="/suprimer")
	public String suprimmer(Model model, Long idClient){
		metier.supClient(idClient);
		model.addAttribute("AttrClient",metier.getClients());
		return "index";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(Model model,
		@RequestParam("nom")   String nomClient,
		@RequestParam("prenom")   String prenomClient,
		@RequestParam("age")   int ageClient){
		Client c = new Client(nomClient, prenomClient, ageClient);
		metier.addClient(c);
		model.addAttribute("AttrClient",metier.getClients());
		
		return "redirect:success";
	}
	@RequestMapping(value="/success")
	public String redirection(Model model){
		model.addAttribute("AttrClient",new Client());
		return "pageSuccess";
	}
	
	
	
	
   
}
