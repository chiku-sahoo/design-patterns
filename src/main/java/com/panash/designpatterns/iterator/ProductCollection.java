package com.panash.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

	private List<Product> products = new ArrayList<>();

	public void push(Product product) {
		products.add(product);
	}

	public Product pop() {
		var lastIndex = products.size() - 1;
		var product = products.get(lastIndex);
		products.remove(lastIndex);
		return product;
	}

	public Iterator<Product> getIterator() {
		return new ListIterator(this);
	}

	public class ListIterator implements Iterator<Product> {

		private ProductCollection collection;
		private int index;

		public ListIterator(ProductCollection collection) {
			this.collection = collection;
		}

		@Override
		public boolean hasNext() {
			return (index < collection.products.size());
		}

		@Override
		public Product current() {
			return collection.products.get(index);
		}

		@Override
		public void next() {
			index++;
		}

	}

}
