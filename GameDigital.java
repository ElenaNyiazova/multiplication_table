import java.util.Scanner;

public class GameDigital {
    public static void main(String args[]) throws java.io.IOException{
        int x,y,z,answer,r,q;
        r=0;q=0;
        System.out.println("*** Проверяем таблицу умножения ***");
        System.out.println(" Для выхода ответь 0");
        do{
            q++;
            x=(int)(Math.random()*10)+1;
            y=(int)(Math.random()*10)+1;
            z=x*y;
            System.out.print("Сколько будет "+x+" * "+y+" = ");
            Scanner scanner=new Scanner(System.in);
            answer=scanner.nextInt();
            if (answer==0){
                q--;
                System.out.println("Правельных ответов: "+r+" из "+q);
                System.out.println("Выход из програмы");
                break;
            }
            else if(answer==z){
                System.out.println("Правельно!");
                r++;
            } else {
                System.out.println("Не верно! Правельный ответ: "+z+" \nОтветь на следующий вопрос");
            }
        }while (answer!=0);
    }
}
