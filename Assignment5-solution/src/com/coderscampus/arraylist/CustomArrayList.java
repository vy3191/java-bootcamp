package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	
	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = increaseSizeOfBackingArray();
		}
		items[size] = item;
		size++;
		return true;
	}

	private Object[] increaseSizeOfBackingArray() {
		Object[] newArray = new Object[size*2];
		for (int i=0; i<size; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= size) throw new IndexOutOfBoundsException("Yo! What're you doing! You FOOL! You went out of bounds... I shake my head at you");
		
		return (T) items[index];
	}
	
}
