
import java.util.Collection;
import  java.util.HashMap;


public class  SetFromHashmap<K,V> extends HashMap{
    protected HashMap <K,V> s;
    SetFromHashmap(){
        s = new HashMap<>();
    }
    @Override
    public int size(){
        return s.size();
    }
    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }
    public void add(K key, V val){ // add(key,key) to make sure the value and the key is the same
        if(s.get(key) == null){
            s.put(key,val);
        }
    }
    public void addAll(SetFromHashmap<K,V> H){ // add all from set h to this set
        for(K key: H.s.keySet()){
            if(s.get(key) == null){
                V val = H.s.get(key);
                s.put(key,val);
            }
        }
    }
    public boolean contains(K key){
        return s.containsKey(key);
    }
    public boolean containsAll(SetFromHashmap<K,V> set){ // check if all of set is contains in this set
        for(K key:set.s.keySet()){
            if(!s.containsKey(key)) return false;
        }
        return true;
    }

    public Object remove(Object key){ // remove value
        Object o = key;
        s.remove(key);
        return o;
    }
    public void removeAll(SetFromHashmap<K,V> set){ // remove All of Set set in this Set
        for(K key : set.s.keySet()){
            if(this.s.containsKey(key)){
                this.remove(key);
            }
        }

    }

    public boolean retainAll(SetFromHashmap<K,V> set){ // Intersect this set to Set set
        boolean isChange =false;
        SetFromHashmap<K,V> tempSet = new SetFromHashmap<>();
        for(K key:set.s.keySet()){
            if(this.s.containsKey(key)){
                tempSet.add(key,this.s.get(key));
                isChange = true;
            }
        }

        this.s=tempSet.s;
        return isChange; // If the intersected set is the same as this previous set return false (Set has no change)
        // Else return true
    }





    @Override
    public int hashCode() {
        return -1;
    }

    public boolean equals(){
        return false;
    }


}
