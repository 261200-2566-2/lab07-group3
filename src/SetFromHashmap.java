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
        for(K key:H.keySet()){
            if(s.get(key) == null){
                V val = H.get(key);
                s.put(key,val);
            }
        }
    }

    @Override
    public K keySet(){

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

    public boolean containsAll(SetFromHashmap s1){
        for(K key:s1.keySet()){
            if(!s.containsKey(key)) return false;
        }

        return true;
    }
}
