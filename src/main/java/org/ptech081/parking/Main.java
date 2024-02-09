package org.ptech081.parking;
import org.ptech081.parking.entities.*;
public class Main {
    public static void main(String[] args) {
        
        //crear carros con lso constructores:
        Carro carrito1 = new Carro("ABC 123", TipoVehiculo.Moto);
        Carro carritotunning = new Carro ();
        carritotunning.placa = "RRT 345";
        carritotunning.tipoVehiculo = TipoVehiculo.Camioneta;

        //crear clientes

        Cliente cliente1 = new Cliente("Santiago", "Lopez", 12345L);

        //invocar el metodo addCar:

        cliente1.addCar(carritotunning);
        cliente1.addCar("XLL 666", TipoVehiculo.Sedan);

        //recorrer los carros del cliente

        for( Carro c : cliente1.misCarros){
            System.out.println(c.placa + "" + c.tipoVehiculo);
            System.out.println("-------------------");
        }



    }
}