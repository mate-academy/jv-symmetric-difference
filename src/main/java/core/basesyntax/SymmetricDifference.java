package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> difference1 = new HashSet<>();
        Set<T> difference2 = new HashSet<>();
        difference1.addAll(set1);
        difference1.removeAll(set2);
        difference2.addAll(set2);
        difference2.removeAll(set1);
        difference1.addAll(difference2);
        return difference1;
    }
}
