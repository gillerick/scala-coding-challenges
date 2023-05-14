package dataStructures

import scala.collection.mutable.ListBuffer

class EmptyStackException extends Exception("Error attempting to access an element from an empty container")

class arrayStack[T] {
  private val _data = ListBuffer[T]()

  def length: Int = _data.length

  private def isEmpty: Boolean = _data.isEmpty

  def push(element: T): Unit = _data += element

  def top: T = {
    if (isEmpty) throw new EmptyStackException
    _data.last
  }

  def pop(): T = {
    if (isEmpty) throw new EmptyStackException
    _data.remove(_data.length - 1)
  }

}
