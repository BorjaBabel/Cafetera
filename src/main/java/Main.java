import model.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       TipoCafe tipoRistretto = new Ristretto();
       Molino molinoCircular = new MolinoCircular();
       CafeteraFiltro filtrado = new CafeteraFiltro(tipoRistretto, molinoCircular);
       filtrado.hacerCafe();
        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.



    }
}