package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {

    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> uniqueElements = new HashSet<>();
        uniqueElements.addAll(set1);
        uniqueElements.addAll(set2);
        set2.retainAll(set1);
        uniqueElements.removeAll(set2);
        return uniqueElements;
    }
}
