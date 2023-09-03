import ru.netology.services.RestMonthsNumber;

public class Main {

    public static void main(String[] args) {
        RestMonthsNumber service = new RestMonthsNumber();
        System.out.println(service.calcNumber(10, 3, 20));
        System.out.println(service.calcNumber(100, 60, 150));
    }
}