package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> uniqueFromFirst = new HashSet<>(set1);
        uniqueFromFirst.removeAll(set2);
        Set<T> uniqFromSecond = new HashSet<>(set2);
        uniqFromSecond.removeAll(set1);
        uniqueFromFirst.addAll(uniqFromSecond);
        return uniqueFromFirst;
    }
}
