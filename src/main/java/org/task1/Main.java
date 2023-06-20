package org.task1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//Пример:
//1 -> 2->3->4
//Вывод:
//4->3->2->1
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов ");
        int n = sc.nextInt();
        sc.close();
        Deque<Integer> ourDeque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            ourDeque.add(i);
        }
        System.out.println(ourDeque);

        System.out.println("Перевернутый список");
        while (ourDeque.size() > 0) {
            System.out.print(ourDeque.pollLast() + " ");
        }
    }
    /**
     * @apiNote Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * @param n Коллекция будет заполняться числами от 1 до n
     * @result Реверс списка
     */
}
