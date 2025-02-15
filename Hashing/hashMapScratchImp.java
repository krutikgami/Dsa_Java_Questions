package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class hashMapScratchImp {
    static class Hash<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            } 
        }
    private int n;
    private int N;
    private LinkedList<Node> buckets[];

    public Hash(){
        this.n = 0;
        this.N = 4;
        this.buckets = new LinkedList[4];
        for (int i = 0; i <4; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    public int hashFunc(K key){
        int hc = key.hashCode();
        return Math.abs(hc) % N;
    }

    public int searchLL(K key,int bi){
        LinkedList<Node> ll = buckets[bi];

        int di = 0;
        for(int i=0;i<ll.size();i++){
            Node node  = ll.get(i);
            if(node.key == key){
                return di;
            }
            di++;
        }
        return -1;
    }

    public void rehash(){
        LinkedList<Node> oldbuckets[] = buckets;
        buckets = new LinkedList[N*2];
        N = 2*N;
        for(int i = 0;i<buckets.length;i++){
            buckets[i] = new LinkedList<>();
        }

        for(int i = 0;i<oldbuckets.length;i++){
            LinkedList<Node> ll = oldbuckets[i];
            for(int j = 0; j< ll.size();j++){
                Node node = ll.remove();
                put(node.key, node.value);
            }
        }

    }
    public void put(K key,V value){
        int bi = hashFunc(key);
        int di = searchLL(key,bi);

        if(di != -1){
            Node node = buckets[bi].get(di);
            node.value = value;
        }else{
            buckets[bi].add(new Node(key, value));
            n++;
        }

        double lambda = (double) n/N;
        if (lambda>2.0) {
            rehash();
        }
    }
    public boolean containsKey(K key){
        int bi = hashFunc(key);
        int di = searchLL(key,bi);

        if(di != -1){
            return true;
        }else{
            return false;
        }
    }
     public V get(K key){
        int bi = hashFunc(key);
        int di = searchLL(key,bi);

        if(di != -1){
            Node node = buckets[bi].get(di);
            return node.value;
        }else{
            return null;
        }
     }
     public V remove(K key){
        int bi = hashFunc(key);
        int di = searchLL(key,bi);

        if(di != -1){
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }else{
            return null;
        }
    }
    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();

        for(int i=0;i<buckets.length;i++){
            LinkedList<Node> ll = buckets[i];
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    public boolean isEmpty(){
        return n==0;
    }
}
public static void main(String[] args) {
    HashMap<String,Integer> map = new HashMap<>();
    map.put("India", 100);
    map.put("China", 150);
    map.put("Us", 50);
    map.put("Nepal", 5);

    Set<String> keys =  map.keySet();
    for (String key : keys) {
        System.out.println(key);
    }
}
}
