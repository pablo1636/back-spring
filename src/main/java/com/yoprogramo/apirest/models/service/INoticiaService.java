package com.yoprogramo.apirest.models.service;

import java.util.List;

import com.yoprogramo.apirest.models.entity.noticias;

public interface INoticiaService {

	public List<noticias> findAll();
	
}
