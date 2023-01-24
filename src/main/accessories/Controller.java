package main.accessories;

import main.visitors.PlaystationVisitor;

public class Controller implements PlaystationPart {

    @Override
    public void accept(PlaystationVisitor visitor) {
        visitor.visit(this);
    }
}
