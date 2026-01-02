class Counter {
    int count;

    Counter() {
        count = 0;
    }

    Counter(int count) {
        this.count = count;
    }

    void increment() {
        count++;
    }

    void decrement() {
        count--;
    }

    int getCount() {
        return count;
    }
}

