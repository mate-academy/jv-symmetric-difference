package core.basesyntax;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SymmetricDifference<T> {

    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> a = new HashSet<>(set1);
        Set<T> b = new HashSet<>(set2);
        Iterator<T> c = a.iterator();
        while (c.hasNext()) {
            T testNext = c.next();
            if (b.contains(testNext)) {
                b.remove(testNext);
            } else {
                b.add(testNext);
            }
        }
        return b;
    }
}
