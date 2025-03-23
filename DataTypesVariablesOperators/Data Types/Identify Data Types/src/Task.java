public class Task {
    byte personAge = 86;
    int cityPopulation = 10_000_000;
    long distanceBetweenPlanets = 100_000_000_000L;
    char gender = 'F';
    boolean flag = true;
    double pi = 3.141592653589793D;

    public static void main(String[] args) {
        Task task = new Task();
        System.out.println("personAge uses: " + ((Object) task.personAge).getClass().getSimpleName());
        System.out.println("cityPopulation uses: " + ((Object) task.cityPopulation).getClass().getSimpleName());
        System.out.println("distanceBetweenPlanets uses: " + ((Object) task.distanceBetweenPlanets).getClass().getSimpleName());
        System.out.println("gender uses: " + ((Object) task.gender).getClass().getSimpleName());
        System.out.println("flag uses: " + ((Object) task.flag).getClass().getSimpleName());
        System.out.println("pi uses: " + ((Object) task.pi).getClass().getSimpleName());

    }
}