package com.yoprogramo.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoprogramo.apirest.models.entity.noticias;
import com.yoprogramo.apirest.models.entity.dao.INoticiaDao;

@Service
public class NoticiaServiceImpl implements INoticiaService{

	@Autowired
	private INoticiaDao noticiaDao;
	
	
	@Override
	public List<noticias> findAll() {
		
		return (List<noticias>) noticiaDao.findAll();
	}

	
	
}
