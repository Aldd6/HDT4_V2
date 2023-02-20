public interface ICalculadora {
    /**
     * se recibe la expresión postfix por el parser
     * @param expression
     * @return resultado de evaluar la expresión
     * @throws ArithmeticException
     */
    public double evaluate(String expression, int stack) throws ArithmeticException;

}
