package main.visitors;

import main.accessories.Controller;
import main.accessories.Headset;
import main.accessories.Monitor;
import main.accessories.Playstation;

public class PlaystationPrintVisitor implements PlaystationVisitor {

    @Override
    public void visit(Controller controller) {
        System.out.println(" - Controller");
    }

    @Override
    public void visit(Headset headset) {
        System.out.println(" - Headset");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println(" - Monitor");
    }

    @Override
    public void visit(Playstation playstation) {
        System.out.println("\nAll parts, including the Playstation itself, are present.");
    }
}
