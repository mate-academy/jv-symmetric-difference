package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

/**
 * Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.
 * Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */
public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> difference1 = new HashSet<>((Set<T>) set1);
        difference1.removeAll(set2);
        Set<T> difference2 = new HashSet<>((Set<T>) set2);
        difference2.removeAll(set1);
        difference1.addAll(difference2);
        return difference1;
    }
}
