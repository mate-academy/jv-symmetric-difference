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
    private Set<T> set = new TreeSet<>();

    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        addSymetricDifference(set1, set2);
        addSymetricDifference(set2, set1);
        return set;
    }

    private void addSymetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        for (T element : set1) {
            if (!set2.contains(element)) {
                set.add(element);
            }
        }
    }
}
