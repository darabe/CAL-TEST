import org.testng.Assert;
import org.testng.annotations.Test;

// Este archivo contiene casos de prueba para la clase IntegerOperations.
// Issue relacionado: #5


public class IntegerOperationsTest {
    
    @Test(description = "Verifica la suma de dos números enteros")
    public void testSum() {
        // Paso 1: Crear dos números enteros, a y b
        int a = 5;
        int b = 7;
        
        // Paso 2: Llamar al método sum(a, b)
        int resultado = IntegerOperations.sum(a, b);
        
        // Resultado Esperado: La suma de a y b debe ser igual al resultado del método
        int resultadoEsperado = a + b;
        
        // Verificar que el resultado sea igual al resultado esperado
        Assert.assertEquals(resultado, resultadoEsperado);
    }
    
    @Test(description = "Verifica la resta de dos números enteros")
    public void testSubtract() {
        // Paso 1: Crear dos números enteros, a y b
        int a = 10;
        int b = 3;
        
        // Paso 2: Llamar al método subtract(a, b)
        int resultado = IntegerOperations.subtract(a, b);
        
        // Resultado Esperado: La resta de a y b debe ser igual al resultado del método
        int resultadoEsperado = a - b;
        
        // Verificar que el resultado sea igual al resultado esperado
        Assert.assertEquals(resultado, resultadoEsperado);
    }
    
}
