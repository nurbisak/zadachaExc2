package com.animal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException {
        /** Напишем калькулятор объёма и полной площади поверхности для разных геометрических фигур.
         После запуска,программа запрашивает для какой фигуры надо рассчитать площадь и объём.
         После ввода параметров,необходимо вывести результаты расчета площадии объема,и вслучае,
         если были допущены пользовательские ошибки привводе параметров фигуры (или прочие
         ошибки),то отобразить сообщение об ошибке и вывести информацию отом,где именно
         произошла эта ошибка (вызвав метод printStackTrace() на экземпляре исключения)
         геометрических фигур:
         ●Параллелепипед (пользователь вводит длину, ширину, высоту)

         ●Сфера (пользователь вводит радиус)

         ●Цилиндр (пользователь вводит радиус основания и высоту)

         ●Конус (пользователь вводит радиус основания и высоту)
         Обязательно учтите и обработайте следующие исключительные
         ситуации:
         ●Ввод отрицательных чисел

         ●Ввод текста

         ●Выбор неверной фигуры для расчета площади и объёма.

         Программа должна быть написана в ООПстиле,учитывать описанные(и возможноещё
         некоторые другие)исключительные ситуации,и иметь удобный интерфейс общения с
         пользователем.*/

        while (true) {

            System.out.println("write from 1 to 4 number:");
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    try {
                        System.out.println("Paralleliped");
                        System.out.println("Write lenght:");
                        int lenght = scanner.nextInt();
                        if (lenght < 0) {
                            throw new MyException("The number must be positive");
                        }
                        System.out.println("write the width:");
                        int width = scanner.nextInt();
                        if (width < 0) {
                            throw new MyException("The number must be positive");
                        }
                        System.out.println("write hight:");
                        int hight = scanner.nextInt();
                        if (hight < 0) {
                            throw new MyException("The number must be bigger then zero");
                        }
                        Paralleliped par = new Paralleliped(lenght, width, hight);
                        par.Paralleliped();
                        par.volume();
                    } catch (MyException myException) {
                        System.out.println(myException.getMessage());

                    } catch (InputMismatchException e) {
                        System.out.println("tolko san jaziniz");
                    }
                    break;
                case 2:
                    System.out.println("Sphere");
                    System.out.println("write radius:");
                    try {
                        double radius = scanner.nextDouble();
                        if (radius < 0) {
                            throw new MyException("radius must be pozitive number");
                        }
                        Sphere sphere = new Sphere(radius);
                        sphere.Sphere();
                        System.out.println(sphere.volSphere());
                    } catch (MyException myException) {
                        System.out.println(myException.getMessage());
                    } catch (InputMismatchException g) {
                        System.out.println("cifra bolus kerek");
                    }
                    break;
                case 3:
                    System.out.println("Cylinder");
                    try {
                        System.out.println("Write hight:");
                        double hight = scanner.nextDouble();
                        if (hight < 0) {
                            throw new MyException("can not be negative");
                        }
                        System.out.println("write base radius");
                        double baseRadius = scanner.nextDouble();
                        if (baseRadius < 0) {
                            throw new MyException("number  must be positive");
                        }
                        Cylinder cylinder = new Cylinder(hight, baseRadius);
                        cylinder.Cylinder();
                        cylinder.VolCylinder();
                    } catch (MyException myException) {
                        System.out.println(myException.getMessage());
                    } catch (InputMismatchException c) {
                        System.out.println("int must be number");

                    }
                    break;
                case 4:

                    System.out.println("Shape");
                    System.out.println("write baseRadius:");

                    double baseRadius1 = scanner.nextDouble();
                    if (baseRadius1 < 0) {
                        throw new MyException("can not negative number");
                    }
                    System.out.println("Write hight:");
                    double hight1 = scanner.nextDouble();
                    if (hight1 < 0) {
                        throw new MyException("write positive number");
                    }
                    Shape shape = new Shape(baseRadius1, hight1);
                    shape.VolShape();
                    shape.Shape();
                    break;
                default:
                    System.out.println("default");
            }

        }
    }
}

