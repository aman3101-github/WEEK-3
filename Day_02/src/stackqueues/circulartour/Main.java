package stackqueues.circulartour;

public class Main {
    public static void main(String[] args) {
        CircularTour.PetrolPump[] pumps = {
                new CircularTour.PetrolPump(4, 6),
                new CircularTour.PetrolPump(6, 5),
                new CircularTour.PetrolPump(7, 3),
                new CircularTour.PetrolPump(4, 5)
        };

        int start = CircularTour.findStartingPump(pumps);
        if (start == -1) {
            System.out.println("No solution");
        } else {
            System.out.println("Start at pump: " + start);
        }

    }
}
