import client.RoundHole;
import client.RoundPeg;
import client.adapter.SquarePegAdapter;
import service.SquarePeg;

public class Application {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)) {
            System.out.println("Round peg with radius 5 fits round hole with radius 5.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSquarePeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg with width 2 fits round hole with radius 5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg with width 20 does not fit into round hole with radius 5.");
        }
    }
}
