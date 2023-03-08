package Controller;


// extends Thread
//Parâmetro pro construtor
//Método run()

public class ThreadVetor extends Thread {

    private int valor;
    private int[] vetor = new int[1000];

    public ThreadVetor(int valor,int[] threadVetor){
        this.valor = valor;
        this.vetor = threadVetor;
    }




    public void run() {
        Tempovetor();

    }

    public void Tempovetor(){
        double tempoinicial = System.nanoTime();
        double tempofinal;
        double tempototal;
        if (valor%2 == 0){
            for (int i=0; i<vetor.length; i++){
            }
            tempofinal= System.nanoTime();
            tempototal= tempofinal - tempoinicial;
            tempototal= tempototal / Math.pow(10, 9);
            System.out.println("Tempo com for: " +tempototal+ "s.");
        }
        else {
            for (int ler: vetor) {
            }
            tempofinal= System.nanoTime();
            tempototal= tempofinal - tempoinicial;
            tempototal= tempototal / Math.pow(10, 9);
            System.out.println("Tempo com foreach: " +tempototal+ "s.");
        }
    }
}
