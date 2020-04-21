package SerializationApi;

import java.io.Serializable;

public class Ogrenci implements Serializable {
	
	private String isim;
	private int id;
	private String bolum;
	public Ogrenci(String isim, int id, String bolum) {
		
		this.isim = isim;
		this.id = id;
		this.bolum = bolum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String bilgiler = "Ogrenci ismi: " + isim + 
							"\nOgrenci numarasi:" + id +
							"\nOgrenci Bolum:" + bolum;
		return bilgiler;
		
	}
	
	
}
