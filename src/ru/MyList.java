package ru;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyList implements List {
    private ArrayList arrayList;

    public void trimToSize() {
        arrayList.trimToSize();
    }

    public void ensureCapacity(int minCapacity) {
        arrayList.ensureCapacity(minCapacity);
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return arrayList.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return arrayList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return arrayList.lastIndexOf(o);
    }

    @Override
    public Object clone() {
        return arrayList.clone();
    }

    @Override
    public Object[] toArray() {
        return arrayList.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return arrayList.toArray(a);
    }

    @Override
    public Object get(int index) {
        return arrayList.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        return arrayList.set(index, element);
    }

    @Override
    public boolean add(Object o) {
        return arrayList.add(o);
    }

    @Override
    public void add(int index, Object element) {
        arrayList.add(index, element);
    }

    @Override
    public Object remove(int index) {
        return arrayList.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        return arrayList.remove(o);
    }

    @Override
    public void clear() {
        arrayList.clear();
    }

    @Override
    public boolean addAll(Collection c) {
        return arrayList.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return arrayList.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return arrayList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return arrayList.retainAll(c);
    }

    @Override
    public ListIterator listIterator(int index) {
        return arrayList.listIterator(index);
    }

    @Override
    public ListIterator listIterator() {
        return arrayList.listIterator();
    }

    @Override
    public Iterator iterator() {
        return arrayList.iterator();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return arrayList.subList(fromIndex, toIndex);
    }

    @Override
    public void forEach(Consumer action) {
        arrayList.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return arrayList.spliterator();
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return arrayList.removeIf(filter);
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        arrayList.replaceAll(operator);
    }

    @Override
    public void sort(Comparator c) {
        arrayList.sort(c);
    }

    @Override
    public boolean equals(Object o) {
        return arrayList.equals(o);
    }

    @Override
    public int hashCode() {
        return arrayList.hashCode();
    }

    @Override
    public boolean containsAll(Collection c) {
        return arrayList.containsAll(c);
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }

    @Override
    public Stream stream() {
        return arrayList.stream();
    }

    @Override
    public Stream parallelStream() {
        return arrayList.parallelStream();
    }
}
