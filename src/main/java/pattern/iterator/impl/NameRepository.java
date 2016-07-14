package pattern.iterator.impl;

import pattern.iterator.Container;
import pattern.iterator.Iterator;

public class NameRepository implements Container {
	private String names[] = {"Robert", "John", "Julie"};

	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		public boolean hasNext() {
			return index < names.length;
		}

		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
