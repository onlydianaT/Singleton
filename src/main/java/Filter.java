import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < source.size(); i++) {
            int num = source.get(i);
            if (num <= treshold) {
                result.add(num);
                logger.log("Элемент " + num + " проходит");
                count++;
            } else {
                logger.log("Элемент " + num + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + count + " элемента из " + source.size());
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        return result;
    }
}
