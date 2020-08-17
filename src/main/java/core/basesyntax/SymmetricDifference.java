package core.basesyntax;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 *
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        return (Set<T>) Stream.concat(
                set1.stream(),
                set2.stream())
                .filter(x -> !(set1.contains(x) && set2.contains(x)))
                .collect(Collectors.toSet());
    }
}
