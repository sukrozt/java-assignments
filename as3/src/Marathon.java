//The goal of the code is to find the minimum value and the second-minimum value of an array.
//Here, array "times" represents runnning times of students.
class Marathon {
    public static int findFastest(int[] array){ //method gives the index of the fastest student's index in array
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (minValue < array[i])
                continue;
            else
                 minValue = array[i];
            minIndex = i;
        }
        return minIndex;
    }

    public static int findSecFastest(int[] array) { //method gives the second-fastest student's index in array
        int minValueIndex = findFastest(array);
        int fastestKidTime = array[minValueIndex];
        int minSecValue = 0;
        int minSecIndex = 1;
        for (int i = 1; i < array.length; i++) {
            if (minSecValue > array[i] && minSecValue != fastestKidTime)
                minSecValue = array[i];
            minSecIndex = i;
        }
        return minSecIndex;
    }
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
       System.out.println("The fastest student is: " + names[findFastest(times)] +
       "\nRunning time is " + times[findFastest(times)] + " minutes.");
        System.out.println("\nThe second-fastest student is: " + names[findSecFastest(times)] +
                "\nRunning time is " + times[findSecFastest(times)] + " minutes.");
    }
}
