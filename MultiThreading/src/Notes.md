# 💻 <span style="color:#4CAF50;">CPU, Core, Process, Thread</span>

---

## 🧠 <span style="color:#2196F3;">CPU (Central Processing Unit)</span>
- The <span style="color:#FF5722;"><B>brain of the computer</B></span>
- Executes programs and instructions
- Performs:
    - Arithmetic operations
    - Logical operations
    - Input/Output operations

---

## ⚙️ <span style="color:#9C27B0;">Core</span>
- An <B>individual processing unit</B> inside a CPU
- Each core can execute tasks independently
- Modern CPUs have <span style="color:#FF9800;"><B>multiple cores</B></span>
- Enables better multitasking and parallel execution

---

## 📦 <span style="color:#3F51B5;">Process</span>
- An <B>instance of a program</B> being executed
- Created by the OS when a program runs
- Has its <span style="color:#E91E63;"><B>own memory space</B></span>
- Manages execution of the program

---

## 🧵 <span style="color:#009688;">Thread</span>
- <B>Smallest unit of execution</B> within a process
- A process can have <span style="color:#FF9800;"><B>multiple threads</B></span>
- Threads share the same resources
- Lightweight and faster than processes

---

## 🔄 <span style="color:#795548;">Multitasking</span>
- OS runs multiple processes simultaneously

### 🖥️ Single-Core CPU:
- Uses <span style="color:#FF5722;"><B>time-sharing</B></span>
- Rapid switching between tasks
- Creates illusion of parallel execution

### 💻 Multi-Core CPU:
- <span style="color:#4CAF50;"><B>True parallel execution</B></span>
- Tasks distributed across cores

---

## 🚀 <span style="color:#607D8B;">Multithreading</span>
- Multiple threads run within a single process

### 🖥️ Single-Core:
- Uses:
    - Time slicing
    - Context switching
- Only one thread runs at a time (illusion of concurrency)

### 💻 Multi-Core:
- Threads run in <span style="color:#4CAF50;"><B>true parallel</B></span>
- OS distributes threads efficiently

---

## ⏱️ <span style="color:#FF9800;">Time Slicing</span>
- CPU time divided into small intervals
- Each process/thread gets a time slot

---

## 🔁 <span style="color:#F44336;">Context Switching</span>
- Saving current process/thread state
- Loading next process/thread state
- Enables smooth multitasking

---

#  <span style="color:#6A1B9A;">Multithreading in Java</span>

## 📌 Overview
- Java supports multithreading using:
    - <span style="color:#4CAF50;"><B>Thread class (java.lang.Thread)</B></span>
    - <span style="color:#2196F3;"><B>Runnable interface (java.lang.Runnable)</B></span>

---

## 🧵 Main Thread
- Every Java program starts with a <span style="color:#FF5722;"><B>main thread</B></span>
- This thread:
    - Starts execution of the program
    - Executes the <B>main()</B> method
- Other threads are created from the main thread

---

## 🖥️ Single-Core Environment
- Multithreading is managed by:
    - <span style="color:#4CAF50;"><B>JVM</B></span>
    - <span style="color:#2196F3;"><B>Operating System</B></span>

- Threads:
    - Share the <span style="color:#FF9800;"><B>same CPU core</B></span>
    - Execute one at a time

- Uses:
    - <span style="color:#9C27B0;"><B>Time slicing</B></span>
    - <span style="color:#F44336;"><B>Context switching</B></span>

- Creates the <B>illusion of concurrency</B>

---

## 💻 Multi-Core Environment
- JVM and OS distribute threads across multiple cores
- Enables <span style="color:#4CAF50;"><B>true parallel execution</B></span>
- Improves performance and efficiency

---

## ⚡ Key Points
- Threads are <B>lightweight</B> compared to processes
- Threads share memory → faster communication
- Used for:
    - Multitasking
    - Background tasks
    - High-performance applications
### To create a new thread in java you can either extend the thread class or implement the runnable interface
## 🧵 Thread Lifecycle in Java

- **New**  
  A thread is in this state when it is created but not yet started.

- **Runnable**  
  After the `start()` method is called, the thread becomes runnable.  
  It's ready to run and is waiting for CPU time.

- **Running**  
  The thread is in this state when it is executing.

- **Blocked / Waiting**  
  A thread is in this state when it is waiting for a resource or for another thread to perform an action.

- **Terminated**  
  A thread is in this state when it has finished executing.