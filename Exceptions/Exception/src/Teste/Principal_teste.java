package Teste;

public class Principal_teste {

    public static void main(String[] args) throws Divisaoz {

        float[] vet = {0, 7, 4, 9, 4,1};
        float[] vet2 = {0, 2, 0, 3, 0};
        
        float[] vet3 = new float[6];

        for (int i = 0; i < vet3.length; i++) {
            try {

                if (vet2[i] == 0) {
                    throw new Divisaoz("Divisao por zero");
                } else {

                    vet3[i] = vet[i] / vet2[i];

                    System.out.println(vet3[i]);
                }

            } catch (Divisaoz f) {
                System.out.println(f.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posiçao inexistente");
            }
        }

    }

}
