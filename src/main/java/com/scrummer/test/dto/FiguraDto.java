package com.scrummer.test.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.scrummer.test.entity.Figura;

public class FiguraDto {

    private Long id;
	
	private Float superficie;
	
	private Float base;
	
	private Float altura;
	
	private Float diametro; 
		
	private String tipoFigura;
	
	public FiguraDto() {
	}
	
	public FiguraDto(Figura figura) {
		this.id = figura.getId();
		this.superficie = figura.getSuperficie();
		this.base = figura.getBase();
		this.altura = figura.getAltura();
		this.diametro = figura.getDiametro();
		this.tipoFigura = figura.getTipoFigura();
	}

	public FiguraDto(Long id, Float superficie, Float base, Float altura, Float diametro, String tipoFigura) {
		this.id = id;
		this.superficie = superficie;
		this.base = base;
		this.altura = altura;
		this.diametro = diametro;
		this.tipoFigura = tipoFigura;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Float superficie) {
		this.superficie = superficie;
	}

	public Float getBase() {
		return base;
	}

	public void setBase(Float base) {
		this.base = base;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getDiametro() {
		return diametro;
	}

	public void setDiametro(Float diametro) {
		this.diametro = diametro;
	}

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}


}
