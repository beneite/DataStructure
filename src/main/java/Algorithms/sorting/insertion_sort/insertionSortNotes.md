# **Insertion Sort**:

### 1. **Definition**:
- Insertion Sort is a simple comparison-based sorting algorithm.
- It builds the final sorted array one element at a time, much like sorting playing cards.

### 2. **How it works**:
- Start with the second element (index 1) and compare it to the first (index 0).
- If the second element is smaller, swap them.
- Move to the third element, compare it with the previous elements, and place it in its correct position by shifting other elements if necessary.
- Repeat this process for all elements.

### 3. **Algorithm**:
For an array `arr` of size `n`:
   ```java
   for (int i = 1; i < n; i++) {
       int key = arr[i];
       int j = i - 1;

       // Move elements of arr[0..i-1], that are greater than key, to one position ahead
       while (j >= 0 && arr[j] > key) {
           arr[j + 1] = arr[j];
           j = j - 1;
       }
       arr[j + 1] = key;
   }
   ```

### 4. **Time Complexity**:
- **Best case**: `O(n)` (already sorted array).
- **Average case**: `O(n²)`.
- **Worst case**: `O(n²)` (reverse sorted array).

This is because in the worst case, every element needs to be compared with all previous elements.

### 5. **Space Complexity**:
- **O(1)** (In-place sorting, uses no extra memory except for the `key`).

### 6. **Advantages**:
- Simple to implement and easy to understand.
- Efficient for small data sets.
- Stable sorting algorithm (preserves the relative order of equal elements).
- Online algorithm (can sort a list as it receives it).

### 7. **Disadvantages**:
- Inefficient for large data sets due to its quadratic time complexity.
- High number of element comparisons and movements.

### 8. **Use Cases**:
- When the array is already mostly sorted.
- When working with small arrays.
- In online systems where elements are received one by one and need to be inserted into a sorted list immediately.

Let me know if you'd like to dive deeper into any specific aspect of this algorithm!