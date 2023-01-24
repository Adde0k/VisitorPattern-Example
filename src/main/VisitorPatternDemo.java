package main;

import main.accessories.Playstation;
import main.visitors.PlaystationPrintVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        Playstation playstation = new Playstation();

        System.out.println("\nNow visiting all Playstation parts:\n");
        playstation.accept(new PlaystationPrintVisitor());
    }
}
