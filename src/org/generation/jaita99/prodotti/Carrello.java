package org.generation.jaita99.prodotti;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Prodotto> list=new ArrayList<>();
        boolean flag=false;
        while (flag==false) {
            System.out.println("cosa vuoi inserire?(se non vuoi inserire niente digita 'niente')");
            String product = scan.nextLine();
            if (product.equals("televisore")) {
                Televisori tv = new Televisori(30,"samsung","compatto",new BigDecimal(300),new BigDecimal(20),3,true);
                list.add(tv);

            }
            else if(product.equals("smartphone")) {
                Smartphone tel=new Smartphone(30,"samsung","compatto",new BigDecimal(300),new BigDecimal(20),3,256);
                list.add(tel);
            }
            else if (product.equals("cuffie")) {
                Cuffie headphones= new Cuffie(30,"samsung","compatto",new BigDecimal(300),new BigDecimal(20),"yellow",true);
                list.add(headphones);
            }
            else {
                flag=true;
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).toString());
        }

    }
}
