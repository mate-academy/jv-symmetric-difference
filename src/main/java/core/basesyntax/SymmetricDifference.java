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
        HashSet<T> myHashSet = new HashSet<>();
        for (T i : set1)
            if (!set2.contains(i)) myHashSet.add(i);
        for (T i : set2)
            if (!set1.contains(i)) myHashSet.add(i);
        return myHashSet;
    }
}
