package org.sudosci.network.model;

import java.util.Map;

import org.jgraph.graph.AttributeMap;
import org.jgraph.graph.Edge;
import org.sudosci.Thing;


public abstract class Connection<A extends Node, B extends Node> extends Thing implements Edge {
	
	protected A source;
	protected B target;
	
	protected AttributeMap attr;
	
	public Connection() {
		attr = new AttributeMap();
	}
	
	public Connection(AttributeMap map) {
		attr = new AttributeMap(map);
	}
	
	

	@SuppressWarnings({"deprecation", "rawtypes"})
	@Deprecated
	@Override
	public Map changeAttributes(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttributeMap getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttributes(AttributeMap arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public A getSource() {
		return this.source;
	}

	@Override
	public B getTarget() {
		return this.target;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setSource(Object arg0) {
		this.source = (A)arg0;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setTarget(Object arg0) {
		this.target = (B)arg0;
		
	}
	// yeah
	

}
