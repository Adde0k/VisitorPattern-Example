package main.visitors;

import main.accessories.Headset;
import main.accessories.Monitor;
import main.accessories.Playstation;

public interface PlaystationVisitor {

    public void visit(main.accessories.Controller controller);

    public void visit(Headset headset);

    public void visit(Monitor monitor);

    public void visit(Playstation playstation);

}
