/*
 * Classname: Main
 *
 * @version 22.06.2020
 * @author Ivanna Moskaliuk
 *
 * Module 3 task 2
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework
 *
 * Choose a subject according to your number.
 * Develop a service using all your best in OOP and Java collections.
 *
 * Six methods must be written like in the following example.
 * A point for each one.
 *
 * Creative approaches are welcome.
 * 1. Create two appropriate classes and 5 objects of each one.
 * 2. Calculate   the total salary of a month.
 * 3. Find the highest salary employee.
 * 4. Find he lowest salary employee
 * 5. The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 * ----------------  Subjects according to your number ------------------
 * I was born 10 June 1998, that is why I take variant 10
 * 10. Fitness centre:  minimal month subscription and free choice.
 */

package com.company;

import com.company.model.FreeChoice;
import com.company.model.MonthSubscription;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1. Create two appropriate classes and 5 objects of each one.
        // 5 objects of class MonthSubscription

        MonthSubscription steelGym = new MonthSubscription("Steel Gym", 300);
        MonthSubscription grandPrix = new MonthSubscription("GrandPrix", 1000);
        MonthSubscription sportLife = new MonthSubscription("Sport Life", 490);
        MonthSubscription atletiKo = new MonthSubscription("AtletiKo", 350);
        MonthSubscription reForma = new MonthSubscription("ReForma", 480);

        //// 5 objects of class FreeChoice

        FreeChoice blackAndWhite = new FreeChoice("Black&White", 20, 50);
        FreeChoice hdfStudio =  new FreeChoice("HDF Studio", 18, 85);
        FreeChoice fitFox =  new FreeChoice("FitFox", 10, 60);
        FreeChoice sadhana =  new FreeChoice("Sadhana", 12, 80);
        FreeChoice fitnessSportStyle =  new FreeChoice("Fitness Sport Style",
                20, 80);

        // record objects in ArrayList
        List<IPrice> fitnessCentres = new ArrayList<>();
        fitnessCentres.add(steelGym);
        fitnessCentres.add(grandPrix);
        fitnessCentres.add(sportLife);
        fitnessCentres.add(atletiKo);
        fitnessCentres.add(reForma);

        fitnessCentres.add(blackAndWhite);
        fitnessCentres.add(hdfStudio);
        fitnessCentres.add(fitFox);
        fitnessCentres.add(sadhana);
        fitnessCentres.add(fitnessSportStyle);

        // Calculate the total price of a month
        int price = fitnessCentres.stream().mapToInt(IPrice::getPrice).sum();
        System.out.println("Total price of a month is " + price + "\n");

        // Find the highest price
        IPrice highestPrice = fitnessCentres.stream()
                .max(Comparator.comparingInt(IPrice::getPrice)).orElse(null);
        System.out.println("The highest price is:\n" + highestPrice + "\n");

        // Find the lowest price
        IPrice lowestPrice = fitnessCentres.stream()
                .min(Comparator.comparingInt(IPrice::getPrice)).orElse(null);
        System.out.println("The lowest price is:\n" + lowestPrice + "\n");

        // Find the average price
        double averagePrice = fitnessCentres.stream().mapToInt(IPrice::getPrice)
                .average().orElse(0);
        System.out.println("The lowest price is: " + averagePrice + "\n");

        // Who get higher revenue Month Subscription or Free Choice?
        int monthSubscription = fitnessCentres.stream()
                .filter(el -> el instanceof MonthSubscription)
                .mapToInt(IPrice::getPrice).sum();

        int freeChoice = fitnessCentres.stream()
                .filter(el -> el instanceof FreeChoice)
                .mapToInt(IPrice::getPrice).sum();

        if ( monthSubscription > freeChoice ) {
            System.out.println("Month Subscription get higher revenue than" +
                    " Free Choice - " + monthSubscription);
        } else {
            System.out.println("Free Choice get higher revenue than" +
                    " Month Subscription - " + freeChoice );
        }

    }

}
/*
---------------- output ----------------
Total price of a month is 8310

The highest price is:
FreeChoice{name='Fitness Sport Style', visits=20, pricePerVisit=80}

The lowest price is:
MonthSubscription{name='Steel Gym', pricePerMonth=300}

The lowest price is: 831.0

Free Choice get higher revenue than Month Subscription - 5690

 */