package com.ecodeup.carrito.modulos;
import java.math.BigDecimal;

public class Users {
	private Integer id;
	private String name;
	private String email;
	private boolean activate;

public Users() {
	
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public boolean isActivate() {
	return activate;
}

public void setActivate(boolean activate) {
	this.activate = activate;
}
}
