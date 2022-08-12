package com.yoprogramo.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoprogramo.apirest.models.entity.noticias;
import com.yoprogramo.apirest.models.service.INoticiaService;

@RestController
@RequestMapping("/api")
public class NoticiaRestController {

	@Autowired
	private INoticiaService noticiaService;
    
	@GetMapping("/noticias")
	public List<noticias> index(){
		
		return noticiaService.findAll();
	}
	
}
