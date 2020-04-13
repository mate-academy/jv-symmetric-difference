package core.basesyntax;

import java.util.Collection;
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
        Collection intersection = new HashSet(set1);
        intersection.retainAll(set2);
        Collection result = new HashSet(set1);
        result.addAll(set2);
        result.removeAll(intersection);
        return (Set<T>) result;

    }
}
