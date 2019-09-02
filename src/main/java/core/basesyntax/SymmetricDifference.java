package core.basesyntax;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {


    public java.util.Set<T> symmetricDifference(java.util.Set<? extends T> set1,
                                                java.util.Set<? extends T> set2) {
        java.util.Set<T> resultSet = new java.util.HashSet<T>();
        for (T item : set1) {
            if (!set2.contains(item)) {
                resultSet.add(item);
            }
        }
        for (T item : set2) {
            if (!set1.contains(item)) {
                resultSet.add(item);
            }
        }
        return resultSet;
    }
}
