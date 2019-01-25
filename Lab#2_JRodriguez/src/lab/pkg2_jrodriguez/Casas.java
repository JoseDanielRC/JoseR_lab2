package lab.pkg2_jrodriguez;

import java.awt.Color;

public class Casas {

    //: Numero de Casa, Numero de Bloque, Color, Ancho, Largo, Si ya fue comprada o no, Numero de Pisos, Numero de Baños, Numero de Cuartos, Nombre del dueño en caso de que ya fue comprada. Estado (Lista, En Construcción, Construcción en Espera, En Espera de Demolición) y Nombre del ingeniero a cargo.
    private int numero;
    private String color;
    private int bloque;
    private int ancho;
    private int largo;
    private boolean disponible;
    private int pisos, baños, cuartos;
    private String dueño, ingeniero, estados;
    private int estado;

    public Casas(int numero, String color, int bloque, int ancho, int largo, boolean disponible, int pisos, int baños, int cuartos, String dueño, String ingeniero, int estado) {
        this.numero = numero;
        this.color = color;
        this.bloque = bloque;
        this.ancho = ancho;
        this.largo = largo;
        this.disponible = disponible;
        this.pisos = pisos;
        this.baños = baños;
        this.cuartos = cuartos;
        this.dueño = dueño;
        this.ingeniero = ingeniero;
        this.estado = estado;
        if (estado == 1) {
            estados = "Lista";
        }
        if (estado == 2) {
            estados = "Construccion";

        }
        if (estado == 3) {
            estados = "En espera";
        }
        if (estado == 4) {
            estados = "Espera demolicion";
        }
    }
    
    public Casas() {
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

    public String getEstado() {
        return estados;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "numero de casa=" + numero + "\n"
                + "color=" + color + "\n"
                + "estado" + estados + "\n"
                + "largo=" + largo + "\n"
                + "ancho=" + ancho + "\n"
                + "Comprada="+disponible+"\n"
                + "Ingeniero="+ingeniero;
    }   


}
    //: Numero de Casa, Numero de Bloque, Color, Ancho, Largo, Si ya fue comprada o no, Numero de Pisos, Numero de Baños, Numero de Cuartos, Nombre del dueño en caso de que ya fue comprada. Estado (Lista, En Construcción, Construcción en Espera, En Espera de Demolición) y Nombre del ingeniero a cargo.
