package br.pucrio.acanhota.autosddl.commons;

import java.io.Serializable;

public class VehicleMessage implements Serializable {

	private static final long serialVersionUID = 199L;
	private int m_state;
	private VehicleMessageType type;
	
	public VehicleMessage(VehicleMessageType type)
	{
		this.type = type;
		m_state = 0;
	}
	
	public String toString()
	{
		if(m_state == 0)
			return type + " Ping!";
		else
			return type + " Pong!";
	}
	
	public void changeState()
	{
		m_state++;
		if(m_state > 1)
			m_state = 0;
	}
}