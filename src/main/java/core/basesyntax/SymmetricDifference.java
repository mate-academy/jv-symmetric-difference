package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        Set<T> difference = new HashSet<>(set1);
        difference.addAll(set2);
        difference.removeAll(intersection);
        return difference;
    }
}
