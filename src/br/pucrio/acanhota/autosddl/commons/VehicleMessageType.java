package br.pucrio.acanhota.autosddl.commons;

public enum VehicleMessageType {
	
	START("Application started"),
	STATUS("Vehicle status"),
	END("Application finished"),
	;	
	
	private String description;
	
	VehicleMessageType (String description) {
		this.description = description;
	}

	public String toString() {
		return description;
	}
	
}
