package com.globallogic.clasesyobjetos_6_1;

import java.util.Comparator;


public class CompararEmpleados implements Comparator<Empleado>{
     
     public int compare(Empleado e1, Empleado e2){
        if(e1.calcularSueldo() < e2.calcularSueldo()){
            return -1;
        }else if(e1.calcularSueldo() < e2.calcularSueldo()){
            return 0;
        }else{
            return 1;
        }
    }
     
     
}