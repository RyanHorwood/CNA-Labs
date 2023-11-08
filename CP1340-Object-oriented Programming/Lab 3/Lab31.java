//Lab 31
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 10-27-2022

class Lab31 {
	public static void main(String[] args) {
		Set s = new Set();
		s.insert(1);
		s.insert(100);
		s.insert(2);
		s.insert(3);
		
		s.printSet();
		
		Set p = new Set();
		p.insert(3);
		p.insert(4);
		p.insert(5);
		
		p.printSet();
		
		Set union = s.union(p);
		union.printSet();
	}
}

class Set {
	private int[] a;
	
	public Set() {
		a = new int[100];
	}
	
	public void insert(int i) {
		if(i >= 0 && i < a.length)
			a[i] = 1;
		else
			System.out.println("Can't insert");
	}
	
	public Set union(Set x) {
		Set u = new Set();
		for(int i = 0; i < a.length; i++) {
			if(this.a[i] == 1 || x.a[i] == 1)
				u.insert(i);
		}
		return u;
	}
	
	public void printSet() {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 1)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}