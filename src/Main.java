import java.util.ArrayList;
import java.util.Scanner;


public class  Main {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> usuarios = new ArrayList<>();

    public void main(String[] args) {
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Elige una opción");
            System.out.println("0 - Sortir");
            System.out.println("1 - Abrir gestión de usuarios");
            System.out.println("2 - Veure estat del sistema");
            System.out.println("---------------------------------");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    return;
                case 1:
                    obrirSubmenuUsuaris(usuarios);
                    break;
                case 2:
                    System.out.println("Estado: Corrupto");
                    break;
                default:
                    System.out.println("Opción no valida yaguete");
            }
        }
    }

    public void obrirSubmenuUsuaris(ArrayList usuarios) {
        while (true) {
            System.out.println("*-------------------------------*");
            System.out.println("0 - Volver");
            System.out.println("1 - Listar usuarios");
            System.out.println("2 - Añadir usuario");
            System.out.println("*-------------------------------*");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                   System.out.println(usuarios);
                   break;
                case 2:
                    System.out.println("Escriba el nombre del usuario");
                    String usuari = sc.next();
                    usuarios.add(usuari);
                    System.out.println("Usuario creado correctamente");
                    break;
                case 0:
                    return;
            }
        }
    }


}
