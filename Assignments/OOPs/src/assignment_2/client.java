package assignment_2;

abstract class Persistance {
	abstract void persist();
}

class dataPersistance extends Persistance {
	public void persist() {
		System.out.println("");
	}
}
class filePersistance extends Persistance {
	public void persist() {
		System.out.println("");
	}
}
public class client{
public static void main(String[] args) {
//Persistance Persistance = new Persistance(); 
	dataPersistance dataPersistance = new dataPersistance();
	filePersistance filePersistance = new filePersistance();
	dataPersistance.persist();
	filePersistance.persist();
	System.out.println("");
}
}