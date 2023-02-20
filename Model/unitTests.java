import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class unitTests{

    @Test
    public void parserTest(){
        Parser parser = new Parser();
        String expParseada = parser.parseExpresion("( 1 + 2 ) * 9", 1);
        String expEsperada = "1 2 + 9 *";
        assertEquals(expEsperada, expParseada);
    }

    @Test
    public void calculadoraTest(){
        Parser parser = new Parser();
        Calculadora calculadora = Calculadora.getCalculadora();
        var expParseada = parser.parseExpresion("( 1 + 2 ) * 9", 1);
        var valObtenido = calculadora.evaluate(expParseada, 1);
        var valEsperado = 27.0;
        assertEquals(valEsperado, valObtenido, 0);
    }

    @Test
    public void stackOperations(){
        StackFactory<Integer>stack = new StackFactory<>();
        var stackVivo = stack.getStack(3);
        stackVivo.push(4);
        var valorObtenido = stackVivo.pop();
        assertEquals(4, valorObtenido, 0);
    }

    @Test
    public void stacklista(){
        StackFactory<Integer>stack = new StackFactory<>();
        var stackVivo = stack.getStack(3);
        stackVivo.push(4);
        stackVivo.push(5);
        stackVivo.pop();
        var result = stackVivo.pop();
        assertEquals(4, result, 0);
    }

    @Test
    public void stackListaPeek(){
        StackFactory<Integer>stack = new StackFactory<>();
        var stackVivo = stack.getStack(3);
        stackVivo.push(4);
        stackVivo.push(5);
        var result = stackVivo.peek();
        assertEquals(5, result, 0);
    }

    @Test
    public void stackListaSize(){
        StackFactory<Integer>stack = new StackFactory<>();
        var stackVivo = stack.getStack(3);
        stackVivo.push(4);
        stackVivo.push(5);
        var result = stackVivo.size();
        assertEquals(2, result, 0);
    }

}
