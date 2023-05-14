package com.ecommerce.dante.entities;

public enum Tamanho {

	PP(1),
	P(2),
	M(3),
	G(4),
	GG(5),
	XGG(6);
	
	private int codigo;
	
	private Tamanho(int codigo) {
		this.codigo=codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public static Tamanho valueOf(int codigo) {
		for (Tamanho valor : Tamanho.values()) {
			if(valor.getCodigo()  == codigo) {
				return valor;
			}
		}
		throw new IllegalArgumentException("Tamanho inválido");
	}
	
}
