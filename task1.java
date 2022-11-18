public class task1 {
    public static void main(String[] args) {
        int[] mass = new int[n];
        int[] resault;
        for(int i = 0; i < n; i++) {
            mass[i] = i+1;
        }
        int repeat;
        if (n % (m-1) == 0){
            repeat = n/(m-1);
        }else{
            repeat = n;
        }
        int start = 0;
        resault = new int[repeat];
        resault[0] = mass[0];
        for(int i = 1; i < resault.length; i++){
            resault[i] = mass[(start + (m-1)) % mass.length];
            start = (start + (m-1)) % mass.length;
        }
        for(int i = 0; i < resault.length; i++) {
            System.out.println(resault[i]);}
    }
}