import java.util.Scanner;
public class tugasAok30Okt {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner (System.in);
        int opsi;
        do {
            System.out.println("pilih opsi di bawah ini");
            System.out.println("1) Biner ke Desimal");
            System.out.println("2) Desimal ke Biner");
            System.out.println("3) Biner ke Hexa");
            System.out.println("4) Hexa ke Biner");
            System.out.println("5) Desimal ke Hexa");
            System.out.println("6) Hexa ke Desimal");
            System.out.println("0) keluar");
            opsi = masukkan.nextInt();
            switch (opsi) {
                case 1:
                    System.out.println("masukkan angka biner");
                    String binary = masukkan.next();
                    int desimal = Integer.parseInt(binary, 2);
                    System.out.println("Desimal: " + desimal);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal2 = masukkan.nextInt();
                    String biner = "";

                    while (desimal2 > 0) {
                        int sisa = desimal2 % 2;
                        biner = sisa + biner;
                        desimal2 = desimal2 / 2;
                    }
                    System.out.println("Biner: " + biner);
                    break;
                case 3:
                    System.out.println("masukkan angka biner");
                    String binary3 = masukkan.next();
                    int desimal3 = Integer.parseInt(binary3, 2);
                    String hexaDesimal = "";

                    while (desimal3 > 0) {
                        int sisa = desimal3 % 16;
                        char simbol = (sisa < 10) ? (char) ('0' + sisa) : (char) ('A' + (sisa - 10));
                        hexaDesimal = simbol + hexaDesimal;
                        desimal3 = desimal3 / 16;
                    }
                    System.out.println("Hexadesimal: " + hexaDesimal);
                    break;
                case 4:
                    System.out.println("masukkan angka hexadesimal");
                    String hexaDesimal4 = masukkan.next();
                    int desimal4 = Integer.parseInt(hexaDesimal4, 16);
                    String biner4 = "";

                    while (desimal4 > 0) {
                        int sisa = desimal4 % 2;
                        biner4 = sisa + biner4;
                        desimal4 = desimal4 / 2;
                    }
                    System.out.println("Biner: " + biner4);
                    break;
                case 5:
                    System.out.println("Masukkan bilangan desimal: ");
                    int desimal5 = masukkan.nextInt();
                    String hexaDesimal5 = "";

                    while (desimal5 > 0) {
                        int sisa = desimal5 % 16;
                        char simbol = (sisa < 10) ? (char) ('0' + sisa) : (char) ('A' + (sisa - 10));
                        hexaDesimal5 = simbol + hexaDesimal5;
                        desimal5 = desimal5 / 16;
                    }
                    System.out.println("Hexadesimal: " + hexaDesimal5);
                    break;
                case 6:
                    System.out.println("masukkan angka hexadesimal");
                    String hexaDesimal6 = masukkan.next();
                    int desimal6 = Integer.parseInt(hexaDesimal6, 16);
                    System.out.println("Desimal: " + desimal6);
                    break;

                default:
                    if(opsi == 0){
                        System.out.println("anda memilih untuk keluar");
                    }else{
                        System.out.println("tidak ada dalam pilihan");
                    }
            }
            }while(opsi != 0);
        }
    }





//MENGUBAH BILANGAN DESIMAL KE BINER
//import java.util.Scanner;
//public class tugasAok30Okt {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan bilangan desimal: ");
//        int desimal = input.nextInt();
//        String biner = "";
//
//            while (desimal > 0) {
//                int sisa = desimal % 2;
//                biner = sisa + biner;
//                desimal = desimal / 2;
//            }
//        System.out.print(biner);
//    }
//}

//MENGUBAH BINER KE DESIMAL
//import java.util.Scanner;
//public class tugasAok30Okt {
//    public static void main(String[] args) {
//        Scanner masukkan = new Scanner (System.in);
//        System.out.println("masukkan angka biner");
//        String binary = masukkan.nextLine();
//        int decimal = Integer.parseInt(binary, 2);
//
//        System.out.println("Biner: " + binary);
//        System.out.println("Desimal: " + decimal);
//    }
//}

//MENGUBAH HEXADESIMAL KE DESIMAL
//import java.util.Scanner;
//public class tugasAok30Okt {
//    public static void main(String[] args) {
//        Scanner masukkan = new Scanner (System.in);
//        System.out.println("masukkan angka hexadesimal");
//        String hexaDesimal = masukkan.nextLine();
//        int decimal = Integer.parseInt(hexaDesimal, 16);
//
//        System.out.println("Hexadesimal: " + hexaDesimal);
//        System.out.println("Desimal: " + decimal);
//    }
//}

//MENGUBAH DESIMAL KE HEXADESIMAL
//import java.util.Scanner;
//public class tugasAok30Okt {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan bilangan desimal: ");
//        int desimal = input.nextInt();
//        String hexaDesimal = "";
//
//        while (desimal > 0) {
//            int sisa = desimal % 16;
//            char simbol = (sisa < 10) ? (char) ('0' + sisa) : (char) ('A' + (sisa - 10));
//            hexaDesimal = simbol + hexaDesimal;
//            desimal = desimal / 16;
//        }
//        System.out.print(hexaDesimal);
//    }
//}

//BINER KE HEXADESIMAL
//import java.util.Scanner;
//public class tugasAok30Okt {
//    public static void main(String[] args) {
//        Scanner masukkan = new Scanner (System.in);
//        System.out.println("masukkan angka biner");
//        String binary = masukkan.nextLine();
//        int desimal = Integer.parseInt(binary, 2);
//        String hexaDesimal = "";
//
//        while (desimal > 0) {
//            int sisa = desimal % 16;
//            char simbol = (sisa < 10) ? (char) ('0' + sisa) : (char) ('A' + (sisa - 10));
//            hexaDesimal = simbol + hexaDesimal;
//            desimal = desimal / 16;
//        }
//        System.out.print(hexaDesimal);
//    }
//}

//HEXADESIMAL KE BINER
//import java.util.Scanner;
//public class tugasAok30Okt {
//    public static void main(String[] args) {
//        Scanner masukkan = new Scanner (System.in);
//        System.out.println("masukkan angka hexadesimal");
//        String hexaDesimal = masukkan.nextLine();
//        int desimal = Integer.parseInt(hexaDesimal, 16);
//        Scanner input = new Scanner(System.in);
//        String biner = "";
//
//        while (desimal > 0) {
//            int sisa = desimal % 2;
//            biner = sisa + biner;
//            desimal = desimal / 2;
//        }
//        System.out.print(biner);
//    }
//}