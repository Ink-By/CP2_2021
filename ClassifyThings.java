package week6;

import java.util.ArrayList;
import java.util.Scanner;

enum Fruits     {apple, banana, berry, grape, kiwi, lemon, mango, melon, orange, peach}
enum Animals    {cat, chicken, cow, dog, dolphin, duck, lion, pig, tiger, whale}
enum Cities     {beijing, berlin, london, moscow, newyork, paris, rome, seoul, sydney, tokyo}

class Object {
    String name;
    public Object(String n)     { name = n; }
    public String toString()    { return name;}
}

class Fruit extends Object      { public Fruit(String s){ super(s); }}
class Animal extends Object     { public Animal(String s){ super(s); }}
class City extends Object       { public City(String s){ super(s); }}
class Other extends Object      { public Other(String s){ super(s); }}

public class ClassifyThings {
    public static void main(String[] args) {
        Box<Fruit>  fruitBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<City>   subjectBox = new Box<>();
        Box<Other>  otherBox = new Box<>();

        Scanner sc = new Scanner(System.in);
        String[] things = sc.nextLine().split(" ");
        sc.close();

        Fruits[] fruits = Fruits.values();
        Animals[] animals = Animals.values();
        Cities[] cities = Cities.values();

        for (int i = 0; i < things.length; i++) {
            if (contains(fruits, things[i])) {
                fruitBox.add(new Fruit(things[i]));
            } else if (contains(animals, things[i])) {
                animalBox.add(new Animal(things[i]));
            } else if (contains(cities, things[i])) {
                subjectBox.add(new City(things[i]));
            } else {
                otherBox.add(new Other(things[i]));
            }
        }

        System.out.println(fruitBox);
        System.out.println(animalBox);
        System.out.println(subjectBox);
        System.out.println(otherBox);
    }

    @SuppressWarnings("rawtypes")
    static <T extends Enum> boolean contains(T[] temp, String thing) {
       /*
       Check if the thing belongs to that enum.
        */
        int flag = 1;
        for (int i = 0; i < temp.length; i++) {

            if (temp[i].name().equals(thing)) {
                flag=0;
                break;

            } else {
                flag=1;
            }
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item)            { list.add(item); }
    public String toString()    { return list.toString(); }
}