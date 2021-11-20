package project1;

import java.util.*;

class task {
  public static void main(String[] args) {
    System.out.println("работаем");
    Scanner input = new Scanner(System.in);
    int temp = input.nextInt();
    if (temp < 0) {
      System.out.println("java huina");
    } else if (temp >= 100) {
      System.out.println("Пар");
    } else {
      System.out.println("Вода");
    }
    input.close();
  }
}