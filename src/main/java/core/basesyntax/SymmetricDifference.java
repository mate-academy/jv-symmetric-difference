package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> uniqueElements = new HashSet<>(set1);
        Set<T> uniqueElementsOfSet2 = new HashSet<>(set2);
        uniqueElements.removeAll(set2);
        uniqueElementsOfSet2.removeAll(set1);
        uniqueElements.addAll(uniqueElementsOfSet2);
        return uniqueElements;
    }
}
