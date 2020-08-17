package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> setsIntersection = new HashSet<>(set1);
        Set<T> resultSet = new HashSet<>(set1);

        setsIntersection.retainAll(set2);
        resultSet.addAll(set2);
        resultSet.removeAll(setsIntersection);
        return resultSet;
    }
}
