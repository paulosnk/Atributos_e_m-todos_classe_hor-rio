public class Atributos_m�todos {
	private Byte hour;
	private Byte minute;
	private Byte second;
	
	public Atributos_m�todos() {}
	public Atributos_m�todos(Byte hour, Byte minute, Byte second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public Byte getHour() {
		return hour;
	}
	public void setHour(Byte hour) {
		this.hour = hour;
	}
	public Byte getMinute() {
		return minute;
	}
	public void setMinute(Byte minute) {
		this.minute = minute;
	}
	public Byte getSecond() {
		return second;
	}
	public void setSecond(Byte second) {
		this.second = second;
	}
}