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
        Set<T> hashSet1 = new HashSet<>(set1);
        Set<T> hashSet2 = new HashSet<>(set2);
        hashSet1.removeAll(set2);
        hashSet2.removeAll(set1);
        hashSet1.addAll(hashSet2);
        return hashSet1;
    }
}
