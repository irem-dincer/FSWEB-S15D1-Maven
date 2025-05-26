package org.example.models;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList=new ArrayList<>();


    Scanner scanner=new Scanner(System.in);//listeye eklenecek elemanlar
    public void startGrocery(){

        int choice;

        do{
            System.out.println("Tercihinizi Seciniz (0=cikis , 1= ekle , 2= cikarma");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Eklenmesini istediginiz elemanlari giriniz.");
                    String itemsToAdd=scanner.nextLine();
                    addItems(itemsToAdd);
                    printSorted();

                    break;
                case 2:
                    System.out.println("Cikarilmasini istediginiz elemanlari giriniz.");
                    String itemsToRemove=scanner.nextLine();
                    removeItems(itemsToRemove);
                    printSorted();
                    break;




            }
        }

        while(choice !=0);
        scanner.close();


    }

    public static void addItems(String itemsToAdd){
        String[] splitItems=itemsToAdd.split(",");
        for(String item: splitItems){
            item=item.trim();

            if(checkItemsInList(item)){
                System.out.println("Girilen item listede mevcut: "+item);
            }
            else {
                groceryList.add(item);

            }
            sortItems();
        }
    }
    public static boolean checkItemsInList(String item){
        return groceryList.contains(item);

    }

    public static void removeItems(String itemsToRemove){
        String[] splitItems=itemsToRemove.split(",");
        for(String item: splitItems){
            item=item.trim();

            if(!checkItemsInList(item)){
                System.out.println("Girilen item listede mevcut degil: "+item);

            }
            else {
                groceryList.remove(item);

            }
            sortItems();
        }
    }
    public static void printSorted(){
        sortItems();
        System.out.println("Mevcut pazar listesi");
        for(String item: groceryList){
            System.out.println(item);
        }



    }

    public static void sortItems(){
        Collections.sort(groceryList);

    }


}


