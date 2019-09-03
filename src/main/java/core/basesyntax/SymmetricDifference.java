package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 *
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> allSet = new HashSet<>();
        Set<T> result = new HashSet<>();
        allSet.addAll(set1);
        allSet.addAll(set2);
        for (T element : allSet) {
            if (set1.contains(element) && set2.contains(element)) {
                continue;
            }
            result.add(element);
        }
        return result;
    }
}
