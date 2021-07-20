package mundoProblema;
public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema notas");

         //Probar la clase Nota
         //Nota nota1 = new Nota();
         //nota1.mostrarNota();
         //Nota nota2 = new Nota(77);
         //nota2.mostrarNota();
         //Nota nota3 = new Nota(2.8);
         //nota3.mostrarNota();

         Materia materia = new Materia("AA00100276","Programación básica",40,50,39,76,96);
         materia.calcularPromedioAjustado();
         materia.mostrarMateria();
         
    }

   
}
