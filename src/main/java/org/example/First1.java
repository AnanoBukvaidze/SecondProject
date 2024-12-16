package org.example;
//კლასი First1 მივანიჭეთ მშობელ კლასს- First
public class First1 extends First{

    //მშობელ კლასში შექმნილ აბსტრაქტულ მეთოდს გავუკეთეთ overriding
    public void countVowel(String s){

        //ცვლადში count ვინახავთ ხმოვნების რაოდენობას
        int count = 0;
        //ცვლადი s გადავიყვანეთ პატარა სიმბოლოებად
        s = s.toLowerCase();

        //ციკლით გადავუარეთ სტრინგის მთლიან სიგრძეს
        for(int i = 0; i < s.length(); i++) {

            //ცვლადში currentChar ვინახავთ მიმდინარე სიმბოლოს
            char currentChar = s.charAt(i);
            //ვამოქმებთ ყოველ სიმბოლოს და რომელიმე თუ ხმოვანია, ცვლადს count ვუმატებთ ერთს, რათა დავითვალოთ რაოდენობა
            if (currentChar == ('a') || currentChar == ('e') || currentChar == ('i') || currentChar == ('o') || currentChar == ('u')) {
                count ++;
            }
        }
        //ვბეჭდავთ შედეგს, არის თუ არა სტრიქონში ხმოვანი და თუ არის, რამდენი
        if (count > 0) {
            System.out.println("ამ სტრიქონში არის " + count + " ხმოვანი");
        }
        else{
            System.out.println("ამ სტრიქონში არ არის არცერთი ხმოვანი");
        }
    }
}
