public class PersonManagement {
	private Person[] array2 = new Person[100];
	private static int person_counter = -1;
	
	public void set(Person[] persons) {
		for (int i = 0; i < persons.length; i++) {
			array2[i] = new Person();
			array2[i].set(persons[i].Name, persons[i].age);
			person_counter++;
		}
	}
	
	public void displayAll() {
		for (int i = 0; i <= person_counter; i++)
			array2[i].display();
	}
	
	public void sort() {
		for (int i = person_counter; i >= 0; i--) {
			int max = 0;
			for (int j = 1; j <= i; j++) {
				if (array2[max].age < array2[j].age)
					max = j;
			}
			
			Person temp = array2[i];
			array2[i] = array2[max];
			array2[max] = temp;
		}
	}
	
	public void reverse() {
		Person[] temp = new Person[person_counter + 1];
		int index = 0;
		for (int i = temp.length-1; i >= 0; i--) 
			temp[index++] = array2[i];
		
		array2 = temp;
	}
	
	public Person[] getPersons() {
		return array2;
	}
	
	public void displayEvenAgePerson() {
		for (Person person: array2) {
			if (person.age % 2 == 0)
				person.display();
		}
	}
	
	public void displayOddAgePerson() {
		for (Person person: array2) {
			if (person.age % 2 != 0)
				person.display();
		}
	}
	
	public void displayPrimeAgePerson() {
		for (int i = 0; i <= person_counter; i++) {
			boolean isPrime = true;
			if (array2[i].age == 0 || array2[i].age == 1)
				isPrime = false;
			else {
				for (int n = 2; n <= (array2[i].age / 2); n++) {
					if (array2[i].age % n == 0) {
						isPrime = false;
						break;
					}
				}
			}
			
			if (isPrime) array2[i].display();
		}
	}
}
