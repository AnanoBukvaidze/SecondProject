package org.example;

public class Main3 {
    public static void main(String[] args){
        //რიცხვების მასივი
        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        //ცვლადში ინახება მასივის სიგრძე
        int length = arr.length;

        //გარე ლუპი, რომელიც დატრიალდება 9-ჯერ(მასივის სიგრძის შესაბამისად)
        for (int i = 0; i < length; i++){

            //შიდა ლუპი დატრიალდება 9*9-ჯერ, ყოველი იტერაციისას ერთ ელემენტს ადარებს ყველა სხვა ელემენტს მასივიდან
            for(int j = 0; j < length; j++){

                if(arr[j] > arr[i]){
                    //დროებითი ცვლადი, რომელშიც დროებით ვინახავთ მნიშვნელობას რათა არ დაგვეკარგოს
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        //ციკლი ბეჭდავს მასივის ყველა ელემენტს
        for (int i = 0; i < length; i ++){
            System.out.println(arr[i]);
        }
    }
}
