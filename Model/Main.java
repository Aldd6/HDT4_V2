import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        ArrayList<String>titulo = new ArrayList<>();
        titulo.add("  /$$$$$$            /$$                     /$$                 /$$                                     ");
        titulo.add(" /$$__  $$          | $$                    | $$                | $$                                     ");
        titulo.add("| $$  |__/  /$$$$$$ | $$  /$$$$$$$ /$$   /$$| $$  /$$$$$$   /$$$$$$$  /$$$$$$   /$$$$$$  /$$$$$$         ");
        titulo.add("| $$       |____  $$| $$ /$$_____/| $$  | $$| $$ |____  $$ /$$__  $$ /$$__  $$ /$$__  $$|____  $$        ");
        titulo.add("| $$        /$$$$$$$| $$| $$      | $$  | $$| $$  /$$$$$$$| $$  | $$| $$ |  $$| $$  |__/ /$$$$$$$        ");
        titulo.add("| $$    $$ /$$__  $$| $$| $$      | $$  | $$| $$ /$$__  $$| $$  | $$| $$  | $$| $$      /$$__  $$        ");
        titulo.add("|  $$$$$$/|  $$$$$$$| $$|  $$$$$$$|  $$$$$$/| $$|  $$$$$$$|  $$$$$$$|  $$$$$$/| $$     |  $$$$$$$        ");
        titulo.add("  ______/   _______/|__/  _______/  ______/ |__/  _______/  _______/  ______/ |__/       _______/        ");
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int typeCalc;
        String expression;
        boolean flag_control = true;
        Parser pars = new Parser();
        Calculadora calculadora = Calculadora.getCalculadora();

        while(flag_control){
            for(String line:titulo){
                System.out.println(line);
            }
            System.out.println("");
            System.out.println("---------------SELECCIONE EL TIPO DE ESTRUCTURA A EMPLEAR---------------");
            System.out.println("1. Arraylist");
            System.out.println("2. Vector");
            System.out.println("3. Lista simple");
            System.out.println("4. Lista doble");
            System.out.println("5. Salir");
            System.out.print("U:> ");
            opcion = entrada.nextInt();

            if(opcion == 1){
                System.out.println("--------------SELECCIONE EL TIPO DE CALCULADORA A EMPLEAR---------------");
                System.out.println("1. Manual (Ingresa a mano las expresiones)");
                System.out.println("2. Automatica (Lee las expresiones de un archivo .txt)");
                System.out.print("U:> ");
                typeCalc = entrada.nextInt();
                if(typeCalc == 1){
                    System.out.println("");
                    System.out.println("----------------INGRESE LA EXPRESION INFIX A EVALUAR----------------");
                    System.out.println(" *Nota: por favor dejar espacio entre cada elemento");
                    System.out.println(" Ej. ( 4 + 5 ) - ( 2 * 8 ) / ( 4 / 2 )");
                    System.out.println("");
                    System.out.print("U:> ");
                    entrada.nextLine();
                    expression = entrada.nextLine();
                    var expParseada = pars.parseExpresion(expression, opcion);
                    System.out.println("");
                    System.out.println("------------------EL RESULTADO DE LA EXPRESION ES-------------------");
                    System.out.println(calculadora.evaluate(expParseada, opcion));
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("");
                }
                else if(typeCalc == 2){
                    try{
                        File file = new File("expresiones.txt");
                        Scanner linea = new Scanner(file);
                        System.out.println("");
                        System.out.println("----------------EL RESULTADO DE LAs EXPRESIONES ES------------------");
                        while(linea.hasNextLine()){
                            expression = linea.nextLine();
                            System.out.print(expression+" = ");
                            var expParseada = pars.parseExpresion(expression, opcion);
                            System.out.println(calculadora.evaluate(expParseada, opcion));
                        }
                        linea.close();
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("");
                    }
                    catch (FileNotFoundException d){
                        System.out.println(d);
                    }   
                }
            }
            else if(opcion == 2){
                System.out.println("--------------SELECCIONE EL TIPO DE CALCULADORA A EMPLEAR---------------");
                System.out.println("1. Manual (Ingresa a mano las expresiones)");
                System.out.println("2. Automatica (Lee las expresiones de un archivo .txt)");
                System.out.print("U:> ");
                typeCalc = entrada.nextInt();
                if(typeCalc == 1){
                    System.out.println("");
                    System.out.println("----------------INGRESE LA EXPRESION INFIX A EVALUAR----------------");
                    System.out.println(" *Nota: por favor dejar espacio entre cada elemento");
                    System.out.println(" Ej. ( 4 + 5 ) - ( 2 * 8 ) / ( 4 / 2 )");
                    System.out.println("");
                    System.out.print("U:> ");
                    entrada.nextLine();
                    expression = entrada.nextLine();
                    var expParseada = pars.parseExpresion(expression, opcion);
                    System.out.println("");
                    System.out.println("------------------EL RESULTADO DE LA EXPRESION ES-------------------");
                    System.out.println(calculadora.evaluate(expParseada, opcion));
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("");
                }
                else if(typeCalc == 2){
                    try{
                        File file = new File("expresiones.txt");
                        Scanner linea = new Scanner(file);
                        System.out.println("");
                        System.out.println("----------------EL RESULTADO DE LAs EXPRESIONES ES------------------");
                        while(linea.hasNextLine()){
                            expression = linea.nextLine();
                            System.out.print(expression+" = ");
                            var expParseada = pars.parseExpresion(expression, opcion);
                            System.out.println(calculadora.evaluate(expParseada, opcion));
                        }
                        linea.close();
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("");
                    }
                    catch(FileNotFoundException d){
                        System.out.println(d);
                    }
                }
            }
            else if(opcion == 3){
                System.out.println("--------------SELECCIONE EL TIPO DE CALCULADORA A EMPLEAR---------------");
                System.out.println("1. Manual (Ingresa a mano las expresiones)");
                System.out.println("2. Automatica (Lee las expresiones de un archivo .txt)");
                System.out.print("U:> ");
                typeCalc = entrada.nextInt();
                if(typeCalc == 1){
                    System.out.println("");
                    System.out.println("----------------INGRESE LA EXPRESION INFIX A EVALUAR----------------");
                    System.out.println(" *Nota: por favor dejar espacio entre cada elemento");
                    System.out.println(" Ej. ( 4 + 5 ) - ( 2 * 8 ) / ( 4 / 2 )");
                    System.out.println("");
                    System.out.print("U:> ");
                    entrada.nextLine();
                    expression = entrada.nextLine();
                    var expParseada = pars.parseExpresion(expression, opcion);
                    System.out.println("");
                    System.out.println("------------------EL RESULTADO DE LA EXPRESION ES-------------------");
                    System.out.println(calculadora.evaluate(expParseada, opcion));
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("");
                }
                else if(typeCalc == 2){
                    try{
                        File file = new File("expresiones.txt");
                        Scanner linea = new Scanner(file);
                        System.out.println("");
                        System.out.println("----------------EL RESULTADO DE LAs EXPRESIONES ES------------------");
                        while(linea.hasNextLine()){
                            expression = linea.nextLine();
                            System.out.print(expression+" = ");
                            var expParseada = pars.parseExpresion(expression, opcion);
                            System.out.println(calculadora.evaluate(expParseada, opcion));
                        }
                        linea.close();
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("");
                    }
                    catch(FileNotFoundException d){
                        System.out.println(d);
                    }
                }
            }
            else if(opcion == 4){
                System.out.println("--------------SELECCIONE EL TIPO DE CALCULADORA A EMPLEAR---------------");
                System.out.println("1. Manual (Ingresa a mano las expresiones)");
                System.out.println("2. Automatica (Lee las expresiones de un archivo .txt)");
                System.out.print("U:> ");
                typeCalc = entrada.nextInt();
                if(typeCalc == 1){
                    System.out.println("");
                    System.out.println("----------------INGRESE LA EXPRESION INFIX A EVALUAR----------------");
                    System.out.println(" *Nota: por favor dejar espacio entre cada elemento");
                    System.out.println(" Ej. ( 4 + 5 ) - ( 2 * 8 ) / ( 4 / 2 )");
                    System.out.println("");
                    System.out.print("U:> ");
                    entrada.nextLine();
                    expression = entrada.nextLine();
                    var expParseada = pars.parseExpresion(expression, opcion);
                    System.out.println("");
                    System.out.println("------------------EL RESULTADO DE LA EXPRESION ES-------------------");
                    System.out.println(calculadora.evaluate(expParseada, opcion));
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("");
                }
                else if(typeCalc == 2){
                    try{
                        File file = new File("expresiones.txt");
                        Scanner linea = new Scanner(file);
                        System.out.println("");
                        System.out.println("----------------EL RESULTADO DE LAs EXPRESIONES ES------------------");
                        while(linea.hasNextLine()){
                            expression = linea.nextLine();
                            System.out.print(expression+" = ");
                            var expParseada = pars.parseExpresion(expression, opcion);
                            System.out.println(calculadora.evaluate(expParseada, opcion));
                        }
                        linea.close();
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("");
                    }
                    catch(FileNotFoundException d){
                        System.out.println(d);
                    }
                }
            }
            else if(opcion == 5){
                flag_control = false;
            }
        }

    }
    
}
