package com.evergent.CoreJava.Beans;
import java.io.Serializable;

public class Product implements Serializable{
		private int pno;
		private String pName;
		private double price;
		
		public void setPno(int pno) {
			this.pno = pno;
		}
		public int getPno() {
			return pno;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public String getpName() {
			return pName;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getPrice() {
			return price;
		}
		
}
		