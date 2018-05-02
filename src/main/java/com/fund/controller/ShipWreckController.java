package com.fund.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fund.model.Shipwreck;

@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list(){
		
		return 	ShipwreckStub.list();
	}

	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck wreck){
		
		return 	ShipwreckStub.create(wreck);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id){
		
		return 	ShipwreckStub.get(id);
		
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, Shipwreck wreck){
		
		return 	ShipwreckStub.update(id, wreck);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck list(@PathVariable Long id){
		
		return 	ShipwreckStub.delete(id);
	}
	
	
	
}
