def heapify(array, n):
  """
  Heapifies the given array.

  Args:
    array: The array to be heapified.
    n: The length of the array.
  """

  # Start at the middle of the array and work our way up.
  for i in range(n // 2, 0, -1):
    # Swap the current node with its child if it is smaller.
    if array[i] < array[2 * i] or array[i] < array[2 * i + 1]:
      array[i], array[2 * i] = array[2 * i], array[i]

def heap_sort(array):
  """
  Sorts the given array using heap sort.

  Args:
    array: The array to be sorted.
  """

  # Build a heap from the array.
  n = len(array)
  for i in range(n // 2, 0, -1):
    heapify(array, n)

  # Repeatedly delete the root element of the heap and place it at the end of the sorted array.
  for i in range(n - 1, 0, -1):
    array[i], array[0] = array[0], array[i]
    heapify(array, i)