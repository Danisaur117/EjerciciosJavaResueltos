package com.daniel.belmonte.Modulo2Actividad1;


/**
 * Clase BinaryArray que define la representación de una matriz de valores Boolean y los métodos
 * para acceder a estos valores
 * @author danisaur
 * @version 25/04/2019
 */
public class BinaryArray {
	private Boolean[] arr;
	private boolean hasNulls;
	
	/**
	 * Constructor por defecto de la clase BinaryArray
	 */
	public BinaryArray() {
		this.arr = null;
		this.hasNulls = true;
	}
	
	/**
	 * Constructor de la clase BinaryArray
	 * @param arrStr String:  Define la representación en formato String de la matriz de valores
	 * booleanos. Una 'F' representa el valor 'false' y una 'T' resperesenta el valor 'true'
	 */
	public BinaryArray(String arrStr) {
		this.arr = new Boolean[arrStr.length()];
		this.hasNulls = false;
		
		//Recorremos el String que se ha pasado como parámetro para inicializar la matriz a los
		//valores booleanos adecuados
		for(int i = 0; i < arrStr.length(); i++) {
			switch(arrStr.charAt(i)) {
				case 'F':{
					this.arr[i] = false;
					break;
				}
				case 'T':{
					this.arr[i] = true;
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
	
	/**
	 * Función getArr que devuelve el array arr que contiene la representación de la matriz de
	 * valores booleanos
	 * @return Boolean[] : Devuelve el atributo matriz de valores booleanos
	 */
	public Boolean[] getArr() {
		return arr;
	}
	
	/**
	 * Función setArr que establece como atributo arr un array de valores booleanos. Se chequerá
	 * finalmente si el array contiene algún valor nulo
	 * @param Boolean[] arr : Matriz de valores booleanos a establecer como atributo
	 */
	public void setArr(Boolean[] arr) {
		this.arr = arr;
		this.checkHasNulls();
	}
	
	/**
	 * Función getHasNulls que define si el atributo matriz de valores booleanos tiene o no nulos
	 * @return true : Si la matriz de valores booleanos tiene algún valor null
	 * 		   false: Si la matriz de valores booleanos no tiene ningún valor null
	 */
	public boolean getHasNulls() {
		return hasNulls;
	}
	
	/**
	 * Función checkHasNulls que comprueba si la matriz de valores booleanos tiene algún valor a
	 * null o no. Se establecerá el atributo hasNulls a true si tiene algún null, o false si no
	 * tiene nigún valor a null
	 */
	public void checkHasNulls() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				hasNulls = true;
				break;
			}
		}
	}
	
	/**
	 * Función setValueChar que establece el valor indicado en la posición indicada en la matriz de
	 * valores booleanos
	 * @param value Si es 'T', se establecerá el valor true en la posición index de la matriz arr.
	 * Si es 'F', se establecerá el valor false en la posición index de la matriz arr
	 * @param index Posición de la matriz arr en la que estableceremos el valor indicado en value
	 * @return Devolverá true si se ha establecido correctamente value en la posición index.
	 * Devolverá false en caso contrario o si index es mayor que el tamaño de la matriz de valores
	 * booleanos
	 */
	public boolean setValueChar(char value, int index) {
		if(index >= this.arr.length) return false;
		
		if(value == 'T') {
			this.arr[index] = true;
			this.checkHasNulls();
			return true;
		}
		
		if(value == 'F') {
			this.arr[index] = false;
			this.checkHasNulls();
			return true;
		}
		
		return false;
	}
	
	/**
	 * Función setValueBoolean que establece el valor indicado en la posición indicada en la matriz
	 * de valores booleanos
	 * @param value Se establecerá el valor value en la posición index de la matriz arr
	 * @param index Posición de la matriz arr en la que estableceremos el valor indicado en value
	 * @return Devolverá true si se ha establecido correctamente value en la posición index.
	 * Devolverá false en caso de que index sea mayor que el tamaño de la matriz de valores
	 * booleanos
	 */
	public boolean setValueBoolean(boolean value, int index) {
		if(index >= this.arr.length) return false;
		
		if(value) {
			this.arr[index] = true;
			this.checkHasNulls();
			return true;
		}else{
			this.arr[index] = false;
			this.checkHasNulls();
			return true;
		}
	}
	
	/**
	 * Función getValue que devuelve el valor booleano situado en la posición indicada en el array
	 * @param index int : Posición de la cual queremos obtener el valor booleano
	 * @return Boolean : Valor de la posición index del array de valores booleanos
	 */
	public Boolean getValue(int index) {
		if(index >= this.arr.length) return null;
		
		return this.arr[index];
	}
}
