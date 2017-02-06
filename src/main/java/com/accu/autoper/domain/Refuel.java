package com.accu.autoper.domain;

public class Refuel {

	private Integer carKey;
	private Integer gasStationKey;
	private Float liters;
	private Float price;
	private Float kilometers;

	public Refuel(Integer carKey, Integer gasStationKey, Float liters,
			Float price, Float kilometers) {
		this.carKey = carKey;
		this.gasStationKey = gasStationKey;
		this.liters = liters;
		this.price = price;
		this.kilometers = kilometers;
	}

	public Integer getCarKey() {
		return carKey;
	}

	public void setCarKey(Integer carKey) {
		this.carKey = carKey;
	}

	public Integer getGasStationKey() {
		return gasStationKey;
	}

	public void setGasStationKey(Integer gasStationKey) {
		this.gasStationKey = gasStationKey;
	}

	public Float getLiters() {
		return liters;
	}

	public void setLiters(Float liters) {
		this.liters = liters;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getKilometers() {
		return kilometers;
	}

	public void setKilometers(Float kilometers) {
		this.kilometers = kilometers;
	}

}
