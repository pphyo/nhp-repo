package com.jdc.io.stream;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.time.LocalDateTime;

public class Category implements Externalizable {

	private static final long serialVersionUID = 1000L;
	
	private int id;
	private String name;
	private LocalDateTime created;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.id = in.readInt();
		this.name = in.readUTF();
		this.created = LocalDateTime.parse(in.readUTF());
		this.description = in.readUTF();
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeUTF(name);
		out.writeUTF(created.toString());
		out.writeUTF(description);
		System.out.println("Object is writed");
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", created=" + created + ", description=" + description + "]";
	}

}
