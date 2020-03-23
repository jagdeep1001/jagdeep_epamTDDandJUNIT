package org.homeTask;
import java.util.*;
public class removeA {
    String ans;
    int l;
    public String remove(String s){
        l=s.length();
        if(l>2){
            if(s.charAt(0)=='A' && s.charAt(1)=='A')
            {
                ans=s.substring(2);
            }
            else if(s.charAt(0)=='A' && s.charAt(1)!='A')
            {
                ans=s.substring(1);
            }
            else if(s.charAt(0)!='A' && s.charAt(1)=='A')
            {
                ans=s.charAt(0)+s.substring(2);
            }
            else if(s.charAt(0)!='A' && s.charAt(1)!='A')
            {
                ans=s;
            }
        }
        else
        {
            if(s.charAt(0)=='A' && s.charAt(1)=='A')
            {
                ans="";
            }
            else if(s.charAt(0)=='A' && s.charAt(1)!='A')
            {
                ans=""+s.charAt(1);
            }
            else if(s.charAt(0)!='A' && s.charAt(1)=='A')
            {
                ans=""+s.charAt(0);
            }
            else
            {
                ans=s;
            }
        }
        return ans;
    }
}
