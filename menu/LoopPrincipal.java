package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Food;

public class LoopPrincipal{

    private Scanner read;
    private List<Food> acai;

    public LoopPrincipal(){
        acai = new ArrayList<>();
        read = new Scanner(System.in);
    }

    public void loopPrincipal(){
        int opcao ;

        do{

            mostrarMenu();
            opcao = Integer.parseInt(read.nextLine());
            Menu menu = null;

         switch (opcao) {
            case 1:
                menu = new MenuCadastroFood();
            break;
            case 2:
                menu = new MenuVendas();
            
            break;
            case 3:
            System.out.println("Saindo do programa....");
            break;
            default:
            System.out.println("Opção inválida!!!");
            break;   
            }if(menu != null){
              menu.mostrarMenu(read, acai);
            }

        } while(opcao != 0);
        
    }

    public void mostrarMenu(){

        System.out.println("***** Ifood *****");
        System.out.println("1- Cadastro Food");
        System.out.println("2- Vendas");
        System.out.println("0- Sair");
        System.out.print("Opção: ");
    
    }

}




