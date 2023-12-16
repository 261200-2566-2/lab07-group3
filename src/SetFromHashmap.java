
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
    public void add(K key,V val){
        if(s.get(key) == null){
            s.put(key,val);
        }
    }
    public void addAll(SetFromHashmap<K,V> H){
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
    public boolean containsAll(SetFromHashmap<K,V> set){
        for(K key:set.s.keySet()){
            if(!s.containsKey(key)) return false;
        }
        return true;
    }

    public Object remove(SetFromHashmap<K,V> val){
        return s.remove(val.keySet());
    }
    public void removeAll(){
        s.clear();
    }

    public boolean retainAll(SetFromHashmap<K,V> set){
        boolean isChange =false;
        SetFromHashmap<K,V> tempSet = new SetFromHashmap<>();
        for(K key:set.s.keySet()){
            if(this.containsKey(key)){
                tempSet.add(key,this.s.get(key));
            }
        }
        isChange = !(s.size() == tempSet.size());
        s=tempSet;
        return isChange;
    }





    @Override
    public int hashCode() {
        return -1;
    }

    public boolean equals(){
        return false;
    }


}
