package com.binar;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] arrayOfNumber = new int[2][2];
//
//             // 0  1  2
//        //0  // 5  3  1
//        //1  // 7  0  4
//        //2  // 9  6  8
//
//        //arrayOfNumber[2][1] = 6
//        //arrayOfNumber[0][2] = 1
//        //arrayOfNumber[1][0] = 7
//        //arrayOfNumber[1][1] = 0
//
//        //FOR PERTAMA BARIS
//        for(int baris = 0; baris < arrayOfNumber.length ; baris++){
//            //FOR KEDUA KOLOM
//            //kolom++ == kolom = kolom+1
//            //kolom-- == kolom = kolom-1
//
//            for (int kolom = 0; kolom < arrayOfNumber.length ; kolom++){
//                System.out.print("Input nilai baris "+baris+" kolom "+kolom+" : ");
//                arrayOfNumber[baris][kolom] = sc.nextInt();
//            }
//        }
//
//        for(int baris = 0; baris < arrayOfNumber.length ; baris++){
//            //FOR KEDUA KOLOM
//            for (int kolom = 0; kolom < arrayOfNumber.length ; kolom++){
//                System.out.print(arrayOfNumber[baris][kolom]+" ");
//            }
//            System.out.println();
//        }

        int num = 0;

        //num++ = post increment
        //++num = pre increment

        int result = ++num;
        System.out.println("Nilai akhir result : "+ result);
        System.out.println("Nilai akhir num : "+ num);
    }
}

//Java Basic
//Struktur data (Data Type Primitive ==> String, Int, Long, Float
//Double, dkk + Reference Type (Array, LinkedList, DLL, ArrayList))

//Conditional (If-else Switch-Case)

//Loop (For, While, do-while, recursive function)

//OOP
//Class & Object
//Entity, Method, Constructor, Secondary Constructor
//Inheritance, Overloading, Overriding, Abstraction, Polymorphism, Interface
//Static