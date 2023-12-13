import java.util.Collection;
import  java.util.HashMap;


public class  SetFromHashmap<K,V> extends HashMap{
    HashMap <K,V> s;
    SetFromHashmap(){
        s = new HashMap<>();
    }

    public void add(K key,V val){
        if(s.get(key) == null){
            s.put(key,val);
        }
    }
    public void addAll(SetFromHashmap H){
        for(K val: H.s.keySet()){
            if(s.get(key) == null){
               // V val = H.get(key);
                s.put(key,key);
            }
        }
    }
    public boolean containsAll(SetFromHashmap set){
        for(K key:set.keySet()){
            if(!s.containsKey(key)) return false;
        }

        return true;
    }

    @Override
    public Collection<V> values() {
        return super.values();
    }


    public void removeAll(){
        s.clear();
    }

    public boolean contains(K key){
        return s.containsKey(key);
    }



    @Override
    public int hashCode() {
        return -1;
    }

    public boolean equals(){
        return false;
    }
    @Override
    public int size(){
        return s.size();
    }
    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }
}
