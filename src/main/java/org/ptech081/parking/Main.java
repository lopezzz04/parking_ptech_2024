package org.ptech081.parking;
import org.ptech081.parking.entities.*;

import java.nio.channels.NetworkChannel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //crear carros con lso constructores:
        Carro carrito1 = new Carro("ABC 123", TipoVehiculo.Moto);
        Carro carritotunning = new Carro ();
        carritotunning.placa = "RRT 345";
        carritotunning.tipoVehiculo = TipoVehiculo.Camioneta;

        //crear clientes

        Cliente cliente1 = new Cliente("Santiago", "Lopez", 12345L);
        Cliente cliente2 = new Cliente("Michael", "Cuta", 54321L);


        //crear empleado

        Empleado empleado1 = new Empleado("Jorge", 12345L);

        //invocar el metodo addCar:

        cliente1.addCar(carritotunning);
        cliente1.addCar("XLL 666", TipoVehiculo.Sedan);

        //Crear dos cupos
        Cupo cupo1 = new Cupo('A');
        Cupo cupo2 = new Cupo('B');

        //Crear dos registros   E/S
         LocalDate fechaInicio = LocalDate.now();
         LocalTime horaInicio = LocalTime.now();
         LocalDate fechaFin = LocalDate.of(2024 , Month.MAY, 24);
         LocalTime horaFin = LocalTime.of(11,30,00);

        List<Registro> misRegistros = new ArrayList<Registro>();

        //Creo el registro

         Registro registro1 = new Registro( fechaInicio , horaInicio , fechaFin , horaFin , 5000L , cupo1 , cliente1.misCarros.get(0) , cliente1 , empleado1);

         //Registro nuevo

         LocalDate fechaInicio2 = LocalDate.now();
         LocalTime horaInicio2 = LocalTime.now();
         LocalDate fechaFin2 = LocalDate.of(2025 , Month.SEPTEMBER, 30);
         LocalTime horaFin2 = LocalTime.of(17,45,00);

         Registro registro2 = new Registro( fechaInicio2 , horaInicio2 , fechaFin2 , horaFin2 , 50000L , cupo2 , cliente1.misCarros.get(0) , cliente1, empleado1);

         //Añadir el registro a la lista

         misRegistros.add(registro1);
         misRegistros.add(registro2);

         System.out.println("Registros de E/S parking");

         for(Registro r : misRegistros){

            System.out.println("Cliente:" + r.cliente.nombres + " " + r.cliente.apellidos + "|" + r.carro.placa + " " + r.carro.tipoVehiculo + "|" + r.valor + "|" + r.fechaInicio + "|" + r.horaInicio + "|" + r.empleado.nombre + "|" + r.empleado.codigo);

            System.out.println("Empleado:" + r.empleado.nombre + "|" + "Codigo Empleado:" + r.empleado.codigo);

         }

         

        



    }
}