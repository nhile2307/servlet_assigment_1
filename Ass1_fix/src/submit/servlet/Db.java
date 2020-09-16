package submit.servlet;

import java.util.Vector;

public class Db {
	private static Vector<Message> vector;

	public static Vector<Message> getVector() {
		return vector;
	}

	public static void setVector(Vector<Message> vector) {
		Db.vector = vector;
	}

	public Db() {
		vector = new Vector();
	}

}
