import java.util.*;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Hello! Input the size of list: ");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        System.out.println("Input max number of values: ");
        int maxNumber = Integer.parseInt(scanner.nextLine());
        logger.log("Создаем и наполняем список");
        List<Integer> randomList = new ArrayList<>(size);

        Random random = new Random();
        while (randomList.size() < size) {
            int number = random.nextInt(maxNumber + 1);
            randomList.add(number);
        }
        logger.log("Вот случайный список: ");
        System.out.println(randomList);
        logger.log("Просим пользователя ввести входные данные для фильтрации ");

        System.out.println("Input number to sort list: ");
        int sort = Integer.parseInt(scanner.nextLine());
        Filter filter = new Filter(sort);
        logger.log("Запускаем фильтрацию ");
        List<Integer> result = filter.filterOut(randomList);
        System.out.println(result);
        logger.log("Завершаем программу ");
    }
}
