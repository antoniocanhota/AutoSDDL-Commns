package br.pucrio.acanhota.autosddl.commons;

import java.io.Serializable;
import java.util.UUID;

public class Subscriber implements Serializable {
	private static final long serialVersionUID = 2075430186062896384L;
	private UUID uuid;
	private String licensePlate;

	public Subscriber(UUID uuid, String licensePlate) {
		this.uuid = uuid;
		this.licensePlate = licensePlate;
	}
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	@Override
	public String toString() {
		return "[uuid = "+uuid+", licensePlate = " + licensePlate + "]";
	}
}
