
import java.util.Scanner;

public class Calculadora implements ICalculadora{
    private final char SUMA = '+';
    private final char RESTA = '-';
    private final char MULTIPLICA = '*';
    private final char DIVIDE = '/';
    private final char POTENCIA = '^';

    Parser parser = new Parser();

    private static Calculadora calculadora;

    private Calculadora(){

    }

    /**
     * Metodo para obtener la instacia de una calculadora unica (Singleton)
     * Se verifica si ya existe una calculadora para evitra su re instanciación
     * Si no existe instancia se crea al objeto y se retorna para su uso
     * @return calculadora
     */
    public static Calculadora getCalculadora(){
        if(calculadora == null){
            calculadora = new Calculadora();
        }
        return calculadora;
    }

    @Override
    public double evaluate(String expression, int stack) throws ArithmeticException{
        StackFactory<Double>stackIni = new StackFactory<>();
        IStack<Double>stackFin = stackIni.getStack(stack);
        double operando1, operando2, resultado = 0.0;
        String token;
        Scanner separador = new Scanner(expression);

        while(separador.hasNext()){
            token = separador.next();

            if(isOperator(token)){
                operando2 = stackFin.pop();
                operando1 = stackFin.pop();
                resultado = executeOperation(token.charAt(0), operando1, operando2);
                stackFin.push(resultado);
            }
            else{
                stackFin.push(Double.parseDouble(token));
            }
        }

        separador.close();
        return resultado;
    }

    private boolean isOperator(String token){
        Character operator = token.charAt(0);
        boolean returnValue = false;

        if(token.length() > 1){
            returnValue = false;
        }

        if(operator.equals(SUMA) || operator.equals(RESTA) || operator.equals(MULTIPLICA) || operator.equals(DIVIDE) || operator.equals(POTENCIA)){
            returnValue = true;
        }

        return returnValue;
    }

    private double executeOperation(char operador, double operando1, double operando2){
        double resultado = 0;

        switch(operador){
            case POTENCIA:
                resultado = Math.pow(operando1, operando2);
                break;
            case SUMA:
                resultado = operando1 + operando2;
                break;
            case RESTA:
                resultado = operando1 - operando2;
                break;
            case MULTIPLICA:
                resultado = operando1 * operando2;
                break;
            case DIVIDE:
                if(operando2 != 0){
                    resultado = operando1 / operando2;
                }
                else{
                    throw new ArithmeticException();
                }
                break;
        }

        return resultado;
    }
}
