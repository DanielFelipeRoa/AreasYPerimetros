/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas.y.perimetros;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class AreasYPerimetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De qué figura quiere capturar su area / perimetro?");
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Rectangulo");
        System.out.println("4. Triangulo");
        int opcion = sc.nextInt();
        int s;
        double n;
        double j;
        double z;
        double x;
        double a;
        switch (opcion) {
            case 1:
                System.out.println("¿Qué quiere calcular del cuadrado?");
                System.out.println("1. Area");
                System.out.println("2. Perimetro");
                s = sc.nextInt();
                switch (s) {
                    case 1:
                        System.out.println("Usted ha elegido calcular el área!");
                        System.out.println("Digíte el tamaño de un lado del cuadrado");
                        n = sc.nextDouble();
                        n = n * n;
                        System.out.println("El area del cuadrado es: " + n);
                        break;
                    case 2:
                        System.out.println("Usted ha elegido calcular el perimetro!");
                        System.out.println("Digíte el tamaño del lado del cuadrado");
                        j = sc.nextDouble();
                        j = j * 4;
                        System.out.println("El perimetro del cuadrado es: " + j);
                        break;
                    default:
                        System.out.println("No hagas trampa, esa opción no existe");
                        break;
                }
                     case 2:
                         System.out.println("¿Qué quiere calcular del circulo?");
                         System.out.println("1. Area");
                         System.out.println("2. Perimetro");
                         s = sc.nextInt();
                         switch (s) {
                            case 1:
                                System.out.println("Usted ha elegido calcular el área!");
                                System.out.println("Digíte el radio del circulo ");
                                n = sc.nextDouble();
                                n = ((3.14) * (n * n));
                                System.out.println("El area del circulo es: " + n);
                                break;
                            case 2:
                                System.out.println("Usted ha elegido calcular el perimetro!");
                                System.out.println("Digíte el radio del circulo");
                                j = sc.nextDouble();
                                j = (2 * (3.14) * (j));
                                System.out.println("El perimetro del circulo es: " + j);
                                break;
                            default:
                                System.out.println("No seas tramposo, esa opción no existe");
                        }
            case 3:
                System.out.println("¿Qué quiere calcular del rectangulo?");
                System.out.println("1. Area");
                System.out.println("2. Perimetro");
                s = sc.nextInt();
                switch(s){
                    case 1:
                        System.out.println("Usted ha elegido calcular el área!");
                        System.out.println("Digíte la base del rectangulo ");
                        n = sc.nextDouble();
                        System.out.println("Digite la altura del rectangulo ");
                        z = sc.nextDouble();
                        z = n*z;
                        System.out.println("El area del rectangulo es: " + z);
                        break;
                    case 2:
                            System.out.println("Usted ha elegido calcular el perimetro!");
                            System.out.println("Digíte la base del rectangulo");
                            j = sc.nextDouble();
                            System.out.println("Digíte la altura del rectangulo");
                            x = sc.nextDouble();
                            x = 2*(j+x);
                            System.out.println("El perimetro del rectangulo es: " + x);
                            break;
                    default:
                        System.out.println("Esta opción no existe, no seas tramposo");
                        break;
                }
            case 4:
                System.out.println("¿Qué quiere calcular del triangulo?");
                System.out.println("1. Area");
                System.out.println("2. Perimetro");
                s = sc.nextInt();
                switch (s){
                    case 1:
                        System.out.println("Usted ha elegido calcular el área!");
                        System.out.println("Digíte la base del traingulo ");
                        n = sc.nextDouble();
                        System.out.println("Digite la altura del triangulo ");
                        z = sc.nextDouble();
                        z = ((n*z)/2);
                        System.out.println("El area del triangulo es: " + z);
                        break;
                    case 2:
                            System.out.println("Usted ha elegido calcular el perimetro!");
                            System.out.println("Digíte el primer lado del triangulo");
                            j = sc.nextDouble();
                            System.out.println("Digíte el segundo lado del triangulo");
                            x = sc.nextDouble();
                            System.out.println("Digíte el tercer lado del triangulo");
                            a = sc.nextDouble();
                            a = (a+x+j);
                            System.out.println("El perimetro del rectangulo es: " + a);
                            break;
                    default:
                        System.out.println("No seas tramposo, esa opción no existe");
                        break;
                }
        }
    }

}
