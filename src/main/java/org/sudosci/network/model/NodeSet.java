package org.sudosci.network.model;

import org.jgrapht.VertexFactory;

public interface NodeSet {
	
	public <T> VertexFactory<T> getFactory();
	
	public <T> void setFactory(VertexFactory<T> factory);

}
