package com.appjsf.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.appjsf.model.Empresa;
import com.appjsf.model.TipoEmpesa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Empresa empresa = new Empresa();
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public TipoEmpesa[] getTiposEmpresa() {
		return TipoEmpesa.values();
	}
	
	public void salvar() {
		System.out.println("Razão social: " + this.getEmpresa().getRazaoSocial() + " - " + 
	"Nome Fantasia: " + this.getEmpresa().getNomeFantasia() + " - " +
				"Tipo Empresa: " + this.getEmpresa().getTipo());
	}
	
}
