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
        Set<T> interimFirst = new HashSet<>();
        Set<T> interimSecond = new HashSet<>();
        interimFirst.addAll(set1);
        interimFirst.removeAll(set2);
        interimSecond.addAll(set2);
        interimSecond.removeAll(set1);
        Set<T> symmetricDifference = new HashSet<>();
        symmetricDifference.addAll(interimFirst);
        symmetricDifference.addAll(interimSecond);
        return symmetricDifference;
    }
}
