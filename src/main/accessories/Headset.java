package main.accessories;

import main.visitors.PlaystationVisitor;

public class Headset implements PlaystationPart {

    @Override
    public void accept(PlaystationVisitor visitor) {
        visitor.visit(this);
    }
}
