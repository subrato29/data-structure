/**
 * 1108. Defanging an IP Address
Easy

801

1285

Add to List

Share
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */
package leetcode_string;

public class DefangIPaddr {

    public String defangIPaddr1(String address) {
        return address.replace(".", "[.]");
    }
    
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                sb.append("[.]");
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}