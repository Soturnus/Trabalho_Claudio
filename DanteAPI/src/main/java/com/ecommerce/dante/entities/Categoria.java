package com.ecommerce.dante.entities;

public enum Categoria {
	Camisas(1),
	Calças(2),
	Saias(3),
	Blusas(4),
	Shortes(5),
	Bermudas(6),
	Calçados(7),
	pulseiras(8),
	oculos(9);
	
	private int codigo;
	
	private Categoria(int codigo) {
		this.codigo=codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public static Categoria valueOf(int codigo) {
		for (Categoria valor : Categoria.values()) {
			if(valor.getCodigo()  == codigo) {
				return valor;
			}
		}
		throw new IllegalArgumentException("Categoria inválida");
	}

}
