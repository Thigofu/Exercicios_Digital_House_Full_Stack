package com.zaleski;

public class TorreDeControle{
	
	private Voador[] voadores;

	public Voador[] getVoadores() {
		return voadores;
	}

	public void setVoadores(Voador[] voadores) {
		this.voadores = voadores;
	}

	public TorreDeControle(Voador[] voadores) {
		this.voadores = voadores;
	}	

	public void voemTodos() {
		for (Voador voador : voadores) {
			voador.voar();
		}
	}
}
