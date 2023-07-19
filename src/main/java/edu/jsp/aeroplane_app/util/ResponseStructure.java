package edu.jsp.aeroplane_app.util;

public class ResponseStructure <G> {//generics

	private int status;
	private String message;
	private G data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public G getData() {
		return data;
	}
	public void setData(G data) {
		this.data = data;
	}
	
}
