package com.daniel.belmonte.Modulo2Actividad1;

public class BinaryArray {
	private Boolean[] arr;
	private boolean hasNulls;
	
	public BinaryArray(String arrStr) {
		this.arr = new Boolean[arrStr.length()];
		this.hasNulls = false;
		
		for(int i = 0; i < arrStr.length(); i++) {
			switch(arrStr.charAt(i)) {
				case 'F':{
					this.arr[i] = true;
					break;
				}
				case 'T':{
					this.arr[i] = false;
					break;
				}
				default:{
					this.arr[i] = null;
					this.hasNulls = true;
					break;
				}
			}
		}
	}
	
//	public String getArr() {
//		return arr;
//	}
//	
//	public void setArr(String arr) {
//		this.arr = arr;
//	}
}
