package day05;

public class HeapSort {
    private static int t = 0;
    public static void main(String[] args) {
        int[] a = {6,8,10,9,7,5,4,13,23,1,5,7,12,4};
        int[] b = {6,8,10,9,7,5,4,13,23,1,5,7,12,4};
        //Question 1
        heapify(b,2,14);
        System.out.println("After heapifying the third number: ");
        for(int i=0; i<=b.length-1; i++){
            System.out.print(b[i]+", ");
        }
        System.out.println();
        System.out.println("The swap did "+t+" times!");
        t = 0;
        //Question 2
        heapSort(a);
        //swap times
        System.out.println("The swap did "+t+" times!");
        for(int i=0; i<=a.length-1; i++){
            System.out.print(a[i]+", ");
        }
    }

    public static void heapSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        MaxHeap heap = new MaxHeap(14);
        for(int i=0; i<=a.length-1; i++){
            heap.push(a[i]);
        }
        for(int i=0; i<=a.length-1; i++){
            a[i]=heap.heap[i];
        }
        System.out.println();
        System.out.println("max heap is：");
        for(int i=0; i<=a.length-1; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Start sorting:");
        heapSort2(a);

    }

    private static void heapSort2(int[] heap) {
        int size = heap.length;
        while(size>0){
            swap(heap,0, size-1);
            size--;
            heapify(heap,0,size);
        }
    }

    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        t++;
        for(int a=0; a<=arr.length-1; a++){
            System.out.print(arr[a]+",");
       }
        System.out.println();
    }

}
