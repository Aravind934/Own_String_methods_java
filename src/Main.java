import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      OwnString st = new OwnString();
      //1
     // System.out.println(st.charAt("hello",4));
      //2
      //System.out.println(st.codePointAt("He",0));
      //3
        //System.out.println(st.codePointBefore("He",0));
      //4
      //System.out.println(st.codePointCount("hello",2,5));
        // 5
     // System.out.println(st.compareTo("hallo","hello"));
     //6
     //System.out.println(st.compareToIgnoreCase("hEllo","hAllo"));
     //7
     //System.out.println(st.concat("hello","dute"));
     //8
     //System.out.println(st.contains("hello","oi"));
     //9
     //System.out.println(st.equals("hello","hell"));
     //10
//        char[] arr = {'1','2','3','4','5'};
//     System.out.println(st.copyValueOf(arr , 1,5));
     //11
     //System.out.println(st.equalsIgnoreCase("HeLlo","hellk"));
     //12
     //System.out.println(st.startsWith("hello" ,"el"));
     //13 endsWith()
     //System.out.println(st.endsWith("hello","ok"));
        //14
        //System.out.println(Arrays.toString(st.getBytes("ABCD")));
        //15
        /*char[] arr  = new char[10];
        st.getChars("hello Aravinthan how r u",6,16,arr,0);
        for(char x: arr) {
            System.out.println(x);
        }*/
        //16
        //System.out.println(st.hasCode("Hello"));
        //17
        //System.out.println(st.indexOf("hello bro","bro"));
        //18
        //System.out.println(st.lastIndexOf("hello bro bro","bro"));
        //19
        //System.out.println(st.length("hello"));
        //20
        //System.out.println(st.replace("helloll","ll","&&"));
        //21
        //System.out.println(st.replaceAll("helloll","ll","&&"));
        //22
        //System.out.println(Arrays.toString(st.split("hellodutehe" ,"e")));
        //23
        //System.out.println(st.subString("Aravind kumar",7,14));
        //24
        //System.out.println(st.toLowerCase("Aravind"));
        //25
        //System.out.println(st.toUpperCase("ARaVi7nD"));
        //26
        //System.out.println(st.trim("Hello bro how r u?"));
        //27
        //System.out.println(st.isEmpty(""));
        //System.out.println(st.isEmpty("A"));
        //28
        //System.out.println(st.contentEquals("hello","hi"));
        //System.out.println(st.contentEquals("hello","hello"));
        //29
        //System.out.println(st.offsetByCodePoints("hello",2,2));
        //System.out.println(st.offsetByCodePoints("helloo",2,3));
        //30
        //System.out.println(st.toString(200));
        //System.out.println(st.toString("hello"));
        //System.out.println(st.toString('c'));
        //System.out.println(st.toString(false));
        //System.out.println(st.toString(20.9));
        //System.out.println(st.toString(new Car("TATA",100)));
        //31
        //System.out.println(st.format("hello %.2f bro's",123.457));
        //System.out.println(st.format("hello %c bro's",'A'));
        //32
        System.out.println(st.matches("\\s[a-zA-Z]\\d"," &7"));
       //33
       /* char[] arr = st.toCharArray("hello");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
    }
    }
