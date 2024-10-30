package client.adapter;

import client.RoundPeg;
import service.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 * An adapter class lets you fit square pegs into round holes.
 * It extends the RoundPeg class to let the adapter objects act
 * as round pegs.
 */
public class SquarePegAdapter extends RoundPeg {
    // In reality, the adapter contains an instance of the
    // SquarePeg class.
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg){
        super();
        this.squarePeg = squarePeg;
    }

    public double getRadius(){
        // The adapter pretends that it's a round peg with a
        // radius that could fit the square peg that the adapter
        // actually wraps.
        return squarePeg.getWidth() / Math.sqrt(2);
    }
}
