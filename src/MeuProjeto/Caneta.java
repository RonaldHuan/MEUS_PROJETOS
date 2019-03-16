package MeuProjeto;

public class Caneta {
    private String modelo;
    private boolean tampada;
    private boolean destampada;
    private float ponta;
    private String cor;

    public Caneta(String m, boolean t, boolean d, float p, String c){
        this.modelo = m;
        this.tampada = t;
        this.destampada = d;
        this.ponta = p;
        this.cor = c;
    }
    public void status(){
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Destampada: " + this.destampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
    }

}
