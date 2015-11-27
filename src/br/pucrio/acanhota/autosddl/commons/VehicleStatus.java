package br.pucrio.acanhota.autosddl.commons;

import java.io.Serializable;

public class VehicleStatus implements Serializable {

	private static final long serialVersionUID = 199L;
	private int m_state;
	
	public VehicleStatus()
	{
		m_state = 0;
	}
	
	public String toString()
	{
		if(m_state == 0)
			return "Ping!";
		else
			return "Pong!";
	}
	
	public void changeState()
	{
		m_state++;
		if(m_state > 1)
			m_state = 0;
	}
}