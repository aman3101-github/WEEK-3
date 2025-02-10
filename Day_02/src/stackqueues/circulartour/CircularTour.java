package stackqueues.circulartour;

class CircularTour {
    static class PetrolPump {
        int petrol, distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPump(PetrolPump[] pumps) {
        int start = 0, totalPetrol = 0, totalDistance = 0, balance = 0;

        for (int i = 0; i < pumps.length; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;
            balance += pumps[i].petrol - pumps[i].distance;

            if (balance < 0) {
                start = i + 1;
                balance = 0;
            }
        }
        return (totalPetrol >= totalDistance) ? start : -1;
    }
}

