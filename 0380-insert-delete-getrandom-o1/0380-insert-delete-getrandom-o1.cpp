class RandomizedSet {
public:
    RandomizedSet() { srand(time(0)); }

    bool insert(int val) {
        if (sets.find(val) == sets.end()) {
            sets.insert(val);
            return true;
        }
        
        return false;
    }

    bool remove(int val) {
        if (sets.find(val) != sets.end()) {
            sets.erase(val);
            return true;
        }

        return false;
    }

    int getRandom() {
        vector<int> vec(sets.begin(), sets.end());
        auto pos = rand() % sets.size();
        return vec.at(pos);
    }
private:
    set<int> sets;
};

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet* obj = new RandomizedSet();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */