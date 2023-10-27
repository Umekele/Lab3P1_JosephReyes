package lab3p1_josphreyes;

import java.util.Scanner;

public class Lab3P1_JosphReyes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar;
        do {
            System.out.println("-------------- Menu --------------");
            System.out.println("1. Sucesiones");
            System.out.println("2. Pocket Monsters");
            System.out.println("3. Asterisco en casa");
            System.out.println("4. Salir");
            continuar = scanner.nextInt();
            switch (continuar) {
                case 1:
                    System.out.println("Entrando a Sucesiones...");
                    int inicial,
                     a,
                     diferencia,
                     d,
                     cantidad,
                     n;
                    System.out.println("Ingresar un numero inicial: ");
                    a = scanner.nextInt();
                    inicial = a;
                    System.out.println("Ingresar la diferencia: ");
                    d = scanner.nextInt();
                    diferencia = d;
                    System.out.println("Ingresar la cantidad: ");
                    cantidad = scanner.nextInt();
                    System.out.println("Diferencia: " + d);
                    System.out.println("Inicial: " + a);
                    System.out.println("Cantidad: " + cantidad);
                    for (int i = 0; i < cantidad; i++) {
                        if (i == 0) {
                            System.out.print(a + ", ");
                        } else if (i + 1 == cantidad) {
                            System.out.println(a + d);
                        } else {
                            a = a + d;
                            d = d + 1;
                            System.out.print(a + ", ");
                        }
                    }
                    System.out.print("Que numero desea ver mas adelante en la sucesion? ");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (i == 0) {
                        } else if (i + 1 == n) {
                            System.out.println("El numero seria: " + (inicial + diferencia));
                        } else {
                            inicial = inicial + diferencia;
                            diferencia = diferencia + 1;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Entrando a Pocket Monsters...");
                    int modo, versus, ataque1, ataque2;
                    double vida1, vida2, defensa1, defensa2;
                    System.out.println("Ingrese que modo de pelea de pokemon desea: ");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.- Por rondas");
                    modo = scanner.nextInt();
                    if (modo == 1) {
                        System.out.println("Estadisticas de los pokemones");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                            System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                            System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");

                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Sylveon vrs Dragonite");
                            System.out.println("2.- Gyarados vrs Giratina");
                            System.out.println("3.- Dragonite vrs Giratina");
                            System.out.println("4.- Giratina vrs Sylveon");
                            versus = scanner.nextInt();
                            switch (versus) {
                                case 1:
                                    vida1 = 280;
                                        ataque1 = 80;
                                        defensa1 = 0.15;
                                        vida2 = 250;
                                        ataque2 = 75;
                                        defensa2 = 0.20;
                                    for (int i = 1; i < 999; i++) {
                                        System.out.println("----------------- Ronda "+i +" -----------------");
                                        
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);
                                        
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-(ataque2-ataque2*defensa1);
                                        vida2=vida2-(ataque1-ataque1*defensa2);
                                        if (vida1<=0) {
                                            System.out.println("Vida de pokemon 1: 0.0");
                                            System.out.println("Vida de pokemon 2:" +vida2);
                                            i=999;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 2 Ha sido el ganador!");
                                        } else if (vida2<=0) {
                                            System.out.println("Vida de pokemon 1:" +vida1);
                                            System.out.println("Vida de pokemon 2: 0.0");
                                            i=999;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 1 Ha sido el ganador!");
                                        } else {
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);    
                                        }
                                    }
                                break;
                                case 2:
                                    vida1 = 300;
                                        ataque1 = 50;
                                        defensa1 = 0.10;
                                        vida2 = 300;
                                        ataque2 = 70;
                                        defensa2 = 0.25;
                                    for (int i = 1; i < 999; i++) {
                                        System.out.println("----------------- Ronda "+i +" -----------------");
                                        
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);
                                        
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-(ataque2-ataque2*defensa1);
                                        vida2=vida2-(ataque1-ataque1*defensa2);
                                        if (vida1<=0) {
                                            System.out.println("Vida de pokemon 1: 0.0");
                                            System.out.println("Vida de pokemon 2:" +vida2);
                                            i=999;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 2 Ha sido el ganador!");
                                        } else if (vida2<=0) {
                                            System.out.println("Vida de pokemon 1:" +vida1);
                                            System.out.println("Vida de pokemon 2: 0.0");
                                            i=999;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 1 Ha sido el ganador!");
                                        } else {
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);    
                                        }
                                    }
                                break;
                                case 3:
                                    vida1 = 250;
                                        ataque1 = 75;
                                        defensa1 = 0.20;
                                        vida2 = 300;
                                        ataque2 = 70;
                                        defensa2 = 0.25;
                                    for (int i = 1; i < 999; i++) {
                                        System.out.println("----------------- Ronda "+i +" -----------------");
                                        
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);
                                        
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-(ataque2-ataque2*defensa1);
                                        vida2=vida2-(ataque1-ataque1*defensa2);
                                        if (vida1<=0) {
                                            System.out.println("Vida de pokemon 1: 0.0");
                                            System.out.println("Vida de pokemon 2:" +vida2);
                                            i=999;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 2 Ha sido el ganador!");
                                        } else if (vida2<=0) {
                                            System.out.println("Vida de pokemon 1:" +vida1);
                                            System.out.println("Vida de pokemon 2: 0.0");
                                            i=999;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 1 Ha sido el ganador!");
                                        } else {
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);    
                                        }
                                    }
                                break;
                                case 4:
                                    vida1 = 300;
                                        ataque1 = 70;
                                        defensa1 = 0.25;
                                        vida2 = 280;
                                        ataque2 = 80;
                                        defensa2 = 0.15;
                                    for (int i = 1; i < 999; i++) {
                                        System.out.println("----------------- Ronda "+i +" -----------------");
                                        
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);
                                        
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-(ataque2-ataque2*defensa1);
                                        vida2=vida2-(ataque1-ataque1*defensa2);
                                        if (vida1<=0) {
                                            System.out.println("Vida de pokemon 1: 0.0");
                                            System.out.println("Vida de pokemon 2:" +vida2);
                                            i=999;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 2 Ha sido el ganador!");
                                        } else if (vida2<=0) {
                                            System.out.println("Vida de pokemon 1:" +vida1);
                                            System.out.println("Vida de pokemon 2: 0.0");
                                            i=999;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 1 Ha sido el ganador!");
                                        } else {
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);    
                                        }
                                    }
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } else if (modo == 2) {
                            System.out.println("Estadisticas de los pokemones");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                            System.out.println("Dragonite Vida:300 Ataque:70 Defensa:25%");
                            System.out.println("Giratina Vida:250 Ataque:75 Defensa:20%");

                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Sylveon vrs Dragonite");
                            System.out.println("2.- Gyarados vrs Giratina");
                            System.out.println("3.- Dragonite vrs Giratina");
                            System.out.println("4.- Giratina vrs Sylveon");
                            versus = scanner.nextInt();
                            switch (versus) {
                                case 1:
                                    vida1 = 280;
                                        ataque1 = 80;
                                        defensa1 = 0.15;
                                        vida2 = 250;
                                        ataque2 = 75;
                                        defensa2 = 0.20;
                                    for (int i = 1; i < 10; i++) {
                                        System.out.println("----------------- Ronda "+i +" -----------------");
                                        
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);
                                        
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-(ataque2-ataque2*defensa1);
                                        vida2=vida2-(ataque1-ataque1*defensa2);
                                        if (vida1<=0) {
                                            System.out.println("Vida de pokemon 1: 0.0");
                                            System.out.println("Vida de pokemon 2:" +vida2);
                                            i=10;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 2 Ha sido el ganador!");
                                        } else if (vida2<=0) {
                                            System.out.println("Vida de pokemon 1:" +vida1);
                                            System.out.println("Vida de pokemon 2: 0.0");
                                            i=10;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 1 Ha sido el ganador!");
                                        } else {
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);    
                                        }
                                    }
                                break;
                                case 2:
                                    vida1 = 300;
                                        ataque1 = 50;
                                        defensa1 = 0.10;
                                        vida2 = 300;
                                        ataque2 = 70;
                                        defensa2 = 0.25;
                                    for (int i = 1; i < 10; i++) {
                                        System.out.println("----------------- Ronda "+i +" -----------------");
                                        
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);
                                        
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-(ataque2-ataque2*defensa1);
                                        vida2=vida2-(ataque1-ataque1*defensa2);
                                        if (vida1<=0) {
                                            System.out.println("Vida de pokemon 1: 0.0");
                                            System.out.println("Vida de pokemon 2:" +vida2);
                                            i=10;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 2 Ha sido el ganador!");
                                        } else if (vida2<=0) {
                                            System.out.println("Vida de pokemon 1:" +vida1);
                                            System.out.println("Vida de pokemon 2: 0.0");
                                            i=10;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 1 Ha sido el ganador!");
                                        } else {
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);    
                                        }
                                    }
                                break;
                                case 3:
                                    vida1 = 250;
                                        ataque1 = 75;
                                        defensa1 = 0.20;
                                        vida2 = 300;
                                        ataque2 = 70;
                                        defensa2 = 0.25;
                                    for (int i = 1; i < 10; i++) {
                                        System.out.println("----------------- Ronda "+i +" -----------------");
                                        
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);
                                        
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-(ataque2-ataque2*defensa1);
                                        vida2=vida2-(ataque1-ataque1*defensa2);
                                        if (vida1<=0) {
                                            System.out.println("Vida de pokemon 1: 0.0");
                                            System.out.println("Vida de pokemon 2:" +vida2);
                                            i=10;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 2 Ha sido el ganador!");
                                        } else if (vida2<=0) {
                                            System.out.println("Vida de pokemon 1:" +vida1);
                                            System.out.println("Vida de pokemon 2: 0.0");
                                            i=10;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 1 Ha sido el ganador!");
                                        } else {
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);    
                                        }
                                    }
                                break;
                                case 4:
                                    vida1 = 300;
                                        ataque1 = 70;
                                        defensa1 = 0.25;
                                        vida2 = 280;
                                        ataque2 = 80;
                                        defensa2 = 0.15;
                                    for (int i = 1; i < 10; i++) {
                                        System.out.println("----------------- Ronda "+i +" -----------------");
                                        
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);
                                        
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-(ataque2-ataque2*defensa1);
                                        vida2=vida2-(ataque1-ataque1*defensa2);
                                        if (vida1<=0) {
                                            System.out.println("Vida de pokemon 1: 0.0");
                                            System.out.println("Vida de pokemon 2:" +vida2);
                                            i=10;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 2 Ha sido el ganador!");
                                        } else if (vida2<=0) {
                                            System.out.println("Vida de pokemon 1:" +vida1);
                                            System.out.println("Vida de pokemon 2: 0.0");
                                            i=10;
                                            
                                            System.out.println("******** Fin de la Batalla ********");
                                            System.out.println("Pokemon 1 Ha sido el ganador!");
                                        } else {
                                        System.out.println("Vida de pokemon 1:" +vida1);
                                        System.out.println("Vida de pokemon 2:" +vida2);    
                                        }
                                    }
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } else {
                        System.out.println("Opcion no valida");
                    }
                    break;
                case 3:
                    System.out.println("Entrando a Asterisco en casa...");
                        
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");

                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (continuar != 4);

    }

}
