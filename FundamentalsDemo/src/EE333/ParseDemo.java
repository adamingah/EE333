
package EE333;

/**
 *
 * @author gmyers
 */

// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html

public class ParseDemo {
    
    public static boolean ParseIPAddress(String Contents) {
        boolean results = false;
        
        java.util.regex.Pattern regex =   java.util.regex.Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)");
        // alternates: 
        //  java.util.regex.Pattern regex =   java.util.regex.Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");        
        
        // looks at the contents to see if we find the pattern
        java.util.regex.Matcher matcher = regex.matcher( Contents );
        
        if (matcher.find() == true) {
            results = true;

            System.out.println("Count: " + matcher.groupCount());
            
            for (int index = 0; index < matcher.groupCount(); index++ ) {
                System.out.println("  " + matcher.group( index ));
            }           
        } else {
            // nothing... false is the default
        }                                
        return( results );
    }

    public static boolean ParseEmail(String Contents) {
        boolean results = false;
        
        java.util.regex.Pattern regex =   java.util.regex.Pattern.compile("(\\w+@\\w+\\.w+)");
        // looks at the contents to see if we find the pattern
        java.util.regex.Matcher matcher = regex.matcher( Contents );
        
        if (matcher.find() == true) {
            results = true;

            System.out.println("Count: " + matcher.groupCount());
            
            for (int index = 0; index < matcher.groupCount(); index++ ) {
                System.out.println("  " + matcher.group( index ));
            }           
        } else {
            // nothing... false is the default
        }                                
        return( results );     
    }                  
    
    public static boolean ParseMACAddress(String Contents) {
        boolean results = false;
        
        // need to validate Pattern and Contents
        java.util.regex.Pattern regex =   java.util.regex.Pattern.compile("(\\s{2}-\\s{2}-\\s{2}-\\s{2}-\\s{2}-\\s{2})");
        // looks at the contents to see if we find the pattern
        java.util.regex.Matcher matcher = regex.matcher( Contents );
        
        if (matcher.find() == true) {
            results = true;

            System.out.println("Count: " + matcher.groupCount());
            
            for (int index = 0; index < matcher.groupCount(); index++ ) {
                System.out.println("  " + matcher.group( index ));
            }           
        } else {
            // nothing... false is the default
        }                                
        return( results );                
    }
    
public static boolean ParseSettingInfo(String Contents) {
        boolean results = false;
        
        // need to validate Pattern and Contents
        // java.util.regex.Pattern regex =   java.util.regex.Pattern.compile("<SettingInfo>(.*)</SettingInfo>");
        java.util.regex.Pattern regex =   java.util.regex.Pattern.compile("<SettingInfo>(.*)</SettingInfo>", java.util.regex.Pattern.DOTALL);                

        // alternate:
        //  "<([^<>]+)>([^<>]+)</\\1>"
        // looks at the contents to see if we find the pattern
        java.util.regex.Matcher matcher = regex.matcher( Contents );
        
        System.out.println( Contents );
        
        if (matcher.find() == true) {
            results = true;

            System.out.println("Count: " + matcher.groupCount());
            
            for (int index = 0; index < matcher.groupCount(); index++ ) {
                System.out.println("  " + matcher.group( index ));
            }           
        } else {
            // nothing... false is the default
        }                                
        return( results );                
    }    
    
public static boolean ParsePattern(String Pattern, String Contents) {
        boolean results = false;
        
        // need to validate Pattern and Contents
        java.util.regex.Pattern regex =   java.util.regex.Pattern.compile(Pattern);
        // looks at the contents to see if we find the pattern
        java.util.regex.Matcher matcher = regex.matcher( Contents );
        
        if (matcher.find() == true) {
            results = true;

            System.out.println("Count: " + matcher.groupCount());
            
            for (int index = 0; index < matcher.groupCount(); index++ ) {
                System.out.println("  " + matcher.group( index ));
            }           
        } else {
            // nothing... false is the default
        }                                
        return( results );                
    }    
    
}
