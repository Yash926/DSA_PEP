// using Array
// https://www.geeksforgeeks.org/problems/implement-queue-using-array/1


// class MyQueue {

//     int front, rear;
// 	int arr[] = new int[100005];

//     MyQueue()
// 	{
// 		front=0;
// 		rear=0;
// 	}
	
// 	//Function to push an element x in a queue.
// 	void push(int x)
// 	{
	    
// 	    arr[rear]=x;
// 	    rear++;
// 	} 

//     //Function to pop an element from queue and return that element.
// 	int pop()
// 	{
// 	    if(front==rear)
// 	    {
// 	        return -1;
// 	    }
// 	    int ans=arr[front];
// 	    for(int i=front;i<=rear;i++)
// 	    {
// 	        arr[i]=arr[i+1];
// 	    }
// 	   rear--;
// 	    return ans;
// 	} 
// }

//implementation using linked list
// class MyQueue
// {
// QueueNode front, rear;

// //Function to push an element into the queue.
// void push(int a)
// {
// QueueNode temp = new QueueNode(a);
// if(rear == null)
// {
// rear = temp ;
// front = temp ;
// }
// else
// {
// rear.next = temp ;
// rear = rear.next ;
// }



// }

// //Function to pop front element from the queue.
// int pop()
// {
// if(front == null)
// {
// return -1 ;class MyQueue
// {
//     QueueNode front, rear;
    
//     //Function to push an element into the queue.
//     void push(int a)
//     {
//     QueueNode temp = new QueueNode(a);
//     if(rear == null)
//     {
//     rear = temp ;
//     front = temp ;
//     }
//     else
//     {
//     rear.next = temp ;
//     rear = rear.next ;
//     }
    
    
    
//     }
    
    //Function to pop front element from the queue.
    // int pop()
    // {
    // if(front == null)
    // {
    // return -1 ;
    // }
    // int val = front.data ;
    // front = front.next ;
    
    // return val ;
    // // Your code here
    // }
    // }
// }
// int val = front.data ;
// front = front.next ;

// return val ;
// // Your code here
// }
// }