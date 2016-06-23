package org.sudosci;

import java.util.Random;

import org.jgraph.graph.AttributeMap;

public abstract class Thing {

	public static Random RAND = new Random((new Random()).nextLong());
	//public static Map<String, Object> PROP = new HashMap<>();

	protected final int _id;
	protected AttributeMap attributes;
	
	protected String key;
	protected String name;
	protected String condition;
	protected String description;

	public Thing() {
		_id = RAND.nextInt(100000);
	}
	
	public Thing(int i) {
		_id = i;
	}
	
	public Thing(String k, String n, String c, String d) {
		this();
		key = k;
		name = n;
		condition = c;
		description = d;
	}

	protected void print(Object o) {
		System.out.println(o);
	}

	@Override
	public abstract boolean equals(Object o);

	@Override
	public abstract int hashCode();

	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public String getCondition() {
		return condition;
	}

	public String getDescription() {
		return description;
	}

	
}
