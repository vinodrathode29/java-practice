import java.util.ArrayList;
public class MyBasicArrayList { 
    public static void main(String[] a) { 
        ArrayList language = new ArrayList(); 
        language.add("JAVA"); 
        language.add("C++"); 
        language.add("PERL"); 
        language.add("PHP"); 
        language.add(2,"PLAY"); 
        System.out.println(language.indexOf("PERL") + " "+language.size()); 
    } 
}