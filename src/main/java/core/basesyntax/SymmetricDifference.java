package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> tempSet = new HashSet<>();
        Set<T> difference = new HashSet<>();
        tempSet.addAll(set1);
        tempSet.removeAll(set2);
        difference.addAll(set2);
        difference.removeAll(set1);
        difference.addAll(tempSet);
        return difference;
    }
}
