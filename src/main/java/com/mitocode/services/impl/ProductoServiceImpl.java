package com.mitocode.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Producto;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IProductoRepo;
import com.mitocode.services.IProductoService;

@Service
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements IProductoService
{
	
	@Autowired
	private IProductoRepo productoRepo;

	@Override
	protected IGenericRepo<Producto, Integer> genericRepo()
	{
		return productoRepo;
	}

}
