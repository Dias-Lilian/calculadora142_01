// pacote

// biblioteca

// classe

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.JavaBean;

import org.junit.jupiter.api.Test;

import com.iterasys.Main;

public class TestCalculadora {
    // atributos

    // funções e métodos
    @Test
    public void testeSomar (){
        // AAA - Arrange, Act, Assert
        // CEV - Configura, Executa, Valida

        // Configura
        // Dados de Entrada
        float num1 = 10;
        float num2 = 8;
        // Dados de Saída, Resultado Esperado
        float resultadoesperado = 18;
        
        //Executa
        float resultadoAtual = Main.somar(num1, num2);

        //Valida
        assertEquals(resultadoesperado, resultadoAtual);
    }
 
    @Test 
    public void testeSubtrair (){
        // AAA - Arrange, Act, Assert
        // CEV - Configura, Executa, Valida

        // Configura
        // Dados de Entrada
        float num1 = 25;
        float num2 = 14;
        // Dados de Saída, Resultado Esperado
        float resultadoesperado = 11;
        
        //Executa
        float resultadoAtual = Main.subtrair(num1, num2);

        //Valida
        assertEquals(resultadoesperado, resultadoAtual);
    }
    @Test 
    public void testeMultiplicar (){
        // AAA - Arrange, Act, Assert
        // CEV - Configura, Executa, Valida

        // Configura
        // Dados de Entrada
        float num1 = 8;
        float num2 = 7;
        // Dados de Saída, Resultado Esperado
        float resultadoesperado = 56;
        
        //Executa
        float resultadoAtual = Main.multiplicar(num1, num2);

        //Valida
        assertEquals(resultadoesperado, resultadoAtual);
    }    
    
    @Test 
    public void testeDividir (){
        // AAA - Arrange, Act, Assert
        // CEV - Configura, Executa, Valida

        // Configura
        // Dados de Entrada
        int num1 = 27;
        int num2 = 3;
        // Dados de Saída, Resultado Esperado
        String resultadoesperado = "9";
        
        //Executa
        String resultadoAtual = Main.dividirTry(num1, num2);

        //Valida
        assertEquals(resultadoesperado, resultadoAtual);
    }

    @Test 
    public void testeDividirPorZero (){
        // AAA - Arrange, Act, Assert
        // CEV - Configura, Executa, Valida

        // Configura
        // Dados de Entrada
        int num1 = 7;
        int num2 = 0;
        // Dados de Saída, Resultado Esperado
        String resultadoesperado = "Não é possível dividir por zero";
        
        //Executa
        String resultadoAtual = Main.dividirTry(num1, num2);

        //Valida
        assertEquals(resultadoesperado, resultadoAtual);
    }
}