package java.lang;

public class StringConcatenation {

	public Class<?> nameInput(String name) throws ClassNotFoundException {
		name += "0";
		return Class.forName(name);
	}

}
