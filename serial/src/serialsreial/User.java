package serialsreial;

import java.io.Serializable;

public class User implements Serializable {
	transient String name;
	String password;

}
