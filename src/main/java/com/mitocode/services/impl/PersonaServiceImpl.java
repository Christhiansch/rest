package com.mitocode.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Persona;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IPersonaRepo;
import com.mitocode.services.IPersonaService;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, Integer> implements IPersonaService
{
	
	@Autowired
	private IPersonaRepo personaRepo;

	@Override
	protected IGenericRepo<Persona, Integer> genericRepo()
	{
		return personaRepo;
	}

}
