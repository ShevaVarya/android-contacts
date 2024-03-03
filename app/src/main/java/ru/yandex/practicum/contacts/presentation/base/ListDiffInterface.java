package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <E> {

    boolean theSameAs(E e);

    boolean equals(Object o);
}
