package menu;

import java.util.List;
import java.util.Scanner;

import model.Food;

public class MenuCadastroFood implements Menu {

    

    @Override
    public void mostrarMenu(Scanner read, List<Food> acai) {
        System.out.print("\n***** Cadastro Food *****\n");

        Food f = new Food(null, 0);

        System.out.print("\nNome Produto: ");
        f.setNome(read.nextLine());
        acai.add(f);

        System.out.print("\nValor Produto: ");
        f.setValor(read.nextDouble());
        read.nextLine();
        acai.add(f);

        System.out.println("\n***** Lista de Produtos Cadastrados ***** \n");


                
      
    }

  

   

 
      


        
    
}
