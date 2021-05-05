package estangaej7;

public class calculoarea {
    //Atributos
    private int base, altura, area;
    //Constructor
    public calculoarea(int base, int altura){
       this.base=base;
       this.altura=altura;
    }
    private void calculoarea(){
       area=base*altura;
    }
    public void imprimir (){
       calculoarea();
       System.out.println("El area del rectangulo es "+area);
    }
}
