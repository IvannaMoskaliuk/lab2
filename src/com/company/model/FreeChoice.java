/*
 * Classname: FreeChoice
 *
 * @version 22.06.2020
 * @author Ivanna Moskaliuk

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
 * 5.  The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 * ----------------  Subjects according to your number ------------------
 * I was born 10 June 1998, that is why I take variant 10
 * 10. Fitness centre:  minimal month subscription and free choice.
 */

package com.company.model;

import com.company.IPrice;

public class FreeChoice implements IPrice {

    public String name;
    public int visits;
    public int pricePerVisit;

    // Constructor empty
    public FreeChoice() {
    }

    // Constructor full
    public FreeChoice(String name, int visits, int pricePerVisit) {
        this.name = name;
        this.visits = visits;
        this.pricePerVisit = pricePerVisit;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public int getPricePerVisit() {
        return pricePerVisit;
    }

    public void setPricePerVisit(int pricePerVisit) {
        this.pricePerVisit = pricePerVisit;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "FreeChoice{" +
                "name='" + name + '\'' +
                ", visits=" + visits +
                ", pricePerVisit=" + pricePerVisit +
                '}';
    }

    // method Override from Interface
    @Override
    public int getPrice() {
        return this.getPricePerVisit() * this.getVisits();
    }
}
