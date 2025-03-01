import exe3.Produto;

public class MainProduto {

    public static void main(String[] args) {
         Produto obj1 = new Produto();
         obj1.comprar(10);
         obj1.vender(3);
         obj1.subir(588.90f);
         obj1.decer( 34.5f);
         obj1.mostrar();

         Produto obj2 = new Produto(10, "Bols de basquete", 2, 510);
    }

}
