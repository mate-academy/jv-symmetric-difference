package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> tempSet = new HashSet<>(set1);
        Set<T> difference = new HashSet<>(set2);
        tempSet.removeAll(set2);
        difference.removeAll(set1);
        difference.addAll(tempSet);
        return difference;
    }
}
