package menu;

import java.util.List;
import java.util.Scanner;

import model.Food;

public class MenuVendas implements Menu {

       @Override
    public void mostrarMenu(Scanner read, List<Food> acai) {
        System.out.println("\nVendas");
    }
    
}
