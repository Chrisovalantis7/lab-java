package sts;

import java.util.Collection;

/*
 * Explain what is the purpose of each of the following interfaces
 */

public interface List<E> extends Collection<E>{}
/*
 * List is a collection with values. Main difference with others: It can contains duplicate values. 
 */

public interface Set<E> extends Collection<E>{}
/*
 * Set is a collection with unordered values. Main difference with others: It doesn't allow us to store duplicate items.
 */

public interface Queue<E> extends Collection<E>{}
/*
 * Queue is a collection with values. Main difference with others: First in first out (FIFO) order.
 */

public interface Dequeue<E> extends Queue<E>{}  
/*
 * Dequeue-Deque is a queue. Main difference with queue: We can remove and add elements from both side.
 */
