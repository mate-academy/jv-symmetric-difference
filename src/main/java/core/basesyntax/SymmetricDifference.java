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
        Set<T> set1WithoutSet2 = new TreeSet<>(set1);
        set1WithoutSet2.removeAll(set2);
        Set<T> set2WithoutSet1 = new TreeSet<>(set2);
        set2WithoutSet1.removeAll(set1);
        set1WithoutSet2.addAll(set2WithoutSet1);
        return set1WithoutSet2;
    }
}
