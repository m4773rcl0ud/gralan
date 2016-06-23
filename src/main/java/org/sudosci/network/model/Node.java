package org.sudosci.network.model;

import java.util.Map;

import org.jgraph.graph.AttributeMap;
import org.jgraph.graph.GraphCell;
import org.jgraph.graph.Port;
import org.sudosci.Thing;

public abstract class Node extends Thing implements GraphCell {
	protected Port incoming;
	protected Port outgoing;

	public Node(Port incoming, Port outgoing) {
		super();
		this.incoming = incoming;
		this.outgoing = outgoing;
	}

	@Override
	public AttributeMap getAttributes() {
		return attributes;
	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public Map changeAttributes(Map change) {
		return null;
	}

	@Override
	public void setAttributes(AttributeMap map) {
		return;
		
	}

	
	

}
