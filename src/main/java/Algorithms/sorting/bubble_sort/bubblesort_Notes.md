# **Bubble Sort - Notes**

## **Overview:**
Bubble Sort is one of the simplest sorting algorithms that works by repeatedly swapping adjacent elements if they are in the wrong order. The algorithm gets its name because larger elements "bubble" to the top (end of the array) in each iteration.

## **How It Works:**
- **Pass through the array**: In each pass, the algorithm compares adjacent elements and swaps them if they are in the wrong order.
- **Bubble up the largest**: After each complete pass, the largest unsorted element is placed in its correct position (at the end of the array).
- **Repeat**: The process is repeated for the remaining unsorted portion of the array.

The algorithm continues making passes until the array is sorted.

## **Algorithm Steps:**
1. Start at the first element of the array.
2. Compare each pair of adjacent elements.
3. If the first element is greater than the second, swap them.
4. Continue this process for the entire array.
5. After each pass, reduce the range of comparison because the last elements are already sorted.
6. Repeat the process until no swaps are needed, indicating the array is fully sorted.

### **Example:**

For an unsorted array:  
`[5, 1, 4, 2, 8]`

- **Pass 1**:
    - Compare 5 and 1: Swap → `[1, 5, 4, 2, 8]`
    - Compare 5 and 4: Swap → `[1, 4, 5, 2, 8]`
    - Compare 5 and 2: Swap → `[1, 4, 2, 5, 8]`
    - Compare 5 and 8: No swap → `[1, 4, 2, 5, 8]`

  After Pass 1, the largest element (8) is bubbled to the last position.

- **Pass 2**:
    - Compare 1 and 4: No swap → `[1, 4, 2, 5, 8]`
    - Compare 4 and 2: Swap → `[1, 2, 4, 5, 8]`
    - Compare 4 and 5: No swap → `[1, 2, 4, 5, 8]`

  After Pass 2, the next largest element (5) is in its correct position.

- **Pass 3**:
    - Compare 1 and 2: No swap → `[1, 2, 4, 5, 8]`
    - Compare 2 and 4: No swap → `[1, 2, 4, 5, 8]`

  The array is sorted after this pass, and no further passes are needed.

### **Code Example:**

```java
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by the inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

### **Time Complexity:**
- **Best Case (Already Sorted Array)**: \( O(n) \)  
  In the best case, when the array is already sorted, the algorithm only makes one pass without any swaps.

- **Worst Case (Reversed Array)**: \( O(n^2) \)  
  The worst case occurs when the array is sorted in reverse order, and the algorithm has to compare and swap every pair of elements in each pass.

- **Average Case**: \( O(n^2) \)  
  On average, Bubble Sort performs \( n(n-1)/2 \) comparisons and \( n(n-1)/4 \) swaps.

### **Space Complexity:**
- **Space Complexity**: \( O(1) \)  
  Bubble Sort is an **in-place sorting algorithm**, meaning it requires a constant amount of extra space. The swapping of elements happens within the same array.

### **Optimized Version:**
In the optimized version of Bubble Sort, we introduce a **flag** (`swapped`) to detect if any swapping happened during the inner loop. If no elements were swapped in a pass, the array is already sorted, and the algorithm can terminate early, improving the performance in the best-case scenario.

### **Advantages:**
- **Simple to Implement**: Bubble Sort is easy to understand and implement.
- **In-Place Algorithm**: It sorts the array using constant space, so no extra memory is required.

### **Disadvantages:**
- **Inefficient**: Bubble Sort is inefficient for large datasets. The time complexity of \( O(n^2) \) makes it impractical compared to other sorting algorithms like Quick Sort, Merge Sort, or even Insertion Sort.

### **When to Use:**
- Bubble Sort is mostly used for educational purposes to introduce basic sorting algorithms. It is rarely used in real-world applications due to its poor performance on large datasets.

### **Conclusion:**
While Bubble Sort is simple and has a straightforward implementation, it is not efficient and is typically not used for performance-critical applications. More advanced algorithms like **Merge Sort**, **Quick Sort**, or **Heap Sort** are preferred for larger datasets due to their better average and worst-case time complexities.