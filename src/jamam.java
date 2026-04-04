import java.util.ArrayList;

public class jamam {
    
     public static void main(String args[]) {
     
         String intento = "12345";
         
          ArrayList<Integer> numerosDiv = new ArrayList<>();

        // Recorremos el texto de izquierda a derecha
        for (int i = 0; i < intento.length(); i++) {
            // Tomamos cada letra (que es un número), lo volvemos valor numérico y lo agregamos
            int digito = Character.getNumericValue(intento.charAt(i));
            numerosDiv.add(digito); // Aquí ya no necesitas el 'add(0, digito)' porque entran en orden
        }
        
         System.out.println(numerosDiv);
     
     }
}