package com;

public class Main2 {
    public static void main(String[] args) {
        UsuarioDto usuarioDto = new UsuarioDto("Daniel", "danielyosef777@gmail.com");
        System.out.println(usuarioDto.hashCode());

        UsuarioDto usuarioDto2 = new UsuarioDto("Yosef", "yosef@gmail.com");
        System.out.println(usuarioDto2.hashCode());

        if (usuarioDto.equals(usuarioDto2)) {
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos no son iguales");
        }
        
        UsuarioDto usuarioDto3 = usuarioDto;
        
        if (usuarioDto3.equals(usuarioDto)) {
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos no son iguales");
        }

    }
}
