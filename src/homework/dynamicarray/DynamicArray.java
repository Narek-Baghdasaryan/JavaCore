package homework.dynamicarray;

    public class DynamicArray {
        int[] array = new int[10];
        int size = 0;

        void add(int value) {
            if (size == array.length) {
                extend();
            }
            array[size++] = value;

        }

        void extend() {
            int[] tmp = new int[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }

        void print() {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public void deleteByIndex(int index) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }

        public void set(int index, int value) {
            array[index] = value;
        }

       // public void add(int index, int value) {
         //   for (int i = 0; i < size; i++) {
           //     array[i + 1] = array[5];
            }
         //   for (int i = index; i < size; i++) {
           //     array[index] = value;







