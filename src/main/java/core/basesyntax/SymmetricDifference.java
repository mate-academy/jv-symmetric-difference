package core.basesyntax;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 *
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new LinkedHashSet<>();
        addUnique(set1, set2, result);
        addUnique(set2, set1, result);
        return result;
    }

    private void addUnique(Set<? extends T> getFrom, Set<? extends T> exceptFrom, Set<T> set3) {
        for (T item: getFrom) {
            if (!exceptFrom.contains(item)) {
                set3.add(item);
            }
        }
    }
}
