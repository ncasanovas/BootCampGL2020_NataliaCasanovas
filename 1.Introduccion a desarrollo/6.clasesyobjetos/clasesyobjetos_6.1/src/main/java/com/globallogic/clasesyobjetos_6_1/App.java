package com.globallogic.clasesyobjetos_6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

	static Scanner entrada = new Scanner(System.in);

	static Empleado empleado;
	static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(20);

	static int indice = 0;

	public static void main(String[] args) {

		System.out.println("Ingrese la cantidad de empleados. Numero maximo 20 empleados");
		int cantidadEmpleados = entrada.nextInt();

		agregarEmpleados(cantidadEmpleados);
		
		mostrarCobros(cantidadEmpleados);
		
		
	}

	
	
	public static void agregarEmpleados(int cantidadEmpleados) {
		
		Scanner entradaEmpleado = new Scanner(System.in);
		try {
			for (int i = 0; i <= cantidadEmpleados; i++) {
				System.out.println("Ingrese el ID");
				int id = entradaEmpleado.nextInt();
				empleado.setID(id);
				System.out.println("Ingrese el nombre");
				empleado.setNombre(entradaEmpleado.nextLine());
				System.out.println("Ingrese el sueldo base");
				empleado.setSueldoBase(entrada.nextDouble());
				System.out.println("Ingrese las horas extra del mes");
				empleado.setHorasExtraMes(entrada.nextDouble());
				System.out.println("Ingrese el numero de hijos");
				empleado.setNumeroHijos(entrada.nextInt());
				System.out.println("Ingrese el importe de la hora extra");
				empleado.setImporteHoraExtra(entrada.nextDouble());

				listaEmpleados.add(empleado);

				indice++;
			}
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}

	}
	
	public static void mostrarCobros(int cantidadEmpleados) {
		
		if (cantidadEmpleados > 0) {

			System.out.println("\n\nCantidad empleados ");
			System.out.println(cantidadEmpleados);

			empleado = empleadoQueMasCobra();
			System.out.println("\n\nEmpleado que más cobra:");
			System.out.println(empleado);
			System.out.printf("Sueldo: %.2f € %n", empleado.calcularSueldo());

			empleado = empleadoQueMenosCobra();
			System.out.println("\n\nEmpleado que menos cobra:");
			System.out.println(empleado);
			System.out.printf("Sueldo: %.2f € %n", empleado.calcularSueldo());

			empleado = empleadoQueMasCobraPorHorasExtras();
			System.out.println("\n\nEmpleado que más cobra por horas extras:");
			System.out.println(empleado);
			System.out.printf("Total horas extras: %.2f €", empleado.calculoHorasExtra());

			empleado = empleadoQueMenosCobraPorHorasExtras();
			System.out.println("\n\nEmpleado que menos cobra por horas extras:");
			System.out.println(empleado);
			System.out.printf("Total horas extras: %.2f €", empleado.calculoHorasExtra());

			ordenarPorSalario();
			System.out.println("\n\nEmpleados ordenados por salario:");
			mostrarEmpleadosYSalarios();
		}

	}

	public static void mostrarEmpleados() {

		for (Empleado e : listaEmpleados) {

			System.out.println(e);

		}

	}

	// Método que devuelve el empleado que más cobra
	public static Empleado empleadoQueMasCobra() {

		Empleado mayor = null;

		for (Empleado e : listaEmpleados) {
			if (e.calcularSueldo() > e.calcularSueldo()) {
				mayor = e;

			}
		}

		return mayor;

	}

	// Método que devuelve el empleado que menos cobra
	public static Empleado empleadoQueMenosCobra() {

		Empleado menor = null;

		for (Empleado e : listaEmpleados) {
			if (e.calcularSueldo() < e.calcularSueldo()) {
				menor = e;

			}
		}

		return menor;

	}

	// método que devuelve el empleado que más cobra por horas extra
	public static Empleado empleadoQueMasCobraPorHorasExtras() {

		Empleado mayor = null;

		for (Empleado e : listaEmpleados) {
			if (e.getImporteHoraExtra() > e.getImporteHoraExtra()) {
				mayor = e;

			}
		}

		return mayor;
	}

	// método que devuelve el empleado que menos cobra por horas extra
	public static Empleado empleadoQueMenosCobraPorHorasExtras() {

		Empleado menor = null;

		for (Empleado e : listaEmpleados) {
			if (e.getImporteHoraExtra() < e.getImporteHoraExtra()) {
				menor = e;

			}
		}

		return menor;
	}

	// Método para ordenar todos los empleados por su salario de menor a mayor
	public static void ordenarPorSalario() {

		Collections.sort(listaEmpleados, new CompararEmpleados());

	}

	// método para mostrar los datos de cada empleado junto con su sueldo
	public static void mostrarEmpleadosYSalarios() {

		for (Empleado e : listaEmpleados) {

			System.out.println(e);
			System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());
		}
	}

}
