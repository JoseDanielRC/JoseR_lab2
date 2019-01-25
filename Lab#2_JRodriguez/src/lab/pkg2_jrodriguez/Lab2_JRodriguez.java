package lab.pkg2_jrodriguez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2_JRodriguez {

    static Scanner lea = new Scanner(System.in);
    static boolean disponible = false;

    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Usuario:");
        String contraseña = JOptionPane.showInputDialog("Contraseña:");
        while (!contraseña.equals("99") && !usuario.equals("leobanegas")) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
            usuario = JOptionPane.showInputDialog("Usuario:");
            contraseña = JOptionPane.showInputDialog("Contraseña:");
        }
        ArrayList casas = new ArrayList();
        int opcion = 0;
        while (opcion != 3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Registro casas\n"
                    + "2-Manejo Estados\n"
                    + "3- Salir"));
            if (opcion == 1) {
                System.out.println("1-crear casas");
                System.out.println("2-listar casas");
                System.out.println("3-Modificar casas");
                System.out.println("4-Borrar casas");
                int oppcion = lea.nextInt();
                switch (oppcion) {
                    case 1:
                        System.out.println("numero de casa:");
                        int numero = lea.nextInt();
                        System.out.println("color:");
                        String color = lea.next();
                        System.out.println("bloque:");
                        int bloque = lea.nextInt();
                        System.out.println("ancho:");
                        int ancho = lea.nextInt();
                        System.out.println("largo:");
                        int largo = lea.nextInt();
                        System.out.println("Comprada(s/n)");
                        String respuesta = lea.next();
                        if (respuesta == "s" || respuesta == "S") {
                            boolean disponible = true;
                        }
                        else{
                            boolean disponible=false;
                                    
                        }
                        System.out.println("pisos:");
                        int pisos = lea.nextInt();
                        System.out.println("baños:");
                        int baños = lea.nextInt();
                        System.out.println("cuartos:");
                        int cuartos = lea.nextInt();
                        String dueño = "disponible";
                        if (disponible = true) {
                            System.out.println("Nombre de dueño:");
                            dueño = lea.next();
                        }
                        System.out.println("Ingeniero:");
                        String ingeniero = lea.next();
                        System.out.println("estado:");
                        System.out.println("1.Lista ");
                        System.out.println("2.En construccion");
                        System.out.println("3.En espera");
                        System.out.println("4. En demolicion");
                        int estado = lea.nextInt();

                        /*"numero de casa=" + numero + "\n"
                + "color=" + color + "\n"
                + "estado" + estados + "\n"
                + "largo=" + largo + "\n"
                + "ancho=" + ancho + "\n"
                + "Comprada="+disponible+"\n"
                + "Ingeniero="+ingeniero;*/
                        casas.add(new Casas(numero, color, bloque, ancho, largo, disponible, pisos, baños, cuartos, dueño, ingeniero, estado));
                        break;
                    case 2:
                        String s = "";
                        for (Object t : casas) {
                            s += casas.indexOf(t) + "- " + t + "\n";
                            System.out.println(s);
                        }
                        break;
                    case 3:
                        int p,
                         l;
                        System.out.println("posicion a modificar");
                        p = lea.nextInt();
                        System.out.println("Escriba el detalle que desea modificar\n"
                                + "1-numero de casa\n"
                                + "2-color\n"
                                + "3-estado\n"
                                + "4-largo\n"
                                + "5-ancho\n"
                                + "6-Comprada\n"
                                + "7-Ingeniero");
                        int seleccion = lea.nextInt();
                        switch (seleccion) {
                            case 1:
                                System.out.println("nuevo numero");
                                l = lea.nextInt();
                                if (casas.get(p) instanceof Casas) {
                                    ((Casas) casas.get(p)).setNumero(l);

                                }
                                break;
                            case 2:
                                System.out.println("nuevo color");
                                String colorc = lea.next();
                                if (casas.get(p) instanceof Casas) {
                                    ((Casas) casas.get(p)).setColor(colorc);

                                }
                                break;
                            case 3:
                                System.out.println("nuevo estado\n"
                                        + "1.Lista\n"
                                        + "2.En construccion\n"
                                        + "3.Espera de construccion\n"
                                        + "4.espera demolicion");
                                l = lea.nextInt();
                                if (casas.get(p) instanceof Casas) {
                                    ((Casas) casas.get(p)).setEstado(l);

                                }
                                break;
                            case 4:
                                System.out.println("nuevo Largo");
                                l = lea.nextInt();
                                if (casas.get(p) instanceof Casas) {
                                    ((Casas) casas.get(p)).setLargo(l);

                                }
                                break;
                            case 5:
                                System.out.println("nuevo Ancho");
                                l = lea.nextInt();
                                if (casas.get(p) instanceof Casas) {
                                    ((Casas) casas.get(p)).setAncho(l);

                                }
                                break;
                            case 6:
                                System.out.println("La casa ha sido comprada?(s/n)");
                                String res = lea.next();
                                if (res == "s" | res == "S") {
                                    disponible = false;
                                }
                                if (casas.get(p) instanceof Casas) {
                                    ((Casas) casas.get(p)).setDisponible(disponible);

                                }
                                break;
                            case 7:
                                System.out.println("nuevo Nombre de Ingeniero");
                                colorc = lea.next();
                                if (casas.get(p) instanceof Casas) {
                                    ((Casas) casas.get(p)).setIngeniero(colorc);

                                }
                                break;
                        }

                        break;
                    case 4:
                        int r;
                        System.out.println("posicion a eliminar");
                        p = lea.nextInt();
                        r = JOptionPane.showConfirmDialog(null, "esta seguro");
                        if (r == 0) {
                            casas.remove(p);
                            break;
                        }
                }
            }
            if (opcion == 2) {
                for (int t = 0; t < casas.size(); t++) {
                    System.out.println("#" + ((Casas) casas.get(t)).getNumero() + "\n"
                            + "" + ((Casas) casas.get(t)).getEstado());
            
                    }
            }
            if (opcion == 3) {
                System.exit(0);

            }
        }
    }

}
