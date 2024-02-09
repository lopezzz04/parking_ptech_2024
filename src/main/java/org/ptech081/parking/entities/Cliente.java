package org.ptech081.parking.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

        public String nombres;
        public String apellidos;
        public Long identificacion;
        public List <Carro> misCarros;

        public Cliente() {
            this.misCarros = new ArrayList<Carro>();
        }

        public Cliente(String nombres, String apellidos, Long identificacion) {
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.identificacion = identificacion;
            this.misCarros = new ArrayList<Carro>();
        }

        //primera sobrecarga de addcar

        public void addCar(Carro car) {
            this.misCarros.add(car);
        }

        //segunda sobrecga de addcar

        public void addCar(String placa, TipoVehiculo tv) {
            Carro car = new Carro(placa,  tv);
            this.misCarros.add(car);
        }

        

        


}
