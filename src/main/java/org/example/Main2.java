package org.example;

//Main2 აკეთებს ორი ინტერფეისის იმპლემენტაციას
public class Main2 implements Interface1, Interface2{
    public static void main(String[] args){

        //მეინ კლასის ობიექტი
        Main2 object = new Main2();
        //ობიექტი იძახებს მეთოდებს
        object.replaceSymbolA("LELA");
        object.replaceSymbolB("Gabelaia");
    }

    //interface1-ში არსებული მეთოდის ოვერრაიდინგი
    public void replaceSymbolA(String a){
        String finalString = a.replace('a', 'z').replace('A', 'z');
        System.out.println(finalString);
    }

    //interface2-ში არსებული მეთოდის ოვერრაიდინგი
    public void replaceSymbolB(String b){
        String finalString = b.replace('b', 'w').replace('B', 'w');
        System.out.println(finalString);
    }
}
