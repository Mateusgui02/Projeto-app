package br.com.academia.model;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {

		private String nome;
		private double peso;
		private double altura;
		private String genero;
		private LocalDate dataNascimento;
		private String nivelAtividade;
	
		
		public LocalDate setDataNascimento(LocalDate dataNascimento) {
			return this.dataNascimento = dataNascimento;
		}
		
		public LocalDate getDataNascimento() {
			return dataNascimento;
		}
		
		//**idade da pessoa **//
		
		public int getIdade() {
			LocalDate hoje = LocalDate.now();
			Period periodo = Period.between(this.dataNascimento, hoje);
			return periodo.getYears();
		}
		
			 	//**Nome**//
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return this.nome;
		}
				//**Peso**//
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public double getPeso() {
			return this.peso;
		}
				
				//**Altura**//
		public void setAltura(double altura) {
			this.altura=altura;
		}
		public double getAltura() {
			return this.altura;
		}
		
			//** Genero**//
		public void setGenero(String genero) {
			this.genero=genero;
		}
		
		public String getGenero() {
			return this.genero;
		}
		
		//** Nivel Atividade**//
		
		public  void setNivelatividade(String nivelatividade) {
			
			if(getGenero().equals("Feminino")){
				if(getNivelatividade().equals("Leve")){
					this.nivelAtividade = String.valueOf(1.6);
				} else if(getNivelatividade().equals("Moderado")){
					this.nivelAtividade = String.valueOf(1.6);
				} else if(getNivelatividade().equals("Intensa")){
					this.nivelAtividade = String.valueOf(1.8);
				}
			}
			
			
			if(getGenero().equals("Masculino")){
				if(getNivelatividade().equals("Leve")){
					this.nivelAtividade = String.valueOf(1.5);
				} else if(getNivelatividade().equals("Moderado")){
					this.nivelAtividade = String.valueOf(1.8);
				} else if(getNivelatividade().equals("Intensa")){
					this.nivelAtividade = String.valueOf(2.1);
				}
			}
		}
		
		public String getNivelatividade() {
			return this.nivelAtividade;
		}

		//***IMC***/
		public double getImc() {
			return this.peso /(this.altura*this.altura);
		}
		
		public String getStatusImc() {
			if (this.getImc() < 18.5) {
				return "Abaixo do peso";
			}else if (this.getImc() > 18.6 && this.getImc() < 25) {
				return "Peso ideal";
			}else if (this.getImc() >=25 && this.getImc() < 30) {
				return "Levemente Acima do peso";
			}else if (this.getImc() >=30 && this.getImc() < 55) {
				return "Obesidade grau I";
			}else if (this.getImc() >= 35 && this.getImc() <= 40) {
				return "Obesidade grau II (Severa)";
			}else {
				return "Obesidade III (Morbida)";	
			}
	}
			//**Ncd**//
		
		
		
}
