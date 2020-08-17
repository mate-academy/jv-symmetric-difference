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
        Set<T> differenceSet1 = new HashSet<>(set1);
        differenceSet1.removeAll(set2);
        Set<T> differenceSet2 = new HashSet<>(set2);
        differenceSet2.removeAll(set1);
        differenceSet1.addAll(differenceSet2);
        return differenceSet1;
    }
}
