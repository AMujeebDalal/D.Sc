package manish;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
	private int id;
@Column
private String first,lastName;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getFirst() {
	return first;
}
public void setFirst(String first) {
	this.first = first;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
