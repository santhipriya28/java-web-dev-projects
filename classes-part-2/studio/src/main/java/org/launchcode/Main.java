package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem newMenu = new MenuItem(8.29,"Fried Mozzarella",MenuItemCategory.APPETIZER,true);
        MenuItem newMenu1 = new MenuItem(7.29,"chicken Mozzarella",MenuItemCategory.APPETIZER,true);
        MenuItem newMenu2 = new MenuItem(20.49,"Shrimp Alfredo",MenuItemCategory.MAINCOURSE,false);
        MenuItem newMenu3 = new MenuItem(8.99,"Tiramisu",MenuItemCategory.DESSERT,true);
        ArrayList<MenuItem> arr=new ArrayList<>();

        Menu currentMenu = new Menu(new Date(),arr);
        currentMenu.addMenu(newMenu);
        currentMenu.addMenu(newMenu1);
        currentMenu.addMenu(newMenu2);
        currentMenu.addMenu(newMenu3);


        System.out.println("Single Item ");
        System.out.println("************");
        newMenu.PrintMenuItem();
        System.out.println("************");

        System.out.println("All Menu Items");
        System.out.println("**************");
        currentMenu.printMenu();

        currentMenu.removeMenu(newMenu1);
        System.out.println("After deleting one Menu Items");
        System.out.println("**************");
        currentMenu.printMenu();

        System.out.println("Enter the Menu Item: ");
        String menuItem=input.nextLine();
        System.out.println("Enter Price: ");
        double price=input.nextDouble();
        System.out.println("Enter Menu Category:");
        String mCategory=input.nextLine();

        System.out.println("Enter the Item is New :");
        String misNew=input.nextLine();
        boolean isNew=false;
        if(misNew=="yes")
        {
            isNew=true;
        }

        MenuItem newMenu4 = new MenuItem(price,menuItem,getcategory(mCategory),isNew);
        currentMenu.addMenu(newMenu4);

        System.out.println("All Menu Items");
        System.out.println("**************");
        currentMenu.printMenu();



    }
    public static MenuItemCategory getcategory(String category)
    {
        if(category=="APPETIZER")
        {
            return MenuItemCategory.APPETIZER;
        }
        else  if(category=="MAINCOURSE")
        {
            return MenuItemCategory.MAINCOURSE;
        }
        else
        {
            return MenuItemCategory.DESSERT;

        }
    }
}
