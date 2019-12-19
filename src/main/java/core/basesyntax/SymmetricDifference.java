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
        Set<T> symmetricDifference = new HashSet<>();
        Set<T> interim = new HashSet<>();
        symmetricDifference.addAll(set1);
        symmetricDifference.addAll(set2);
        interim.addAll(set1);
        interim.retainAll(set2);
        symmetricDifference.removeAll(interim);
        return symmetricDifference;
    }
}
