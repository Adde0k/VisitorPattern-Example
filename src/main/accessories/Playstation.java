package main.accessories;

import main.visitors.PlaystationVisitor;

public class Playstation implements PlaystationPart {
    PlaystationPart[] parts;

    public Playstation() {
        parts = new PlaystationPart[] { new Controller(), new Headset(), new Monitor() };
    }

    @Override
    public void accept(PlaystationVisitor visitor) {
        for (PlaystationPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
