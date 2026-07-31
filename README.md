# Java DSA Showcase

A clean, from-scratch implementation of core **Data Structures & Algorithms** in Java — built as a portfolio project to demonstrate strong CS fundamentals: recursion, complexity analysis, and clean OOP design.

## What's Inside

| Category | Implementation | Time Complexity |
|---|---|---|
| Sorting | Merge Sort | O(n log n) |
| Sorting | Quick Sort | O(n log n) avg |
| Searching | Binary Search | O(log n) |
| Data Structure | Custom Singly Linked List (insert, delete, search, reverse) | O(n) / O(1) |
| Data Structure | Custom Stack (array-based, resizable) + Balanced Parentheses check | O(1) amortized |
| Data Structure | Custom Queue (circular array, resizable) | O(1) amortized |
| Graph | Adjacency List Graph with BFS & DFS traversal | O(V + E) |
| Dynamic Programming | 0/1 Knapsack (tabulation) | O(n × capacity) |

Each module is self-contained, documented with complexity notes, and includes a runnable `demo()` method.

## Project Structure

```
java-dsa-showcase/
├── src/
│   ├── Main.java                       # Interactive menu-driven entry point
│   ├── sorting/
│   │   ├── MergeSort.java
│   │   └── QuickSort.java
│   ├── searching/
│   │   └── BinarySearch.java
│   ├── datastructures/
│   │   ├── CustomLinkedList.java
│   │   ├── CustomStack.java
│   │   └── CustomQueue.java
│   ├── graph/
│   │   └── Graph.java
│   └── dp/
│       └── Knapsack.java
└── README.md
```

## How to Run

**Requirements:** JDK 17+ (uses Java switch expressions)

```bash
# Clone the repo
git clone https://github.com/Sanyaritu/java-dsa-showcase.git
cd java-dsa-showcase

# Compile
javac -d out $(find src -name "*.java")

# Run
java -cp out Main
```

You'll get an interactive menu to run any demo:

```
==================================================
        JAVA DSA SHOWCASE - MAIN MENU
==================================================
1. Merge Sort
2. Quick Sort
3. Binary Search
4. Custom Linked List
5. Custom Stack (+ Balanced Parentheses)
6. Custom Queue
7. Graph (BFS & DFS)
8. 0/1 Knapsack (Dynamic Programming)
0. Exit
```

## Why This Project

Sorting, searching, and core data structures are usually reached for via built-in libraries — this project rebuilds them from first principles to show a solid grasp of:

- Recursion and divide-and-conquer strategy (Merge/Quick Sort)
- Manual memory/array management (Stack, Queue with resizing)
- Pointer manipulation (Linked List, reversal in O(1) space)
- Graph theory fundamentals (BFS/DFS traversal)
- Dynamic programming and optimization (Knapsack)

## Author

**Sanya Bhatia** — B.Tech Data Science
[GitHub](https://github.com/Sanyaritu) · [Portfolio](https://github.com/Sanyaritu/AI-automation-portfolio)
