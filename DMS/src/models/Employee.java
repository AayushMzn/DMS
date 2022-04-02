/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Employee {
	private int e_id;
	private String e_name;
	private String e_phone;
	private String e_address;
	public Employee(int e_id, String e_name, String e_phone, String e_address) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_phone = e_phone;
		this.e_address = e_address;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getPhone_num() {
		return e_phone;
	}
	public void setPhone_num(String e_phone) {
		this.e_phone = e_phone;
	}
	public String getE_address() {
		return e_address;
	}
	public void setE_address(String e_address) {
		this.e_address = e_address;
	}
	
}
