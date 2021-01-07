package com.scrummer.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.scrummer.test.dto.FiguraDto;
import com.scrummer.test.entity.Figura;
import com.scrummer.test.repository.FiguraRepository;

@Service("figuraService")
public class FiguraService {
	
	@Autowired
	@Qualifier("figuraRepository")
	private FiguraRepository figuraRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<FiguraDto> findByTipoFigura(String tipoFigura) {
		List<Figura> figura = figuraRepository.findByTipoFigura(tipoFigura);
		List<FiguraDto> figuraDto = new ArrayList<>();
		for(Figura item : figura) {
			figuraDto.add(new FiguraDto(item));
		}
		return figuraDto;
	}
	
	public List<FiguraDto> findAll() {
		List<Figura> figura = figuraRepository.findAll();
		List<FiguraDto> figuraDto = new ArrayList<>();
		for(Figura item : figura) {
			figuraDto.add(new FiguraDto(item));
		}
		return figuraDto;
	}
	
	public boolean setFigura(Figura figura) {
		try {
			figuraRepository.save(figura);
			return true;
		}
		catch (Exception e) {
			return false;			
		}
		
	}

}
