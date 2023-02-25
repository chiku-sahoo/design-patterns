package com.panash.designpatterns.iterator;

public interface Iterator<T> {

	boolean hasNext();

	T current();

	void next();
}
