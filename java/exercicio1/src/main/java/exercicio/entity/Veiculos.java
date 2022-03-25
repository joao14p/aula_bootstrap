package exercicio.entity;

import java.io.Serializable;

public class Veiculos implements Serializable{
	private static final long serialVersionUID = 1L;

	private String modelo;
	
	private String placa;
	
	private Double consumoEtanol;
	
	private Double consumoGasolina;
	
	private Double capacidade;
	
	public Veiculos() {
		
	}
	public Veiculos(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}

	public Veiculos(String modelo, Double consumoEtanol, Double consumoGasolina, Double capacidade) {
		super();
		this.modelo = modelo;
		this.consumoEtanol = consumoEtanol;
		this.consumoGasolina = consumoGasolina;
		this.capacidade = capacidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Double getConsumoEtanol() {
		return consumoEtanol;
	}

	public void setConsumoEtanol(Double consumoEtanol) {
		this.consumoEtanol = consumoEtanol;
	}

	public Double getConsumoGasolina() {
		return consumoGasolina;
	}

	public void setConsumoGasolina(Double consumoGasolina) {
		this.consumoGasolina = consumoGasolina;
	}

	public Double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Double capacidade) {
		this.capacidade = capacidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Veiculos [modelo=" + modelo + ", placa=" + placa + ", consumoEtanol=" + consumoEtanol
				+ ", consumoGasolina=" + consumoGasolina + ", capacidade=" + capacidade + "]";
	}

	
	
}
