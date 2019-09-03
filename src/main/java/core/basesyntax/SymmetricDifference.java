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
        Set<T> removedSet1 = new HashSet<>();
        Set<T> removedSet2 = new HashSet<>();
        Set<T> result = new HashSet<>();
        removedSet1.addAll(set1);
        removedSet1.removeAll(set2);
        removedSet2.addAll(set2);
        removedSet2.removeAll(set1);
        result.addAll(removedSet1);
        result.addAll(removedSet2);
        return result;
    }
}
