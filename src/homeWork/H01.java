package homeWork;
//백엔드스쿨 이승재
public class H01 {

    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for(int i = 1 ; i <10; i++){
            for(int j = 1 ; j <10 ;j++){
                System.out.print(j + "X" + i + "=" + String.format("%02d", i*j));
                System.out.print("          ");
            }
            System.out.println("");
        }
    }
}
