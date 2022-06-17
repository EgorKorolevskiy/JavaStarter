package Conditions004;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        String hotWeather = "Теплая погода";
        String coldWeather = "Холодная погода";
        String snowWeather = "Снежная погода";
        String darkWeather = "Ночная погода";
        String foggyWeather = "Туманная погода";
        String sunnyWeather = "Солнечная погода";
        String rainyWeather = "Дождливая погода";
        String wetWeather = "Мокрая погода";
        String windyWeather = "Ветренная погода";
        String goodWeather = "Хорошая погода";
        String weather;

        System.out.print("Вас приветствует переводчик! Введите погоду: ");

        Scanner input = new Scanner(System.in);
        String buff = input.nextLine();

//         метод через условные операторы

        if (buff.equals(hotWeather)) {
            System.out.println("Hot weather");
        } else if (buff.equals(coldWeather)) {
            System.out.println("Cold weather");
        } else if (buff.equals(snowWeather)) {
            System.out.println("Snow weather");
        } else if (buff.equals(darkWeather)) {
            System.out.println("Dark weather");
        } else if (buff.equals(foggyWeather)) {
            System.out.println("Foggy weather");
        } else if (buff.equals(sunnyWeather)) {
            System.out.println("Sunny weather");
        } else if (buff.equals(rainyWeather)) {
            System.out.println("Rainy weather");
        } else if (buff.equals(wetWeather)) {
            System.out.println("Wet weather");
        } else if (buff.equals(windyWeather)) {
            System.out.println("Windy weather");
        } else if (buff.equals(goodWeather)) {
            System.out.println("Good weather");
        }
        else {
            System.out.println("Такой погоды нет");
        }

        // метод через тернарные операторы

//        weather = buff.equals(hotWeather) ? "Hot weather" : buff.equals(coldWeather) ? "Cold weather" : "Такого слова нет";
//        System.out.println(weather);

////         // метод через оператор многозначного выбора
//
//        switch (buff) {
//            case "Теплая погода": {
//                System.out.println("Hot weather");
//                break;
//            }
//            case "Холодная погода": {
//                System.out.println("Cold weather");
//                break;
//            }
//            case "Снежная погода": {
//                System.out.println("Snow Weather");
//                break;
//            }
//            case "Ночная погода": {
//                System.out.println("Dark weather");
//                break;
//            }
//            case "Туманная погода": {
//                System.out.println("Foggy weather");
//                break;
//            }
//            case "Солнечная погода": {
//                System.out.println(" Sunny weather");
//                break;
//            }
//            case "Дождливая погода": {
//                System.out.println("Rainy weather");
//                break;
//            }
//            case "Мокрая погода": {
//                System.out.println("Wet weather");
//                break;
//            }
//            case "Ветренная погода": {
//                System.out.println("Windy weather");
//                break;
//            }
//            case "Хорошая погода": {
//                System.out.println("Good weather");
//                break;
//            }
//            default: {
//                System.out.println("Нет такой погоды");
//                break;
//            }
        }
    }
