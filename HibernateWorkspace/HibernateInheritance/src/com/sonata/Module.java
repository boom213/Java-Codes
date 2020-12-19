package com.sonata;

import javax.persistence.Entity;

@Entity
public class Module extends Project{
	private String ModuleName;

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
	

}

