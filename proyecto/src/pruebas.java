
class Scratch {
    public static int sumarnumeropar(int numero){
        int suma = 0;
        int i;
        for (i = 1; i <= numero; i++) {
            if (i%2==0) {
                suma+=i;
            }
        }
        return suma;


    }

    public static void main(String arg[]){
        System.out.println(sumarnumeropar( 8));
    }

}
