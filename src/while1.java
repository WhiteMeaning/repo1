import java.util.ArrayList;
import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {

        int i = 0;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>(5);

        while(i <=4){
            arrayList.add(scanner.nextInt());
            i++;
        }
        System.out.println(arrayList);



//
//
//
//            while (scanner.hasNext()){
//            arrayList.add(scanner.nextInt());
//            i++;
//
//        }



//        int i = 0;
//        while (i<=5){
//            String ss = "Something ";
//            System.out.println(ss + i);
//            i++;
//
//        }

    }}

