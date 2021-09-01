package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);


        System.out.println("Entre com as informações dos produtos: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        //atualiza nome usando o setName
        product.setName("computer");
        //pegando o nome usando o getName
        System.out.println("Nome atualizado: "+ product.getName());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Entre com o nro de produtos a serem adicionados ao estoque: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Entre com o nro de produtos a serem removidos ao estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        sc.close();
    }


}
