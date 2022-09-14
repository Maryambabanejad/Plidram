package Package;

import java.util.Scanner;

public class Motegharen {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String s = reader.nextLine();       // "baccbfccab"
        int len = s.length();              // len=9 جهت بدست آوردن طول رشته ، یک متغییر بنام لن تعریف کرده در این مثال طول رشته ورودی 9 می باشدs.length
        int i = 0;
        int j = len - 1;                      //  وقتی طول رشته 9 باشد j که آخرین کاراکتر رشته محسوب میشود 8 پس میتوان نوشت len-1
        boolean flag = true;
        while (i < j) {                        // دردستور ویل ، آی و جی  درطول رشته و به سمت هم حرکت میکنند و تا زمانیکه طبق این دستور آی پشت جی هست مورد خط 14 را بررسی کن
            if (i != j) {                // در این خط محتوای خانه آی و جی رو بررسی کن تا درصورت نامساوی بودن تمام کنه
                flag = false;
                break;
            }
            i+=1;                               //i++
            j-=1;                               //j--
        }
        if (flag) {                             //اگر flag درست بود چاپ کن YES
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
            //System.out.println(flag);

        }
    }

