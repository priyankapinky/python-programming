import java.util.HashMap;
import java.util.Map;
public class IsomorphicString 
{
public static void main(String[] args) 
{
checkIfIsoMorphic("paper", "title");
checkIfIsoMorphic("foo", "app");
checkIfIsoMorphic("foo", "bar");
checkIfIsoMorphic("turtle", "tletur");
checkIfIsoMorphic("add", "egg");
checkIfIsoMorphic("br", "rr");
}
private static void checkIfIsoMorphic(String s1, String s2) 
{
if (s1.length() == s2.length()) 
{
s1 = s1.toLowerCase();
s2 = s2.toLowerCase();
if (s1.equals(s2))
{
System.out.println(s1 + " and " + s2 + " are Isomorphic");
} 
else 
{
boolean isomorphic = true;
Map<Character, Character> map = new HashMap<Character, Character>(0);
for (int i = 0; i < s1.length(); i++) 
{
char c1 = s1.charAt(i);
char c2 = s2.charAt(i);
if (map.containsKey(c1)) 
{
if (map.get(c1) != c2) 
{
isomorphic = false;
break;
}
} 
else 
{
if (map.containsValue(c2)) 
{
isomorphic = false;
break;
} 
else 
{
map.put(c1, c2);
}
}
}
if (isomorphic) 
{
System.out.println(s1 + " and " + s2 + " are Isomorphic");
 } 
 else 
 {
System.out.println(s1 + " and " + s2 + " are not Isomorphic");
}
}
} 
else 
{
System.out.println(s1 + " and " + s2 + " are not Isomorphic");
}
}
}
