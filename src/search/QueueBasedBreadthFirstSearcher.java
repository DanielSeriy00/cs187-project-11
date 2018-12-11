package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * An implementation of a Searcher that performs an iterative search,
 * storing the list of next states in a Queue. This results in a
 * breadth-first search.
 * 
 */
public class QueueBasedBreadthFirstSearcher<T> extends Searcher<T> {

	ArrayList<T> queue;
	
	public QueueBasedBreadthFirstSearcher(SearchProblem<T> searchProblem) {
		super(searchProblem);
		queue = new ArrayList<T>();
	}

	@Override
	public List<T> findSolution() {
		// TODO
		visited.add(searchProblem.getInitialState());
		queue.add(searchProblem.getInitialState());
		
		
		return solution;
	}
	
	public String toString() {
		return "visited list: " + visited +
				"/nqueue: " + queue + "/n";
	}
}
