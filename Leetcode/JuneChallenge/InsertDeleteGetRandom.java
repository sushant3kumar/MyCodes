class RandomizedSet {

    /** Initialize your data structure here. */
    HashSet<Integer> hs;
    ArrayList<Integer> a1;
    Random rd;
    public RandomizedSet() {
        hs= new HashSet<>();
        a1= new ArrayList<>();
        rd= new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean a =hs.add(val);
        if(a)
        {
            a1.add(val);
        }
        return a;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean a= hs.remove(val);
        if(a)
        {
            a1.remove(new Integer(val));
        }
        return a;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        //Random rd= new Random();
        int sz= a1.size();
        int a= (rd.nextInt(sz));
        return a1.get(a);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
