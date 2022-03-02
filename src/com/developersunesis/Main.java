package com.developersunesis;

import com.developersunesis.goodfaith.dip.DesktopComputer;
import com.developersunesis.goodfaith.isp.animals.Cat;
import com.developersunesis.goodfaith.isp.animals.Fish;
import com.developersunesis.goodfaith.lsp.IKing;
import com.developersunesis.goodfaith.lsp.IPrince;
import com.developersunesis.goodfaith.lsp.RoyalSitter;
import com.developersunesis.goodfaith.ocp.IUser;
import com.developersunesis.goodfaith.srp.ICup;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        // Single Responsibility Principle
        S();
        System.out.println();

        // Open-Closed Principle
        O();
        System.out.println();

        // Liskov Substitution Principle
        L();
        System.out.println();

        // Interface Segregation Principle
        I();
        System.out.println();

        // Dependency Inversion Principle
        D();
        System.out.println();
    }

    private static void S(){
        // good faith
        ICup iCup = new ICup(5, 2, 5);
        System.out.println(iCup.volume());

//        String[] foodIngredients = { "Rice", "Salt", "Water", "Onions" };

        // violation
//        iCup.cook(foodIngredients);

        // correction:: create a converter for cup to be extended for cooking use
//        CupCookConverter cupCookConverter = new CupCookConverter(iCup);
//        cupCookConverter.cook(foodIngredients);
    }

    private static void O() throws IllegalAccessException {
        IUser iUser = new IUser();
        iUser.setId("DI-90-X1");
        iUser.setName("John Doe");
        iUser.setAddress("Lagos, Nigeria");

        // good faith
        // we have a unit test on all
        for (Field field : iUser.getClass().getDeclaredFields()) {
            boolean fieldAccessible = field.isAccessible();
            field.setAccessible(true);

            String fName = field.getName();

            switch (fName){
                case "id":
                case "name":
                case "address":
                    Object value = field.get(iUser);
                    System.out.println("property[" + fName + "] = " + value);
                    break;
                default:
                    throw new IllegalAccessException("foreign property[" + fName + "] detected!");
            }

            field.setAccessible(fieldAccessible);
        }

        // correction:: extend IUser as a new subclass Employee instead
//        Employee employee = new Employee();
//        employee.setId("DI-90-X1");
//        employee.setName("John Doe");
//        employee.setAddress("Lagos, Nigeria");
//        employee.setSuperior(iUser);
//        employee.setSalary(BigDecimal.TEN);
//        System.out.println();
//        System.out.println(employee);
    }

    public static void L(){
        IKing iKing = new IKing("Olid", "JAYZ", 40);
        RoyalSitter.sitOnThrone(iKing);

        System.out.println();
        IPrince iPrince = new IPrince("Olid The Second", "JAYZ", 12, iKing);
        RoyalSitter.sitOnThrone(iPrince);
    }

    public static void I() {
        Cat cat = new Cat("black", "land", "Walz");

        System.out.println();
        for (Method method : cat.getClass().getMethods()) {
            try {
                if(method.getParameterCount() > 0) continue;
                method.invoke(cat);
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println();
        Fish fish = new Fish("gold", "water", "Skella");
        for (Method method : fish.getClass().getMethods()) {
            try {
                if(method.getParameterCount() > 0) continue;
                method.invoke(fish);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void D() {
        DesktopComputer desktopComputer = new DesktopComputer();
        desktopComputer.turnOn();
    }
}
