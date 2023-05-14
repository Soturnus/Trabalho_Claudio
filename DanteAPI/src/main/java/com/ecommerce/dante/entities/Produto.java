package com.ecommerce.dante.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String imagem;
	
	private Integer tamanho;
	
	private Double valor;
	
	private String descricao;
	
	private Integer categoria;
	
	public Produto(Integer id, String nome, String imagem, Tamanho tamanho,Categoria categoria, Double valor, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.imagem = imagem;
		setTamanho(tamanho);
		setCategoria(categoria);
		this.valor = valor;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Tamanho getTamanho() {
		return Tamanho.valueOf(tamanho);
	}

	public void setTamanho(Tamanho tamanho) {
		if(tamanho != null) {
			this.tamanho = tamanho.getCodigo();
		}
		
	}

	public Categoria getcategoria() {
		return Categoria.valueOf(categoria);
	}

	public void setCategoria(Categoria categoria) {
		if(categoria != null) {
			this.categoria = categoria.getCodigo();
		}
		
	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
