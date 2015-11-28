package br.pucrio.acanhota.autosddl.commons;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VehicleMessage implements Serializable {

	private static final long serialVersionUID = 199L;
	private int m_state;
	private Date createdAt;
	private VehicleMessageType type;
	private boolean obd2Connected;
	
	public VehicleMessage(VehicleMessageType type, boolean obd2Connected)
	{
		this.createdAt = now();
		this.type = type;
		this.obd2Connected = obd2Connected;
		m_state = 0;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("createdAt = '" + getCreatedAtAsStr() + "'").append(", ");
		sb.append("type = " + type + "").append(", ");
		sb.append("obd2Connected = " + obd2Connected + "").append(", ");
		sb.append("m_state = '" + (m_state == 0 ? "Ping!" : "Pong!") + "'");
		sb.append("]");
		return sb.toString();

	}
	
	public void changeState()
	{
		m_state++;
		if(m_state > 1)
			m_state = 0;
	}
	
	private Date now() {
		Calendar cal = Calendar.getInstance(); 
		return (Date) cal.getTime();
	}
	
	public String getCreatedAtAsStr() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return df.format(createdAt);
	}
}