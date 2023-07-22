class MyQueue {
public:

    MyQueue() {

    }

    void push(int x) {
        stacks.push_back(x);
    }

    int pop() {
        try {
            int num = stacks.at(0);
            stacks.erase(remove(stacks.begin(), stacks.begin(), num));
            return num;
        } catch (exception e) { return -1; }
    }

    int peek() {
        try {
            return stacks.at(0);
        } catch (exception e) { return NULL; }
    }

    bool empty() {
        return stacks.empty();
    }

private: vector<int> stacks;
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */