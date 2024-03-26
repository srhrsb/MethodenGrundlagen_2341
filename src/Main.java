public class Main {

    public static void main(String[] args) {

        float a = 7.6f;
        float b = 9.3f;
        float c = a+b;
        System.out.println("Ergebnis: " + c);

        //Diese obige Rechnung findet jetzt einmal statt mit bestimmten Werten
        //um eine nächste Addition von 2 float-Werten zu machen, müssten wir
        //also identischen Code nur mit anderen Werten nocheinmal schreiben

        //Um solche unnötigen Wiederholungen von Quellcode zu vermeiden,
        //können wir Methoden verwenden

        float d = calculateSum( 5.2f, 3.6f);
        printResult(d);

        float e = calculateSum( 34.5f, 17.4f);
        printResult(e);

    }

    //Dazu wird die Methode deklariert (Mindestens):
    // Zugriffsrechte | Rückgabetyp | Bezeichner(Name) | ( Parametervariablen (optional) )

    /**
     * Berechnet die Summe zweier Fließkommazahlen
     * @param a float
     * @param b float
     * @return result float
     */
    private static float calculateSum( float a, float b){

        float result = a+b;
        //Methoden können Ergebnisse zurückgeben, in diesem Fall müssen wir,
        //da der Rückgabetyp nicht als void deklariert ist.
        //void heißt, dass es keine Rückgabe gibt

        return result; //zurückgeben von result mit return
    }

    private static void printResult( float value ) //void bedeutet: keine Rückgabe
    {
        System.out.println("Ergebnis der Berechnung: " + value);
    }






}