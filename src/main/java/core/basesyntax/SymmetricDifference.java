package core.basesyntax;

import java.util.Set;
import java.util.TreeSet;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 *
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        TreeSet result = new TreeSet();
        TreeSet firstSet = new TreeSet();
        TreeSet secondSet = new TreeSet();
        firstSet.addAll(set1);
        secondSet.addAll(set2);

        int size = set1.size();
        for (int i = 0; i < size; i++) {
            Object firstElement = firstSet.first();
            if (secondSet.contains(firstElement)) {
                secondSet.remove(firstElement);
                firstSet.remove(firstElement);
            } else {
                result.add(firstElement);
                firstSet.remove(firstElement);
            }
        }
        result.addAll(secondSet);

        return result;
    }
}
