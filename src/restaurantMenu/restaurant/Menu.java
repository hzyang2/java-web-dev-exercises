package restaurantMenu.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> appetizer = new ArrayList<>();
    ArrayList<MenuItem> mainCourse = new ArrayList<>();
    ArrayList<MenuItem> dessert = new ArrayList<>();


    private Date lastUpdated = new Date();

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(MenuItem aMenuItem) {
        this.appetizer.add(aMenuItem);
    }
}

 /*   public void setAppetizer(MenuItem aMenuItem) {
        this.appetizer.add(aMenuItem);
    }*/


