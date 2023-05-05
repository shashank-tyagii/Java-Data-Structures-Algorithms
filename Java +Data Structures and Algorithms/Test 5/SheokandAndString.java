package skillTest4;

//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class SheokandAndString {
//
//	 static List<String>ans;
//	    static class TrieNode{
//	        char c;
//	        boolean isEnd;
//	        Map<Character,TrieNode>children;
//	        TrieNode(char c){
//	            this.children=new TreeMap<>();
//	            this.isEnd=false;
//	            this.c=c;
//	        }
//	    }
//	    TrieNode root;
//	    SheokandAndString(){
//	        this.root=new TrieNode('#');
//	    }
//	    void addWord(String word){
//	        TrieNode pointer=root;
//	        for(char c:word.toCharArray()){
//	            pointer.children.putIfAbsent(c,new TrieNode(c));
//	            pointer=pointer.children.get(c);
//	            pointer.c=c;
//	        }
//	        pointer.isEnd=true;
//	    }
//
//	  String search(String s){
//	        StringBuilder ans=new StringBuilder();
//
//	        TrieNode pointer=root;
//	        for(char c:s.toCharArray()){
//	            if (!pointer.children.containsKey(c)) {
//	                break;
//	            }
//	            pointer=pointer.children.get(c);
//	            ans.append(pointer.c);
//	        }
//	        while(!pointer.isEnd){
//	            boolean f = false;
//	            for (Map.Entry<Character, TrieNode> it : pointer.children.entrySet()) {
//	                if (f) break;
//	                pointer = pointer.children.get(it.getKey());
//	                f = true;
//	            }
//	            ans.append(pointer.c);
//	        }
//	        return ans.toString();
//	    }
//	    
//	    public static void main (String[] args) throws Exception{
//	        Scanner sc=new Scanner(System.in);
//	        SheokandAndString solve=new SheokandAndString();
//	        int n=sc.nextInt();
//	        List<String>al=new ArrayList<>();
//	        for(int i=0;i<n;i++){
//	            String s=sc.next();
//	            al.add(s);
//	        }
//	        int q=sc.nextInt();
//	        List<Query>aq=new ArrayList<>();
//	        for(int i=0;i<q;i++){
//	            int nn=sc.nextInt();
//	            String s=sc.next();
//	            aq.add(new Query(i,nn,s));
//	        }
//	        Collections.sort(aq,(a,b)->a.n-b.n);
//	        String []ans=new String[q];
//	        int j=0;
//	        for(int i=0;i<q;i++){
//	            while(j<aq.get(i).n){
//	                solve.addWord(al.get(j++));
//	            }
//	            ans[aq.get(i).i]=solve.search(aq.get(i).s);
//	        }
//	        for(int i=0;i<q;i++){
//	            System.out.println(ans[i]);
//	        }
//	    }
//}
//
//class Query{
//    int i;
//    int n;
//    String s;
//    Query(int i,int n,String s){
//        this.i=i;
//        this.n=n;
//        this.s=s;
//    }
//}
