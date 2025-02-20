

class P16 {
    int[] buf;
    int size, front, rear, count;

    P16(int size) {
        this.size = size;
        buf = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    void insert(int x) {
        rear = (rear + 1) % size;
        buf[rear] = x;
        if (count < size) count++;
        else front = (front + 1) % size;
    }

    void display() {
        int i = front, c = count;
        while (c-- > 0) {
            System.out.print(buf[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P16 buffer = new P16(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4); 
        buffer.display();  
    }
}
