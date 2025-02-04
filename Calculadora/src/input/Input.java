package input;
import java.util.Scanner;
public class Input {
    public int recogerOpcionMenu(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }


    public int recogerNumeros(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public float recogerComponentes(){
        Scanner scan = new Scanner(System.in);
        return scan.nextFloat();
    }
}
