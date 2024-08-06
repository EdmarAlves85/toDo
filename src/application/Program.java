package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        List<String> toDo = new ArrayList<String>();
        String task;
        boolean controll = true;
		
        while (controll) {
        	System.out.print("INFORME A TAREFA: ");
			task = sc.nextLine();
			
			switch (task) {
			case "sair":
				controll = false;
				break;
				
			case "s":
				controll = false;
				break;
			
			case "S":
				controll = false;
				break;
			
			case "SAIR":
				controll = false;

			default:
				toDo.add(task);
				break;
			}
		}
        
        if (toDo.isEmpty()) {
        	System.out.println("LISTA VAZIA!");
        } else {
        	for (String item : toDo) {
    			System.out.println(item);
    		}
        }
        System.out.println("________________________________________");
        toDo.remove(0);
        
        if (toDo.isEmpty()) {
        	System.out.println("LISTA VAZIA!");
        } else {
        	for (String item : toDo) {
    			System.out.println(item);
    		}
        }
        
        sc.close();
    }
	
	
}
