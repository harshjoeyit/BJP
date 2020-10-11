

/* 

>> Preemptive Scheduling 
is a CPU scheduling technique that works 
by dividing time slots of CPU to a given process. The time slot 
given might be able to complete the whole process or might not 
be able to it. When the burst time of the process is greater 
than CPU cycle, it is placed back into the ready queue and 
will execute in the next chance. This scheduling is used when 
the process switch to ready state.

Starvation may be caused, due to the insertion of priority process in the queue.
Algorithms that are backed by preemptive Scheduling are 

round-robin (RR), priority, SRTF (shortest remaining time first).

The period of time for which a process is allowed to run in a 
preemptive multitasking system is generally called the TIME SLICE or QUANTUM. 
The scheduler is run once every time slice to choose the next process to run.

Difference between preemptive scheduling and time slicing
Under preemptive scheduling, the highest priority task executes 
until it enters the waiting or dead states or a higher priority 
task comes into existence. 
Under time slicing, a task executes for a predefined slice 
of time and then reenters the pool of ready tasks. The scheduler 
then determines which task should execute next, based on priority 
and other factors

In most cases, thread schedular schedules the threads according 
to their priority (known as preemptive scheduling). But it is 
not guaranteed because it depends on JVM specification



>> Non-preemptive Scheduling 
is a CPU scheduling technique the 
process takes the resource (CPU time) and holds it till the 
process gets terminated or is pushed to the waiting state. 
No process is interrupted until it is completed, and after 
that processor switches to another process.

Starvation can occur when a process with large burst time occupies the system.

Algorithms that are based on non-preemptive Scheduling are 
non-preemptive priority, and shortest Job first.



>> Sleep method 
As you know well that at a time only one thread is executed. 
If you sleep a thread for the specified time,the thread shedular 
picks up another thread and so on.
*/