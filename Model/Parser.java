import java.util.Scanner;

public class Parser {

    private final String SUMA_CHAR = "+";
    private final String RESTA_CHAR = "-";
    private final String MULT_CHAR = "*";
    private final String DIV_CHAR = "/";
    private final String POT_CHAR = "^";
    private final String PAR_AP_CHAR = "(";
    private final String PAR_CR_CHAR = ")";
    private final String CONTROL = "#";

    private int jerarquia(String chr){
        if(chr.equals(SUMA_CHAR) || chr.equals(RESTA_CHAR)){
            return 1;
        }
        else if(chr.equals(MULT_CHAR) || chr.equals(DIV_CHAR)){
            return 2;
        }
        else if(chr.equals(POT_CHAR)){
            return 3;
        }
        else{
            return 0;
        }
    }
    
    /**
     * Metodo recibe la expresión en infix y la opción del stack
     * a emplear, retorna la expresión recibida en una expresión
     * postfix. Emplea un separador de caracteres para evaluar
     * uno a uno. Los numeros se añaden automaticamente a la exp-
     * presión infix y los caracteres se valuan de ultimo.
     * @param infix
     * @param stack
     * @return postfix
     */
    public String parseExpresion(String infix, int stack){
        StackFactory<String>stackIni = new StackFactory<>();
        IStack<String>stackFin = stackIni.getStack(stack);
        stackFin.push("#");
        String postfix = "";
        String token;
        boolean isNumber;
        Scanner separador = new Scanner(infix);

        while(separador.hasNext()){
            token = separador.next();
            isNumber = token.matches("[0-9]+");
            if(isNumber){
                postfix += token+" ";
            }
            else if(token.equals(PAR_AP_CHAR)){
                stackFin.push(token);
            }
            else if(token.equals(POT_CHAR)){
                stackFin.push(token);
            }
            else if(token.equals(PAR_CR_CHAR)){
                while(((stackFin.peek()).compareTo(CONTROL) != 0) && ((stackFin.peek()).compareTo(PAR_AP_CHAR) != 0)){
                    if(stackFin.size() > 2){
                        postfix += stackFin.pop()+" ";
                    }
                    else{
                        postfix += stackFin.pop();
                    }
                }
                stackFin.pop();
            }
            else{
                if(jerarquia(token) > jerarquia(stackFin.peek())){
                    stackFin.push(token);
                }
                else{
                    while(stackFin.peek() != CONTROL && jerarquia(token) <= jerarquia(stackFin.peek())){
                        postfix += stackFin.pop()+" ";
                    }
                    stackFin.push(token);
                }
            }
        }

        while(stackFin.peek() != CONTROL){
            if(stackFin.size() > 2){
                postfix += stackFin.pop()+" ";
            }
            else{
                postfix += stackFin.pop();
            }
        }

        separador.close();
        return postfix;
        
    }

}
