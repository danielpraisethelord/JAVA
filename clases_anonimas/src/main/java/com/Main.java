package com;

public class Main {
    public static void main(String[] args) {
        new Vehiculo(){
            private int numeroPasajeros;

            public void conducir () {
                System.out.println("Estoy conduciendo");
            }
        }.conducir();

        UsuarioServicio usuarioServicio = new UsuarioServicio() {
            @Override
            public void crearUsuario() {
                System.out.println("Creando usuario");
            }

            public void obtenerUsuario() {
            
            }
        };

        usuarioServicio.crearUsuario();

        claseAnonimaVehiculo(new Vehiculo(){

        });
        
        claseAnonimaIntefaz(new UsuarioServicio() {
            @Override
            public void crearUsuario() {
                
            }
        });
    
    }

    public static void claseAnonimaVehiculo(Vehiculo verVehiculo) {

    }

    public static void claseAnonimaIntefaz(UsuarioServicio usuarioServicio) {

    }
}