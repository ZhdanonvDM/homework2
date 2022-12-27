public class Task8 {
    public static void main(String[] args) {
        var totalTime = 640;
        var timeWorker = 8;
        var amountWorker = totalTime/timeWorker;
        System.out.println("Всего работников в компании — " + amountWorker + " человек");
        amountWorker = amountWorker + 94;
        timeWorker = totalTime/amountWorker;
        System.out.println("Если в компании работает " + amountWorker + " человек(а), то всего " + timeWorker+ " часа(ов) работы может быть поделено между сотрудниками");
       }
}
