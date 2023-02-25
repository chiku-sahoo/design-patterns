package com.panash.designpatterns.iterator;

public class Executor {

	public static void main(String[] args) {

		ProductCollection collection = new ProductCollection();

		var product = new Product("Himani Shampoo", 123);
		collection.push(product);
		product = new Product("Trimmer", 1800);
		collection.push(product);
		product = new Product("Hair Cream", 355);
		collection.push(product);

		/**
		 * Using the push and pop interfaces we can add and remove products.
		 * 
		 * But to iterate over the collection we need the collection data structure
		 * itself. But in future if the underlying data structure itself changes (eg.
		 * list to fixed size array or stack) then the client code (Main class in this
		 * example) has to change.
		 * 
		 * Instead we will use iterator pattern. It doesn't bother about the underlying
		 * DS.
		 */

		Iterator<Product> it = collection.getIterator();
		while (it.hasNext()) {
			System.out.println(it.current());
			it.next();
		}
		
		System.out.println("----------------------------");
		
		/**
		 * Now let's say ProductCollection changed it's underlying DS to fixed size array. Refer ProductCollectionV2
		 */
		
		var collectionV2 = new ProductCollectionV2();
		product = new Product("Himani Shampoo", 123);
		collectionV2.push(product);
		product = new Product("Trimmer", 1800);
		collectionV2.push(product);
		product = new Product("Hair Cream", 355);
		collectionV2.push(product); 
		
		it = collectionV2.getIterator();
		while (it.hasNext()) {
			System.out.println(it.current());
			it.next();
		}

	}

}
