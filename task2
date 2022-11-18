import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int radius = sc.nextInt();
        float[] mass = new float[6];
        double[] res = new double[3];
        for(int i = 0; i < 6; i++){
            mass[i] = sc.nextFloat();
        }
        int i = 0;
        while(i < 3){
            res[i] = Math.pow((Math.pow((mass[i*2] - x), 2) + Math.pow((mass[i*2+1])-y, 2)), 0.5);
            i++;
        }
        for(int j = 0; j < res.length; j++){
            if(res[j] > radius){
                System.out.println("точка снаружи");
            }else{
                if(res[j] == radius){
                    System.out.println("точка лежит на окружности" );
                }else{
                    System.out.println("точка внутри");
                }
            }
        }
    }
}