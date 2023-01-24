package main.accessories;

import main.visitors.PlaystationVisitor;

public interface PlaystationPart {

    public void accept(PlaystationVisitor visitor);
}
