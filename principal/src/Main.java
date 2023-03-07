public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("********************************");
        System.out.println("Este es mi repositorio de prueba");

        int numInicial = 0;
        int numfinal= 10;
        int marcador = numInicial;
        boolean soloPares = true;

        while (marcador <= numfinal)
        {
            //pares

            if(soloPares && marcador %2 == 0) {
                System.out.println(marcador);
            }
            //impares
            else if ((soloPares && marcador %2 != 0))
            {
                System.out.println(marcador);
            }

            marcador++;

        }
    }




}