package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void addMenu(MenuItem items )
    {
        this.items.add(items);
    }

    public void removeMenu(MenuItem items)
    {
        this.items.remove(items);
    }

    public void printMenu(){
        for( MenuItem m : items)
        {
            System.out.println(m.getDescription() + " Price is $" + m.getPrice());
        }
    }
}


