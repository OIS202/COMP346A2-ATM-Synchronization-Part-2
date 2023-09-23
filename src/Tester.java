import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
public class Tester {

	public static void main(String[] args) {
		
        int y = 1;
        test(y);
        System.out.println(y);

	}
	public static int test(int x) {
		++x;
		return x;
	}

}
