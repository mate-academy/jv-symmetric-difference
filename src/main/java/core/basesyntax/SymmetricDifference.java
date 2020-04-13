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
        Set<T> addSet1withSet2 = new HashSet<>(set1);
        addSet1withSet2.addAll(set2);
        Set<T> commonElementsSet1AndSet2 = new HashSet<>(set1);
        commonElementsSet1AndSet2.retainAll(set2);
        addSet1withSet2.removeAll(commonElementsSet1AndSet2);
        return addSet1withSet2;
    }
}
