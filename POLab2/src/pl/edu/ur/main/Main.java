package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    public static void zadanie3() {
        System.out.println("ZADANIE 3 \n");
        Scanner input = new Scanner(System.in);
        float[] tab = new float[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj element tablicy [ " + i + " ]");
            tab[i] = input.nextFloat();
        }
        System.out.println("Podaj dzialanie: \n "
                + "a - Wyświetlanie tablicy od pierwszego do ostatniego indeksu. \n"
                + "b - Wyświetlanie tablicy od ostatniego do pierwszego indeksu. \n "
                + "c - Wyświetlanie elementów o nieparzystych indeksach \n "
                + "d - Wyświetlanie elementów o parzystych indeksach");
        System.out.println("Podaj opcje menu: ");
        char menuOption = input.next().charAt(0);
        System.out.println("menuOption" + menuOption);
        if (menuOption == 'a') {
            for (int i = 0; i < 10; i++) {
                System.out.println("Kolejna komórka to: " + tab[i]);
            }
        } else if (menuOption == 'b') {
            for (int i = 9; i >= 0; i--) {
                System.out.println("Kolejna komórka to: " + tab[i]);
            }
        } else if (menuOption == 'c') {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Kolejna komórka parzysta to: " + tab[i]);
                }
            }
        } else if (menuOption == 'd') {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Kolejna komórka nieparzysta to: " + tab[i]);
                }
            }
        } else {
            System.out.println("Zła opcja");
        }
    }

    public static void zadanie4() {
        System.out.println("\n ZADANIE 4 \n");
        Scanner input = new Scanner(System.in);
        float[] tab = new float[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj element tablicy [ " + i + " ]");
            tab[i] = input.nextFloat();
        }
        System.out.println("Podaj dzialanie: \n "
                + "a - Oblicz sumę elementów tablicy. \n"
                + "b - Oblicz iloczyn elementów tablicy \n "
                + "c - wyznacz wartość średnią \n "
                + "d - wyznacz wartość minimalną \n "
                + "e - wyznacz wartość maksymalną");
        System.out.println("Podaj opcje menu: ");
        char menuOption = input.next().charAt(0);
        System.out.println("menuOption" + menuOption);
        if (menuOption == 'a') {
            float suma = 0;
            for (int i = 0; i < 10; i++) {
                suma += tab[i];
            }
            System.out.println("Suma to: " + suma);
        } else if (menuOption == 'b') {
            float iloczyn = 1;
            for (int i = 0; i < 10; i++) {
                iloczyn *= tab[i];
            }
            System.out.println("Iloczyn to: " + iloczyn);
        } else if (menuOption == 'c') {
            float suma = 0;
            for (int i = 0; i < 10; i++) {
                suma += tab[i];
            }
            System.out.println("Srednia to: " + (suma / tab.length));
        } else if (menuOption == 'd') {
            float min = tab[0];
            for (int i = 0; i < 10; i++) {
                if (tab[i] < min) {
                    min = tab[i];
                }
            }
            System.out.println("Minimalna wartosc to: " + min);
        } else if (menuOption == 'e') {
            float max = tab[0];
            for (int i = 0; i < 10; i++) {
                if (tab[i] > max) {
                    max = tab[i];
                }
            }
            System.out.println("Maksymalna wartosc to: " + max);
        } else {
            System.out.println("Zła opcja");
        }
    }

    public static void zadanie6() {
        System.out.println("\n ZADANIE 6 \n");
        Scanner input = new Scanner(System.in);
        int startingValue = 10;
        while (startingValue > 0) {
            startingValue = input.nextInt();
        }
    }

    public static void zadanie7() {
        System.out.println("\n ZADANIE 7 \n");
        Scanner input = new Scanner(System.in);
        int numberOfInputs = input.nextInt();
        int[] tab = new int[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.println("Podaj element tablicy [ " + i + " ]");
            tab[i] = input.nextInt();
        }
        int tabLength = tab.length;
        int temp = 0;

        for (int i = 0; i < tabLength; i++) {
            for (int j = 1; j < (tabLength - i); j++) {

                if (tab[j - 1] > tab[j]) {
                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }

            }
        }
        
        for (int i = 0; i < tabLength; i++) {
            System.out.println("Element tablicy [ " + i + " ] - " + tab[i]);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7 
        zadanie3();
        zadanie4();
        zadanie6();
        zadanie7();
    }

}
