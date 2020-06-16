package com.mitocode.services.impl;

import java.util.List;

import com.mitocode.repo.IGenericRepo;
import com.mitocode.services.ICRUD;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID>
{

	protected abstract IGenericRepo<T, ID> genericRepo();

	@Override
	public T registrar(T obj) throws Exception
	{
		return genericRepo().save(obj);
	}

	@Override
	public T modificar(T obj) throws Exception
	{
		return genericRepo().save(obj);
	}

	@Override
	public List<T> listar() throws Exception
	{
		return genericRepo().findAll();
	}

	@Override
	public T listarPorId(ID id) throws Exception
	{
		return genericRepo().findById(id).orElse(null);
	}

	@Override
	public void eliminar(ID id) throws Exception
	{
		genericRepo().deleteById(id);;
	}

}
