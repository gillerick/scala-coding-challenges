package dataStructures

import scala.collection.mutable.ListBuffer

class EmptyStackException(message: String = "Error attempting to access an element from an empty container") extends Exception(message)

/**
 * A LIFO stack implementation using a ListBuffer as underlying storage
 *
 * @tparam T the type of elements in the stack
 */
class arrayStack[T] {
  private val _data = ListBuffer[T]()

  /**
   * Returns the number of elements in the stack
   *
   * @return the number of elements in the stack
   */
  def length: Int = _data.length

  /**
   * Returns true if the stack is empty, false otherwise
   *
   * @return true if stack is empty
   */
  private def isEmpty: Boolean = _data.isEmpty

  /**
   * Adds an element to the top of the stack
   *
   * @param element the element to be added
   */
  def push(element: T): Unit = _data += element

  /**
   * Returns the top element in the stack without removing it
   *
   * @throws EmptyStackException if the stack is empty
   * @return the element at the top of the stack
   */
  def top: T = {
    if (isEmpty) throw new EmptyStackException
    _data.last
  }

  /**
   * Removes and returns the top element in the stack
   *
   * @throws EmptyStackException if the stack is empty
   * @return the element removed from the top of the stack
   */
  def pop(): T = {
    if (isEmpty) throw new EmptyStackException
    _data.remove(_data.length - 1)
  }

}
