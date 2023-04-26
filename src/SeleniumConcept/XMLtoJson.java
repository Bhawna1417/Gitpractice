package SeleniumConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class XMLtoJson {
public static void main(String[] args){
treeMethod("Hello I am going to count word. I am setting the word.");
}
public static void treeMethod(String sentence){
String[] arr=sentence.split(" ");
Map<String,Integer> tmap=new HashMap<String,Integer>();
for(String s : arr){
int cnt=0;
for(int i=0;i<arr.length;i++){
if(s.equals(arr[i])){
cnt++;
}
tmap.put(s,cnt);
}
}
System.out.println(tmap);
}

}