package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 	// Equivalente a uma tabela do banco relacional, caso não exista no banco ela cria.
@Table(name = "tb_game") 	// Põe o nome na tabela.
public class Game {

	@Id 			//Cria a chave primária no banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Permite que o Id ou chave primária seja auto-incrementável.
	private Long id;
	private String titulo;
   /* 
    * @Column(name = "game_year") // Customizando nome da tabela no banco, pois o year 
	* private Integer year;	  //  é uma palavra reservada do SQL/Banco.
	*
	*/
	private Integer ano;
	private String genero;
	private Double score;
	private String plataforma;
	private String imgUrl;
	private String descricaoCurta;
	private String descricaoLonga;

	public Game() {

	}

	public Game(Long id, String titulo, Integer ano, String genero, Double score, String plataforma, String imgUrl,
			String descricaoCurta, String descricaoLonga) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.score = score;
		this.plataforma = plataforma;
		this.imgUrl = imgUrl;
		this.descricaoCurta = descricaoCurta;
		this.descricaoLonga = descricaoLonga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}

	public String getDescricaoLonga() {
		return descricaoLonga;
	}

	public void setDescricaoLonga(String descricaoLonga) {
		this.descricaoLonga = descricaoLonga;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}

}
