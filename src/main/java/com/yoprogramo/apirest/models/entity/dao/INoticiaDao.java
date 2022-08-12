package com.yoprogramo.apirest.models.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.yoprogramo.apirest.models.entity.noticias;

public interface INoticiaDao extends CrudRepository<noticias, Long>{

}
