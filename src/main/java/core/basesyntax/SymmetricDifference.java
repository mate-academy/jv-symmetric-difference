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
        Set<T> resultSet = new HashSet<>();
        Set<T> resultSet1 = new HashSet<>(set1);
        resultSet1.removeAll(set2);
        Set<T> resultSet2 = new HashSet<>(set2);
        resultSet2.removeAll(set1);
        resultSet.addAll(resultSet1);
        resultSet.addAll(resultSet2);
        return resultSet;
    }
}
