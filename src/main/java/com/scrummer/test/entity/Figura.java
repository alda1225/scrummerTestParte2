package com.scrummer.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="figura")
public class Figura implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	@Column(nullable = true)
	private Float superficie;
	
	@Column(nullable = true)
	private Float base;
	
	@Column(nullable = true)
	private Float altura;
	
	@Column(nullable = true)
	private Float diametro; 
		
	@Column(name = "tipo_figura", nullable = false)
	private String tipoFigura;
	
	

	public Figura() {
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
