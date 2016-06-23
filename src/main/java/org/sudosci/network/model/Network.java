package org.sudosci.network.model;

import java.util.Iterator;
import java.util.Map;

import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoableEdit;

import org.jgraph.event.GraphModelListener;
import org.jgraph.graph.AttributeMap;
import org.jgraph.graph.ConnectionSet;
import org.jgraph.graph.ExecutableChange;
import org.jgraph.graph.GraphModel;
import org.jgraph.graph.ParentMap;

public class Network<N extends NodeSet, E extends EdgeSet> implements GraphModel {
	protected N nodeSet;
	protected E edgeSet;
	@Override
	public int getRootCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Object getRootAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getIndexOfRoot(Object root) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean contains(Object node) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public AttributeMap getAttributes(Object node) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object getValue(Object node) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object getSource(Object edge) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object getTarget(Object edge) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean acceptsSource(Object edge, Object port) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean acceptsTarget(Object edge, Object port) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator edges(Object port) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEdge(Object edge) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isPort(Object port) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object getParent(Object child) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Object getChild(Object parent, int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getChildCount(Object parent) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isLeaf(Object node) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void insert(Object[] roots, Map attributes, ConnectionSet cs, ParentMap pm, UndoableEdit[] e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Object[] roots) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void edit(Map attributes, ConnectionSet cs, ParentMap pm, UndoableEdit[] e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beginUpdate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void endUpdate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void execute(ExecutableChange change) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Map cloneCells(Object[] cells) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object valueForCellChanged(Object cell, Object newValue) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void toBack(Object[] cells) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void toFront(Object[] cells) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addGraphModelListener(GraphModelListener l) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeGraphModelListener(GraphModelListener l) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addUndoableEditListener(UndoableEditListener listener) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeUndoableEditListener(UndoableEditListener listener) {
		// TODO Auto-generated method stub
		
	}
	
	

}
