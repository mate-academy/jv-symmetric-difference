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
        Set<T> firstDifferenceElements = new HashSet<>(set1);
        firstDifferenceElements.removeAll(set2);
        Set<T> secondDifferenceElements = new HashSet<>(set2);
        secondDifferenceElements.removeAll(set1);
        firstDifferenceElements.addAll(secondDifferenceElements);
        return firstDifferenceElements;
    }
}
