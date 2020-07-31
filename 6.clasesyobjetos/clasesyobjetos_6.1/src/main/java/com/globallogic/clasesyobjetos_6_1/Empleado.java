package com.globallogic.clasesyobjetos_6_1;

public class Empleado extends Persona {

	private int ID;
	private String nombre;
	private double sueldoBase;
	private double horasExtraMes;
	private double tipoIRPF;
	private boolean casado;
	private int numeroHijos;
	static double importeHoraExtra;

	public Empleado() {

	}

	public int getID() {
		return this.ID;
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getSueldoBase() {
		return this.sueldoBase;
	}

	public double getHorasExtraMes() {
		return this.horasExtraMes;
	}

	public double getTipoIRPF() {
		return this.tipoIRPF;
	}

	public boolean getCasado() {
		return this.casado;
	}

	public int getNumeroHijos() {
		return this.numeroHijos;
	}

	public double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public void setHorasExtraMes(double horasExtraMes) {
		this.horasExtraMes = horasExtraMes;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}

	@Override
	public void caminar() {
		System.out.println("Estoy caminando");
	}

	@Override
	public void trabajar() {
		System.out.println("Estoy trabajando");
	}

	public double calculoHorasExtra() {
		return horasExtraMes * importeHoraExtra;
	}

	public double calculoSueldoBruto() {
		return sueldoBase + calculoHorasExtra();
	}

	public double calculoTipoIRPF() {

		if (casado) {
			return (calculoSueldoBruto() * (tipoIRPF - 2) / 100);
		}

		if (numeroHijos > 0) {
			return (calculoSueldoBruto() * (tipoIRPF - numeroHijos) / 100);
		}

		return 0;

	}

	public double calcularSueldo() {
		
		return calculoSueldoBruto() - calculoTipoIRPF();
		
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(ID);
		sb.append(nombre);
		sb.append("\nSueldo Base: ");
		sb.append(sueldoBase);
		sb.append("\nHoras Extras: ");
		sb.append(horasExtraMes);
		sb.append("\ntipo IRPF: ");
		sb.append(tipoIRPF);
		sb.append("\nCasado: ");
		sb.append(casado);
		sb.append("\nNúmero de Hijos: ");
		sb.append(numeroHijos);

		return sb.toString();
	}

	@Override
	public void mostrarDatos() {
		
	}
}
