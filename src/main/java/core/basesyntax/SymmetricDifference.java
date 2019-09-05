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
        Set<T> temp1 = new HashSet<>(set1);
        Set<T> temp2 = new HashSet<>(set2);
        temp1.removeAll(set2);
        temp2.removeAll(set1);
        Set<T> symmetricDifference = new HashSet<>();
        symmetricDifference.addAll(temp1);
        symmetricDifference.addAll(temp2);
        return symmetricDifference;
    }
}


