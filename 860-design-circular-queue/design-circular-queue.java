class MyCircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capa;

    public MyCircularQueue(int k) {
        capa =k;
        arr=new int[k];
        front=0;
        rear=-1;
        size=0;
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        rear=(rear+1)%capa;
        arr[rear]=value;
        size++;

        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        front=(front+1)%capa;
        size--;

        return true;
        
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];

        
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear];
        
    }
    
    public boolean isEmpty() {
        return size==0;
        
    }
    
    public boolean isFull() {
        return size==capa;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */