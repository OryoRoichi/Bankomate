package bankomate.services;

import java.util.Scanner;

public class IOServiceImpl implements IOService {


    public String read() {
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    public void write(String message) {
        System.out.println(message);
    }
}
