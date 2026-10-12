\# Data Structure \& Graph Analyzer



A Java console-based application developed to demonstrate the implementation and practical behavior of common data structures, searching algorithms, graph traversal algorithms, and performance comparison.



\## Project Objective



The main objective of this project is to implement and analyze different data structures using Java. All modules are integrated into a single menu-driven console application, allowing users to perform operations and observe how each data structure works.



\## Group Information



\*\*Group Number:\*\* 38  

\*\*Module:\*\* CIT300 – Data Structures and Algorithms



\## Group Members and Contributions



| Member | Student ID | Contribution |

|---|---|---|

| A.M. Mohamed Rinas | 23DA2-1125 | Group Leader, Graph, BFS, DFS, Main Menu Integration and Final Testing |

| A.M. Afri | 23DA2-1126 | Array Operations, Linear Search and Binary Search |

| M.K.M. Umair | 23DA2-0821 | Singly Linked List Operations |

| N.M. Saamil | 23DA2-0516 | Stack and Circular Queue Operations |



\## Implemented Data Structures and Algorithms



\### 1. Array



\- Insert values

\- Delete values

\- Search values

\- Display array elements

\- Display array size and capacity

\- Check whether the array is empty or full



\### 2. Searching Algorithms



\- Linear Search

\- Binary Search

\- Search result validation

\- Linear and binary search performance comparison



\### 3. Singly Linked List



\- Insert at the beginning

\- Insert at the end

\- Insert after a selected value

\- Search for a value

\- Delete a value

\- Display linked-list elements

\- Display list size and status



\### 4. Stack



The stack follows the \*\*LIFO – Last In, First Out\*\* principle.



\- Push

\- Pop

\- Peek

\- Display

\- Check stack size

\- Check empty and full status



\### 5. Circular Queue



The queue follows the \*\*FIFO – First In, First Out\*\* principle.



\- Enqueue

\- Dequeue

\- View front value

\- Display queue elements

\- Circular index handling

\- Check queue size

\- Check empty and full status



\### 6. Graph



The graph is implemented using an adjacency matrix.



\- Add vertices

\- Add edges

\- Remove edges

\- Check connections

\- Display vertices

\- Display graph connections

\- Breadth-First Search (BFS)

\- Depth-First Search (DFS)

\- Graph validation and information



\### 7. Performance Comparison



The application compares the execution times of:



\- Linear Search

\- Binary Search



Execution time is measured in nanoseconds using `System.nanoTime()`.



\## Project Structure



```text

CIT300-Data-Structure-Graph-Analyzer

│

├── src

│   └── analyzer

│       ├── array

│       │   ├── ArrayOperations.java

│       │   └── ArraySearchingTest.java

│       │

│       ├── searching

│       │   └── SearchAlgorithms.java

│       │

│       ├── linkedlist

│       │   ├── ListNode.java

│       │   ├── SinglyLinkedList.java

│       │   └── LinkedListTest.java

│       │

│       ├── stack

│       │   ├── ArrayStack.java

│       │   └── StackQueueTest.java

│       │

│       ├── queue

│       │   └── CircularQueue.java

│       │

│       ├── graph

│       │   ├── Graph.java

│       │   └── GraphTest.java

│       │

│       └── main

│           └── Main.java

│

├── .classpath

├── .project

├── .gitignore

└── README.md

```



\## Main Menu



```text

============== MAIN MENU ==============

1\. Array Operations

2\. Searching Algorithms

3\. Singly Linked List

4\. Stack Operations

5\. Circular Queue Operations

6\. Graph Operations

7\. Performance Comparison

0\. Exit

=======================================

```



\## How to Run the Project Using Eclipse



1\. Clone or download the GitHub repository.

2\. Open Eclipse IDE.

3\. Select \*\*File → Import\*\*.

4\. Choose \*\*Existing Projects into Workspace\*\*.

5\. Select the project folder.

6\. Open:



```text

src/analyzer/main/Main.java

```



7\. Right-click `Main.java`.

8\. Select \*\*Run As → Java Application\*\*.

9\. Use the displayed menu to test each operation.



\## How to Clone the Repository



```bash

git clone https://github.com/23da2-1125-creator/CIT300-Data-Structure-Graph-Analyzer.git

```



\## Git Branches



| Branch | Purpose |

|---|---|

| `main` | Final completed project |

| `rinas-graph-integration` | Graph development and full integration |

| `afri-array-searching` | Array and searching module |

| `umair-linked-list` | Singly linked list module |

| `saamil-stack-queue` | Stack and circular queue module |



\## Sample Graph Output



```text

===== GRAPH CONNECTIONS =====

A -> B, C

B -> A, D

C -> A, D

D -> B, C



BFS traversal starting from A:

A -> B -> C -> D



DFS traversal starting from A:

A -> B -> D -> C

```



\## Testing Status



\- Array operations tested successfully

\- Searching algorithms tested successfully

\- Singly linked list tested successfully

\- Stack operations tested successfully

\- Circular queue tested successfully

\- Graph operations tested successfully

\- BFS and DFS tested successfully

\- Performance comparison tested successfully

\- Integrated main menu tested successfully



\## Technologies Used



\- Java

\- Eclipse IDE

\- Git

\- GitHub

\- Windows Command Prompt



\## Repository



\[GitHub Repository](https://github.com/23da2-1125-creator/CIT300-Data-Structure-Graph-Analyzer)



\## Conclusion



This project demonstrates the practical implementation of multiple data structures and algorithms in Java. The menu-driven interface makes it possible to test each operation and understand the differences between data organization, searching, traversal, and processing techniques.

