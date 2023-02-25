package com.panash.designpatterns.iterator;

public class ProductCollectionV2 {

	private Product[] products = new Product[10];
	private int count;

	public void push(Product product) {
		products[count++] = product;
	}

	public Product pop() {
		return products[--count];
	}

	Iterator<Product> getIterator() {
		return new ArrayIterator(this);
	}

	public class ArrayIterator implements Iterator<Product> {

		private ProductCollectionV2 collection;
		private int index;

		public ArrayIterator(ProductCollectionV2 collection) {
			this.collection = collection;
		}

		@Override
		public boolean hasNext() {
			return (index < collection.products.length && collection.products[index] != null);
		}

		@Override
		public Product current() {
			return collection.products[index];
		}

		@Override
		public void next() {
			index++;
		}

	}

}
